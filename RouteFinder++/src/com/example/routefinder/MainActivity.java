package com.example.routefinder;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

public class MainActivity extends Activity {

	
	AutoCompleteTextView tv1,tv2;

	 Button b;
	 static String st1,st2;

static String[] data={"Jaipur","Ajmer","Jodhpur","Udaipur"};


@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		tv1=(AutoCompleteTextView)findViewById(R.id.autoCompleteTextView1);
		tv2=(AutoCompleteTextView)findViewById(R.id.autoCompleteTextView2);
		b=(Button)findViewById(R.id.button1);
		
		
		
		ArrayAdapter<String>obj=new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_dropdown_item_1line,data);
		tv1.setThreshold(1);
		tv1.setAdapter(obj);
		tv1.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
			st1=(String) arg0.getItemAtPosition(arg2);
			
			}
		});
		
		tv2.setThreshold(1);
		tv2.setAdapter(obj);
		tv2.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
				st2=(String) arg0.getItemAtPosition(arg2);

			}
		});
		
		
		b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				
				Intent i = new Intent(MainActivity.this,Route.class);
				startActivity(i);
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.about) {
			
			Intent i2 = new Intent(MainActivity.this,About.class);
			startActivity(i2);
			
			return true;
			
		}
		else if (id == R.id.exit) {
			
			finish();
			System.exit(0);
			
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
