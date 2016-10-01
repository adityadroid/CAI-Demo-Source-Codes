package com.example.examiner;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {
RadioButton rb1;
RadioGroup rg1;
Button ok;
TextView tv;
int marks=0;

	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		rg1=(RadioGroup)findViewById(R.id.radioGroup1);
		
		ok =(Button)findViewById(R.id.button1);
		rb1=(RadioButton)findViewById(rg1.getCheckedRadioButtonId());
		tv=(TextView)findViewById(R.id.textView4);
	ok.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			
			String st;
			st=(String)rb1.getText().toString();
			
			
			if(st.equals("adi"))
			{
				marks=marks+1;
				Toast.makeText(MainActivity.this,"Correct Answer!",Toast.LENGTH_SHORT).show();

			}
			else
			{
				Toast.makeText(MainActivity.this,"Wrong Answer!",Toast.LENGTH_SHORT).show();

			}
			
		
			
			st = String.valueOf(marks);
			
		
			tv.setText(st);
			

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
