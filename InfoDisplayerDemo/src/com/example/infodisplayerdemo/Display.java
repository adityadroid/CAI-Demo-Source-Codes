package com.example.infodisplayerdemo;

import org.w3c.dom.Text;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Display extends Activity {

	
	Button b;
	TextView tv1,tv2,tv3,tv4,tv5;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_display);
		
		
		b=(Button)findViewById(R.id.button1);
		tv1=(TextView)findViewById(R.id.textView2);
		tv2=(TextView)findViewById(R.id.textView3);

		tv3=(TextView)findViewById(R.id.textView4);

		tv4=(TextView)findViewById(R.id.textView5);

		tv5=(TextView)findViewById(R.id.textView6);

		tv1.setText(MainActivity.s1);
		tv2.setText(MainActivity.s2);
		tv3.setText(MainActivity.s3);
		tv4.setText(MainActivity.s4);
		tv5.setText(MainActivity.s5);
		
		
		b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i = new Intent(Display.this,MainActivity.class);
				startActivity(i);
			}
		});
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.display, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
