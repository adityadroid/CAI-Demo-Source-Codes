package com.example.routefinderdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Stations extends Activity {
	
	static String s;
	ListView lv;
	static String[]data={"Ajmer","Kishangarh","Phulera","Jaipur","GandhiNagar","Dausa","Bandikui","Alwar","Khairtaal","Rewari","Gurgaon","Delhi Cantt","Delhi Sarai"};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_stations);
		lv=(ListView )findViewById(R.id.listView1);
		
		ArrayAdapter<String>obj= new ArrayAdapter<String>(Stations.this,android.R.layout.simple_list_item_1,data);
		
		
		lv.setAdapter(obj);
		lv.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
				
				
				
				if(MainActivity.m.isEmpty())
		
				{
					MainActivity.st1=(String)arg0.getItemAtPosition(arg2);
					
			
				Intent i = new Intent(Stations.this,MainActivity.class);
				startActivity(i);
				}
				
				else
				{
					MainActivity.st2=(String)arg0.getItemAtPosition(arg2);
				Intent i2 = new Intent(Stations.this,MainActivity.class);
				startActivity(i2);
				}
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.stations, menu);
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
