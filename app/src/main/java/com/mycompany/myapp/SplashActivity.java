package com.mycompany.myapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;
import io.reactivex.Completable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Action;
import java.util.concurrent.TimeUnit;

public class SplashActivity extends Activity {
	@Override
	protected void onCreate(Bundle arg0) {
		super.onCreate(arg0);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		Completable.timer(1, TimeUnit.SECONDS, AndroidSchedulers.mainThread()).subscribe(new Action() {
			@Override
			public void run() throws Exception {
			Intent i=new Intent(getBaseContext(),MainActivity.class);
			startActivity(i);
			finish();
			}
		});
		setContentView(R.layout.activity_splash);
	}
}
