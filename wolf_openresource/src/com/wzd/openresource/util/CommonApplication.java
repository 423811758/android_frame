package com.wzd.openresource.util;

import android.app.Application;

import com.wzd.openresource.data.GlobalData;

public class CommonApplication extends Application {

	@Override
	public void onCreate() {
		super.onCreate();
		GlobalData.globalContext = getApplicationContext();
	}

}
