package com.example.expensemanager;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {
	Button add,reset;
	EditText item,price;
	TextView ti1,tp1,ti2,tp2,ti3,tp3,ti4,tp4,ti5,tp5,tt;
	int choice=0;
	float sum,p1=0,p2=0,p3=0,p4=0,p5=0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
		add=(Button)findViewById(R.id.button1);
		ti1=(TextView)findViewById(R.id.textView3);
		tp1=(TextView)findViewById(R.id.textView4);
		ti2=(TextView)findViewById(R.id.textView5);
		tp2=(TextView)findViewById(R.id.textView6);
		ti3=(TextView)findViewById(R.id.textView7);
		tp3=(TextView)findViewById(R.id.textView8);	
		ti4=(TextView)findViewById(R.id.textView9);
		tp4=(TextView)findViewById(R.id.textView10);
		ti5=(TextView)findViewById(R.id.textView11);
		tp5=(TextView)findViewById(R.id.textView12);
		tt=(TextView)findViewById(R.id.textView14);
		item=(EditText)findViewById(R.id.editText1);
		price=(EditText)findViewById(R.id.editText2);
		reset=(Button)findViewById(R.id.button2);
		
		
		reset.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				ti1.setText(null);
				tp1.setText(null);
				ti2.setText(null);
				tp2.setText(null);
				ti3.setText(null);
				tp3.setText(null);
				ti4.setText(null);
				tp4.setText(null);
				ti5.setText(null);
				tp5.setText(null);
				tt.setText(null);
				item.setText(null);
				price.setText(null);
				choice=0;
				sum=0;
				p1=0;
				p2=0;
				p3=0;
				p4=0;
				p5=0;
				
				
			}
		});
		
		
		
		add.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
		String it,pr;
		if(item.getText().toString()==null||
		price.getText().toString()==null)
		{
		Toast.makeText(MainActivity.this,"Enter Something First!", Toast.LENGTH_SHORT).show();
		
			
		}
		else
		{
			it=item.getText().toString();
			pr=price.getText().toString();
			choice++;
			push(choice);
			
		}
			
			
			
			}
		});
		
		
		
	}
	
	
	public void push(int choice)
	
	{
		{if(choice==1)
		{
			ti1.setText(item.getText().toString());
			tp1.setText(price.getText().toString());
			
			
		}
		else if(choice==2)
		{
			ti2.setText(item.getText().toString());
			tp2.setText(price.getText().toString());
			
			
		}
		
		else if(choice==3)
		{
			ti3.setText(item.getText().toString());
			tp3.setText(price.getText().toString());
			
			
		}
		
		else if(choice==4)
		{
			ti4.setText(item.getText().toString());
			tp4.setText(price.getText().toString());
			
			
		}
		else if(choice==5)
		{
			ti5.setText(item.getText().toString());
			tp5.setText(price.getText().toString());
			
			
		}
		
		else
		{
			Toast.makeText(MainActivity.this,"Overflow Reached!",Toast.LENGTH_SHORT).show();
			
		}
		
		
		
		}
		
		
		
		String s;
		
		if(choice==1)
		{
	
		s=price.getText().toString();
		p1=Float.parseFloat(s);
		
		
		
		}
		else if(choice==2)
		{
	
		s=price.getText().toString();
		p2=Float.parseFloat(s);
		
		
		
		}
		
		else if(choice==3)
		{
	
		s=price.getText().toString();
		p3=Float.parseFloat(s);
		
		
		
		}
		
		else if(choice==4)
		{
	
		s=price.getText().toString();
		p4=Float.parseFloat(s);
		
		
		
		}
		
		else if(choice==5)
		{
	
		s=price.getText().toString();
		p5=Float.parseFloat(s);
		
		
		
		}
		
		
		sum=p1+p2+p3+p4+p5;
		
		String set;
		set=String.valueOf(sum);
		tt.setText(set);
		item.setText(null);
		price.setText(null);
		
		
		
		
		
		
		
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
