/**
 * Aptana Studio
 * Copyright (c) 2005-2011 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the GNU Public License (GPL) v3 (with exceptions).
 * Please see the license.html included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */
package com.aptana.editor.common.preferences;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS
{
	private static final String BUNDLE_NAME = "com.aptana.editor.common.preferences.messages"; //$NON-NLS-1$

	public static String CommonEditorPreferencePage_auto_indent_label;

	public static String CommonEditorPreferencePage_Default_Editor_Preference_Link;
	public static String CommonEditorPreferencePage_Editor_Preferences;

	public static String CommonEditorPreferencePage_LBL_TabPolicy;
	public static String CommonEditorPreferencePage_Tab_Size_Label;
	public static String CommonEditorPreferencePage_Text_Editing_Label;
	public static String CommonEditorPreferencePage_UseDefaultOption;
	public static String CommonEditorPreferencePage_UseSpacesOption;
	public static String CommonEditorPreferencePage_UseTabOption;

	public static String TasksPreferencePage_CaseSensitiveLabel;
	public static String TasksPreferencePage_Description;
	public static String TasksPreferencePage_EditTagTitle;
	public static String TasksPreferencePage_NewTagTitle;
	public static String TasksPreferencePage_PriorityColumnHeader;
	public static String TasksPreferencePage_TagNameColumnHeader;
	public static String TaskTagInputDialog_NameLabel;
	public static String TaskTagInputDialog_NonEmptyNameError;
	public static String TaskTagInputDialog_PriorityLabel;
	public static String TaskTagInputDialog_UniqueNameError;
	public static String UserAgentPreferencePage_Select_All;
	public static String UserAgentPreferencePage_Select_None;
	public static String UserAgentPreferencePage_Select_User_Agents;

	public static String EditorsPreferencePage_Close_Matching_Character_Pairs;
	public static String EditorsPreferencePage_Colorize_Matching_Character_Pairs;
	public static String EditorsPreferencePage_Content_Assist;
	public static String EditorsPreferencePage_Content_Assist_Auto_Display;
	public static String EditorsPreferencePage_Content_Assist_Short_Delay;
	public static String EditorsPreferencePage_Content_Assist_Auto_Insert;
	public static String EditorsPreferencePage_Formatting;
	public static String EditorsPreferencePage_HomeEndBehavior;
	public static String EditorsPreferencePage_JumpsStartEnd;
	public static String EditorsPreferencePage_MarkOccurrences;
	public static String EditorsPreferencePage_PreferenceDescription;
	public static String EditorsPreferencePage_ToggleBetween;
	public static String EditorsPreferencePage_Typing;
	public static String EditorsPreferencePage_GeneralTextEditorPrefLink;

	public static String ValidationPreferencePage_ERR_EmptyExpression;
	public static String ValidationPreferencePage_Filter_Description;
	public static String ValidationPreferencePage_Ignore_Message;
	public static String ValidationPreferencePage_Ignore_Title;
	public static String ValidationPreferencePage_LBL_Filter;
	public static String ValidationPreferencePage_LBL_Validators;

	static
	{
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages()
	{
	}
}
