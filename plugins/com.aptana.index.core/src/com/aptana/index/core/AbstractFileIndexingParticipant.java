package com.aptana.index.core;

import java.io.File;
import java.net.URI;

import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;

public abstract class AbstractFileIndexingParticipant implements IFileStoreIndexingParticipant
{

	private static final String EXTERNAL_URI = "uri"; //$NON-NLS-1$

	protected void createTask(IFileStore store, String message, int priority, int line, int start, int end)
	{
		try
		{
			IResource resource = getResource(store);
			IMarker marker = resource.createMarker(IMarker.TASK);
			if (resource.equals(ResourcesPlugin.getWorkspace().getRoot()))
			{
				marker.setAttribute(EXTERNAL_URI, store.toURI().toString());
			}
			marker.setAttribute(IMarker.MESSAGE, message);
			marker.setAttribute(IMarker.PRIORITY, priority);
			marker.setAttribute(IMarker.LINE_NUMBER, line);
			marker.setAttribute(IMarker.CHAR_START, start);
			marker.setAttribute(IMarker.CHAR_END, end);
		}
		catch (CoreException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private IResource getResource(IFileStore store)
	{
		URI uri = store.toURI();
		if (uri.getScheme().equals("file"))
		{
			File file = new File(uri);
			IFile iFile = ResourcesPlugin.getWorkspace().getRoot()
					.getFileForLocation(Path.fromOSString(file.getAbsolutePath()));
			if (iFile != null)
			{
				return iFile;
			}
		}
		return ResourcesPlugin.getWorkspace().getRoot();
	}

	protected void removeTasks(IFileStore store) throws CoreException
	{
		URI uri = store.toURI();
		String uriString = uri.toString();

		IResource resource = getResource(store);
		if (resource.equals(ResourcesPlugin.getWorkspace().getRoot()))
		{
			// Iterate over markers on the root and remove any with matching "uri"
			IMarker[] tasks = resource.findMarkers(IMarker.TASK, true, IResource.DEPTH_ZERO);
			for (IMarker task : tasks)
			{
				if (task == null)
				{
					continue;
				}
				String markerURI = (String) task.getAttribute(EXTERNAL_URI);
				if (markerURI == null)
				{
					continue;
				}
				if (markerURI.equals(uriString))
				{
					task.delete();
				}
			}
		}
		else
		{
			resource.deleteMarkers(IMarker.TASK, true, IResource.DEPTH_ZERO);
		}
	}

}
