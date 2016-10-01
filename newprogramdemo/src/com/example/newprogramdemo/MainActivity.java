package com.example.newprogramdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends Activity {
RadioGroup rg;
	EditText et1,et2;
	RadioButton rb1,rb2,rb3,rb4;
	Button ok;
	static float res;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		et1=(EditText)findViewById(R.id.editText1);
		et2=(EditText)findViewById(R.id.editText2);
		rb1=(RadioButton)findViewById(R.id.radio0);
		rb2=(RadioButton)findViewById(R.id.radio1);
		rb3=(RadioButton)findViewById(R.id.radio2);
		rb4=(RadioButton)findViewById(R.id.radio3);
		ok=(Button)findViewById(R.id.button1);
		rg=(RadioGroup)findViewById(R.id.radioGroup1);
		
ok.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
		float n1,n2;
	String s;
	s=et1.getText().toString();
	n1=Float.parseFloat(s);
	s=et2.getText().toString();
	n2=Float.parseFloat(s);
	
			
			
			if(rg.getCheckedRadioButtonId()==R.id.radio0)
	{
	res=n1+n2;	
	}
	if(rg.getCheckedRadioButtonId()==R.id.radio1)
	{
		res=n1-n2;	
	
	}
	if(rg.getCheckedRadioButtonId()==R.id.radio2)
	{
		res=n1/n2;	
	
	}
	if(rg.getCheckedRadioButtonId()==R.id.radio3)
	{
		res=n1*n2;	

	}
	
	
Intent i=new  Intent(MainActivity.this,Print.class);
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
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
