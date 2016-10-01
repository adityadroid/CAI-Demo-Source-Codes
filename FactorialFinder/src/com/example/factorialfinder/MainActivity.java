package com.example.factorialfinder;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	Button b;
	EditText et;
	TextView tv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		b = (Button)findViewById(R.id.button1);
		et = (EditText)findViewById(R.id.editText1);
		tv = (TextView)findViewById(R.id.textView2);
		b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String s1 = et.getText().toString();
				int a = Integer.parseInt(s1);
				int b=a;
				a=a-1;
				while(a>0)
				{
					b=b*a;
					a=a-1;
				}
				String s2 = String.valueOf(b);
				tv.setText(s2);
				et.setText(null);
				
				
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
