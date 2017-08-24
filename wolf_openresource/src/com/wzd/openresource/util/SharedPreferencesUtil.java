package com.wzd.openresource.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
/**
 * <p>Title: 文件保存类        </p>
 * <p>Description: 
 * This is a change object in SysLog
 * </p>
 */
public class SharedPreferencesUtil {

	public static final String TAG = "SharedPreferencesUtil";
	private static final String PREFERENT_NAME_DEFAULT = "preferent0x";

	public static String getValue(Context context, String key) {
		return getValue(context, key, PREFERENT_NAME_DEFAULT);
	}

	public static String getValue(Context context, String key, String preferentName) {
		if (TextUtils.isEmpty(preferentName)) {
			Log.w(TAG, "preferentName is null...");
			preferentName = PREFERENT_NAME_DEFAULT;
		}
		SharedPreferences settings = context.getSharedPreferences(preferentName,
				Context.MODE_PRIVATE);
		return settings.getString(key, "");
	}

	public static void setValue(Context context, String key, String value) {
		setValue(context, key, value, PREFERENT_NAME_DEFAULT);
	}

	public static void setValue(Context context, String key, String value, String preferentName) {

		if (TextUtils.isEmpty(preferentName)) {
			Log.w(TAG, "preferentName is null...");
			preferentName = PREFERENT_NAME_DEFAULT;
		}

		SharedPreferences settings = context.getSharedPreferences(preferentName,
				Context.MODE_PRIVATE);
		SharedPreferences.Editor editor = settings.edit();
		editor.putString(key, value);
		editor.commit();
	}

	/**
	 * @exception boolean operator
	 * @param context
	 * @param key
	 */
	public static boolean getBoolean(Context context, String key, String preferentName,
			boolean defaultBoolean) {
		if (TextUtils.isEmpty(preferentName)) {
			Log.w(TAG, "preferentName is null...");
			preferentName = PREFERENT_NAME_DEFAULT;
		}
		SharedPreferences settings = context.getSharedPreferences(preferentName,
				Context.MODE_PRIVATE);
		return settings.getBoolean(key, defaultBoolean);
	}

	public static boolean getBoolean(Context context, String key) {
		return getBoolean(context, key, PREFERENT_NAME_DEFAULT, Boolean.FALSE);
	}

	public static boolean getBoolean(Context context, String key, boolean defaultBoolean) {
		return getBoolean(context, key, PREFERENT_NAME_DEFAULT, defaultBoolean);
	}

	public static void setBoolean(Context context, String key, Boolean value) {
		setBoolean(context, key, value, PREFERENT_NAME_DEFAULT);
	}

	public static void setBoolean(Context context, String key, Boolean value, String preferentName) {
		if (TextUtils.isEmpty(preferentName)) {
			Log.w(TAG, "preferentName is null...");
			preferentName = PREFERENT_NAME_DEFAULT;
		}
		SharedPreferences settings = context.getSharedPreferences(preferentName,
				Context.MODE_PRIVATE);
		SharedPreferences.Editor editor = settings.edit();
		editor.putBoolean(key, value.booleanValue());
		editor.commit();
	}

	/**
	 * @exception int operator
	 * @param context
	 * @param key
	 */
	public static int getInteger(Context context, String key, Integer defValue) {
		int value = getInteger(context, key);
		return value == 0 ? defValue : value;
	}

	public static int getInteger(Context context, String key) {
		return getInteger(context, key, PREFERENT_NAME_DEFAULT);
	}

	public static int getInteger(Context context, String key, String preferentName) {
		if (TextUtils.isEmpty(preferentName)) {
			Log.w(TAG, "preferentName is null...");
			preferentName = PREFERENT_NAME_DEFAULT;
		}
		SharedPreferences settings = context.getSharedPreferences(preferentName,
				Context.MODE_PRIVATE);
		return settings.getInt(key, 0);
	}

	public static void setInteger(Context context, String key, Integer value) {
		setInteger(context, key, value, PREFERENT_NAME_DEFAULT);
	}

	public static void setInteger(Context context, String key, Integer value, String preferentName) {
		if (TextUtils.isEmpty(preferentName)) {
			Log.w(TAG, "preferentName is null...");
			preferentName = PREFERENT_NAME_DEFAULT;
		}
		SharedPreferences settings = context.getSharedPreferences(preferentName,
				Context.MODE_PRIVATE);
		SharedPreferences.Editor editor = settings.edit();
		editor.putInt(key, value);
		editor.commit();
	}
	
	public static void setLong(Context context, String key, Long value) {
		setLong(context, key, value, PREFERENT_NAME_DEFAULT);
	}
	
	public static void setLong(Context context, String key, Long value, String preferentName) {
		if (TextUtils.isEmpty(preferentName)) {
			Log.w(TAG, "preferentName is null...");
			preferentName = PREFERENT_NAME_DEFAULT;
		}
		SharedPreferences settings = context.getSharedPreferences(preferentName,
				Context.MODE_PRIVATE);
		SharedPreferences.Editor editor = settings.edit();
		editor.putLong(key, value);
		editor.commit();
	}
	
	public static Long getLong(Context context, String key, long defaultValue, String preferentName) {
		if (TextUtils.isEmpty(preferentName)) {
			Log.w(TAG, "preferentName is null...");
			preferentName = PREFERENT_NAME_DEFAULT;
		}
		SharedPreferences settings = context.getSharedPreferences(preferentName,
				Context.MODE_PRIVATE);
		return settings.getLong(key, defaultValue);
	}
	
	public static Long getLong(Context context, String key) {
		return getLong(context, key, 0, PREFERENT_NAME_DEFAULT);
	}
	
	public static Long getLong(Context context, String key, long defaultValue) {
		return getLong(context, key, defaultValue, PREFERENT_NAME_DEFAULT);
	}
}
