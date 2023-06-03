package com.mycompany.myapp;

import android.app.*;
import android.os.*;
import android.view.Window;
import android.view.WindowManager;
import android.graphics.*;
import io.reactivex.Completable;
import java.util.concurrent.*;
import io.reactivex.android.schedulers.*;
import io.reactivex.functions.*;
import uk.co.chrisjenx.calligraphy.*;
import android.content.*;
import androidx.appcompat.app.*;
import androidx.appcompat.widget.*;

public class MainActivity extends AppCompatActivity
{
	Toolbar ttb;
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);

		setContentView(R.layout.main);
		ttb = findViewById(R.id.tool);
		setSupportActionBar(ttb);
	}

	@Override
	protected void attachBaseContext(Context newBase)
	{
		// TODO: Implement this method
		super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
	}

}
