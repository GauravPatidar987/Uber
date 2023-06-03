package com.mycompany.myapp;
import android.app.*;
import uk.co.chrisjenx.calligraphy.*;

public class MApp extends Application
{

	@Override
	public void onCreate()
	{
		// TODO: Implement this method
		super.onCreate();
		CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
									  .setDefaultFontPath("fonts/rubik_light.ttf")
									  .setFontAttrId(R.attr.fontPath)
									  .build());
	}
	
}
