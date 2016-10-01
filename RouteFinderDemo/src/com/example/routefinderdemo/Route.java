package com.example.routefinderdemo;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Route extends Activity {

	
	TextView tv1;
	TextView tv2;
	ListView lv;
	String[] test=Stations.data;
	int ptr1,ptr2;
	String lst1,lst2;
	
	List<String> finlist=new ArrayList<String>();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_route);
		
		tv1=(TextView)findViewById(R.id.textView2);
		tv2=(TextView)findViewById(R.id.textView4);
		lv=(ListView)findViewById(R.id.listView1);
		lst1=MainActivity.st1;
		lst2=MainActivity.st2;

		tv1.setText(lst1);
		tv2.setText(lst2);
		
		for(int i =0;i<13;i++)
		{
			if(lst1==test[i])
				
			{
				ptr1=i;
				
			}
			if(lst2==test[i])
			{
				ptr2=i;
			}
		}
		
		if(ptr1<ptr2)
			
		{
			for(int i=ptr1;i<=ptr2;i++)
				
			{
finlist.add(test[i]);
	}
		}
		else if(ptr1>ptr2)
			
		{
			for(int i=ptr1;i>ptr2;i--)
				
			{
				finlist.add(test[i]);

			}
		}
		else
		{
			Toast.makeText(Route.this,"SOURCE and DESTINATION are Same!",111).show();
			
		}
		
		
		ArrayAdapter<String>obj=new ArrayAdapter<String>(Route.this,android.R.layout.simple_list_item_1, finlist);
	
		lv.setAdapter(obj);
		lv.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
				Toast.makeText(Route.this,(String)arg0.getItemAtPosition(arg2), 111).show();
			}
		});
		MainActivity.st1=MainActivity.st2=null;
		
		MainActivity.et1.setText("");
		MainActivity.et2.setText("");
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.route, menu);
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
