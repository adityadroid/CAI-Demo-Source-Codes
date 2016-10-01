package com.example.calcaddsub;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	Button b1,b2;
	EditText et1,et2;
	TextView tv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		b1 = (Button)findViewById(R.id.button1);
		b2 = (Button)findViewById(R.id.button2);
		tv = (TextView)findViewById(R.id.textView3);
		et1 = (EditText)findViewById(R.id.editText1);
		et2 = (EditText)findViewById(R.id.editText2);
		
		b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String s1 = et1.getText().toString();
				String s2 = et2.getText().toString();
				String s3;
				int a,b,c;
				a = Integer.parseInt(s1);
				b = Integer.parseInt(s2);
				c = a+b;
				s3 = String.valueOf(c);
				tv.setText(s3);
				et1.setText(null);
				et2.setText(null);
				
				
			}
		});
b2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String s1 = et1.getText().toString();
				String s2 = et2.getText().toString();
				String s3;
				int a,b,c;
				a = Integer.parseInt(s1);
				b = Integer.parseInt(s2);
				c = a-b;
				s3 = String.valueOf(c);
				tv.setText(s3);
				et1.setText(null);
				et2.setText(null);
				
				
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
