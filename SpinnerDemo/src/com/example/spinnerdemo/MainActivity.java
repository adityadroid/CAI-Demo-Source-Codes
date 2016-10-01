package com.example.spinnerdemo;

import java.util.Set;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends Activity {

	String[] s1={"Select State","Andhra Pradesh",
			




			"Arunachal Pradesh"
			,	


			"Assam",
				


			"Bihar"
				

,

			"Chhattisgarh",
				



			"Goa",
				


			"Gujarat",
				



			"Haryana",
				


			"Himachal Pradesh",
				



			"Jammu & Kashmir",
				

			"Jharkhand",
				



			"Karnataka",
				



			"Kerala",
				


			"Madhya Pradesh",
				


			"Maharashtra"
				};
	
	String[] s2={


"Hyderabad ",
	

	
"Itanagar",
	


"Dispur",
	

	

"Patna",
	

"Raipur",
	

	

"Panaji",
	

	

"Gandhinagar",
	


	

"Chandigarh ",
	

	

"Shimla",
	



"Srinagar", 
	


	

"Ranchi",
	
	

"Bangalore",
	


	

"Thiruvananthapuram",
	



"Bhopal",
	


	

"Mumbai",
	};
	Spinner sp;
	EditText et;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		sp=(Spinner)findViewById(R.id.spinner1);
		et=(EditText)findViewById(R.id.editText1);
		
		
		
		ArrayAdapter<String> obj=new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_dropdown_item_1line,s1);
		sp.setAdapter(obj);
		
		
		
		
		sp.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				// TODO Auto-generated method stub
				
				if(arg2!=0)
					{
					String s3=s2[arg2-1];
				et.setText(s3);
					}
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				
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
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
