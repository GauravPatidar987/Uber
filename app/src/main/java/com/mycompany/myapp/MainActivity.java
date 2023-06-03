package com.mycompany.myapp;

import android.os.*;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.WindowManager;
import android.graphics.*;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.material.snackbar.Snackbar;
import io.reactivex.Completable;
import java.util.concurrent.*;
import io.reactivex.android.schedulers.*;
import io.reactivex.functions.*;
import uk.co.chrisjenx.calligraphy.*;
import android.content.*;
import androidx.appcompat.app.*;
import androidx.appcompat.widget.*;

public class MainActivity extends AppCompatActivity {
	Toolbar ttb;
	private String phone;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.main);
		ttb = findViewById(R.id.tool);
		setSupportActionBar(ttb);
	}

	@Override
	protected void attachBaseContext(Context newBase) {
		// TODO: Implement this method
		super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
	}

	public void loginWithPhone(View v) {
		AlertDialog.Builder ab = new AlertDialog.Builder(this);
		ab.setTitle("Login");
		ab.setMessage("Enter your phone number");
		View vv = LayoutInflater.from(getBaseContext()).inflate(R.layout.layout_phone_edit, null);
		final EditText edPhone = vv.findViewById(R.id.edt_phone);

		ab.setView(vv);

		ab.setPositiveButton("ok", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int id) {
				if (edPhone.getText().toString().length() == 10) {
					phone = edPhone.getText().toString();
				} else {
					Snackbar s = Snackbar.make(findViewById(R.id.rel), "Invalid Phone Number", Snackbar.LENGTH_LONG);
					View snackbarView = s.getView();
					snackbarView.setPadding(0, 0, 0, 32);
					s.setTextColor(Color.parseColor("#50ffffff"));
					s.show();
				}
			}
		});
		ab.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int id) {
			}
		});
		ab.show();
	}

	public void loginWithGoogle(View v) {

	}
}
