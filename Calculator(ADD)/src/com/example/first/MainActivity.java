package com.example.first;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	Button add;
	EditText e1;
	EditText e2;
	TextView tv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		add = (Button)findViewById(R.id.button1);
		e1 = (EditText)findViewById(R.id.editText1);
		e2 = (EditText)findViewById(R.id.editText2);
		tv = (TextView)findViewById(R.id.textView3);
		
		add.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String s1,s2;
				s1 = e1.getText().toString();
				s2 = e2.getText().toString();
				int a,b,c;
				a = Integer.parseInt(s1);
				b = Integer.parseInt(s2);
				c = a + b;
				String s3 = String.valueOf(c);
				tv.setText(s3);
				e1.setText(null);
				e2.setText(null);
				
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
