package com.example.infodisplayerdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

	
	Button b;
	EditText et1,et2,et3,et4,et5;
	int check=0;
	
	static String s1,s2,s3,s4,s5;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		b=(Button)findViewById(R.id.button1);
		et1=(EditText)findViewById(R.id.editText1);
		et2=(EditText)findViewById(R.id.editText2);

		et3=(EditText)findViewById(R.id.editText3);

		et4=(EditText)findViewById(R.id.editText4);

		et5=(EditText)findViewById(R.id.editText5);

	b.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			
			s1=et1.getText().toString();
			s2=et2.getText().toString();
			s3=et3.getText().toString();
			s4=et4.getText().toString();
			s5=et5.getText().toString();
			if(et1.getText().toString().equals(""))
			{
			check=check+1;	
			}
			
			if(et2.getText().toString().equals(""))
			{
			check=check+1;	
			}
			
			 if(et3.getText().toString().equals(""))
			{
			check=check+1;	
			}
			 
			if(et4.getText().toString().equals(""))
			{
			check=check+1;	
			}
			
			if(et5.getText().toString().equals(""))
			{
			check=check+1;	
			}
			
			if(check<3)
			{
				
				Intent i = new Intent(MainActivity.this,Display.class);
				startActivity(i);
				}
			else
			{
				Toast.makeText(MainActivity.this, "Minimum Three Fields Required!",111).show();
		
}
			
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
