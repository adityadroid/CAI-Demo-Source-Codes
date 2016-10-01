package com.example.hotelmenu;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
CheckBox ck1,ck2,ck3,ck4,ck5,ck6,ck7,ck8;
Button ok;
EditText et1,et2,et3,et4,et5,et6,et7,et8;
TextView bill;
float amount=0;

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	ck1=(CheckBox)findViewById(R.id.checkBox1);
	ck2=(CheckBox)findViewById(R.id.checkBox2);
	ck3=(CheckBox)findViewById(R.id.checkBox3);
	ck4=(CheckBox)findViewById(R.id.checkBox4);
	ck5=(CheckBox)findViewById(R.id.checkBox5);
	ck6=(CheckBox)findViewById(R.id.checkBox6);
	ck7=(CheckBox)findViewById(R.id.checkBox7);
	ck8=(CheckBox)findViewById(R.id.checkBox8);
	et1=(EditText)findViewById(R.id.editText1);
	et2=(EditText)findViewById(R.id.editText2);
	et3=(EditText)findViewById(R.id.editText3);
	et4=(EditText)findViewById(R.id.editText4);
	et5=(EditText)findViewById(R.id.editText5);
	et6=(EditText)findViewById(R.id.editText6);
	et7=(EditText)findViewById(R.id.editText7);
	et8=(EditText)findViewById(R.id.editText8);

	ok=(Button)findViewById(R.id.button1);
	bill =(TextView)findViewById(R.id.textView4);
	
	ok.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			String st;
			float add;
			if(ck1.isChecked())
			{
			 st=et1.getText().toString();
			 if(st.equals(""))
			 {
				 Toast.makeText(MainActivity.this,"Enter Quantity!", Toast.LENGTH_SHORT).show();
			 }
			 else
			 {
				 Toast.makeText(MainActivity.this,""+ck1.getText().toString(), 111).show();

			 add = Float.parseFloat(st);
			 add= add*6;
			 amount = amount + add;
			 add=0;
			 }	
			}
			if(ck2.isChecked())
			{
				 st=et2.getText().toString();
				 if(st.equals(""))
				 {
					 Toast.makeText(MainActivity.this,"Enter Quantity!", Toast.LENGTH_SHORT).show();
				 }
				 else
				 {
					 
						Toast.makeText(MainActivity.this,""+ck2.getText().toString(), 111).show();

				 add = Float.parseFloat(st);
				 add= add*8;
				 
				 amount = amount + add;
				 add=0;
				 }
			}
			if(ck3.isChecked())
			{
				 st=et3.getText().toString();
				 if(st.equals(""))
				 {
					 Toast.makeText(MainActivity.this,"Enter Quantity!", Toast.LENGTH_SHORT).show();
				 }
				 else
				 {
						Toast.makeText(MainActivity.this,""+ck3.getText().toString(), 111).show();

				 add = Float.parseFloat(st);
				 add= add*8;
				 if(st.equals(""))
				 
				 amount = amount + add;
				 add=0;
				 }
			}
			if(ck4.isChecked())
			{
				 st=et4.getText().toString();
				 if(st.equals(""))
				 {
					 Toast.makeText(MainActivity.this,"Enter Quantity!", Toast.LENGTH_SHORT).show();
				 }
				 else
				 {
						Toast.makeText(MainActivity.this,""+ck4.getText().toString(), 111).show();

				 add = Float.parseFloat(st);
				 add= add*5;
				 amount = amount + add;
				 add=0;
				 }
			}
			if(ck5.isChecked())
			{
				 st=et5.getText().toString();
				 if(st.equals(""))
				 {
					 Toast.makeText(MainActivity.this,"Enter Quantity!", Toast.LENGTH_SHORT).show();
				 }
				 else
				 {
						Toast.makeText(MainActivity.this,""+ck5.getText().toString(), 111).show();

				 add = Float.parseFloat(st);
				 add= add*120;

				 amount = amount + add;
				 add=0;
				 }
			}
			if(ck6.isChecked())
			{
				 st=et6.getText().toString();
				 if(st.equals(""))
				 {
					 Toast.makeText(MainActivity.this,"Enter Quantity!", Toast.LENGTH_SHORT).show();
				 }
				 else
				 {
						Toast.makeText(MainActivity.this,""+ck6.getText().toString(), 111).show();

				 
				 add = Float.parseFloat(st);
				 add= add*100;

				 amount = amount + add;
				 add=0;
				 }
			}
			if(ck7.isChecked())
			{
				 st=et7.getText().toString();
				 if(st.equals(""))
				 {
					 Toast.makeText(MainActivity.this,"Enter Quantity!", Toast.LENGTH_SHORT).show();
				 }
				 else
				 {
						Toast.makeText(MainActivity.this,""+ck7.getText().toString(), 111).show();

				 add = Float.parseFloat(st);
				 add= add*80;

				 amount = amount + add;
				 add=0;
				 }
			}
			if(ck8.isChecked())
			{
				 st=et8.getText().toString();
				 if(st.equals(""))
				 {
					 Toast.makeText(MainActivity.this,"Enter Quantity!", Toast.LENGTH_SHORT).show();
				 }
				 else
				 {
						Toast.makeText(MainActivity.this,""+ck8.getText().toString(), 111).show();

				 
				 add = Float.parseFloat(st);
				 add= add*80;

				 amount = amount + add;
				 add=0;
				 }
				 
			}
			st = String.valueOf(amount);
			
		bill.setText(st);
		amount=0;	
		et1.setText("");
		et2.setText("");	

		et3.setText("");	

		et4.setText("");	

		et5.setText("");	

		et6.setText("");	

		et7.setText("");	

		et8.setText("");	

		

		
			
			
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
