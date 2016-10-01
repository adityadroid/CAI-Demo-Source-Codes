package com.example.prodialer;


import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.provider.ContactsContract.PhoneLookup;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.Toast;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;

public class MainActivity extends Activity {
Button b1,b2,b3,b4,b5,b6,b7,b8,b9,bs,b0,bh,bdel,bcon,btest;
ImageButton call;
RelativeLayout lay;
View sp1,sp2;	
private static final int CONTACT_PICKER_RESULT = 1001;
static String[] data={"9928981600","9284928395","8729298128","8383749382","9228485334","77292902092","8192938483"};
static String s;
static AutoCompleteTextView et;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		b1=(Button)findViewById(R.id.button1);
		b2=(Button)findViewById(R.id.button2);
		b3=(Button)findViewById(R.id.button3);
		b4=(Button)findViewById(R.id.button4);
		b5=(Button)findViewById(R.id.button5);
		b6=(Button)findViewById(R.id.button6);
		b7=(Button)findViewById(R.id.button7);
		b8=(Button)findViewById(R.id.button8);
		b9=(Button)findViewById(R.id.button9);
		bs=(Button)findViewById(R.id.button10);
		b0=(Button)findViewById(R.id.button11);
		bh=(Button)findViewById(R.id.button12);
		bdel=(Button)findViewById(R.id.button13);
		bcon=(Button)findViewById(R.id.button14);
		btest=(Button)findViewById(R.id.button15);
		lay=(RelativeLayout)findViewById(R.layout.activity_main);
		et=(AutoCompleteTextView)findViewById(R.id.editText1);
call=(ImageButton)findViewById(R.id.imageButton1);
sp1=(View)findViewById(R.drawable.shape);	
sp2=(View)findViewById(R.drawable.shape2);	
ArrayAdapter<String>obj=new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_dropdown_item_1line,data);
et.setThreshold(1);
et.setAdapter(obj);
et.setOnItemClickListener(new OnItemClickListener() {

	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		// TODO Auto-generated method stub
		
		
		s=(String)arg0.getItemAtPosition(arg2);
		
	}
});
b1.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			et.append("1");
		}
	});
b2.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			et.append("2");

		}
	});
b3.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		et.append("3");

	}
});
b4.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		et.append("4");

	}
});
b5.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		et.append("5");

	}
});
b6.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		et.append("6");

	}
});
b7.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		et.append("7");

	}
});
b8.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		et.append("8");

	}
});
b9.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		et.append("9");

	}
});
bs.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		et.append("*");

	}
});
b0.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		et.append("0");

	}
});
b0.setOnLongClickListener(new OnLongClickListener() {
	
	@Override
	public boolean onLongClick(View arg0) {
		// TODO Auto-generated method stub
		et.append("+");
		return false;
	}
});


bh.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		et.append("#");

	}
});
bcon.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent i2=new Intent(MainActivity.this,Contacts.class);
		startActivity(i2);
	}
});
et.setText(s);

bdel.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		 s=et.getText().toString();
		if(s.isEmpty())
		{
			//Toast.makeText(MainActivity.this, "Enter Number!", 111).show();
			AlertDialog d = new AlertDialog.Builder(MainActivity.this).create();
			d.setTitle("Empty Response");
			d.setMessage("Enter Some Number!");
			d.setButton("OK", new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface arg0, int arg1) {
					// TODO Auto-generated method stub
					
				}
			});
			
			d.show();
			
		}
		else
		{
			
		
		String cd=s.substring(0,s.length()-1);
		et.setText(cd);
		}

	}
});
bdel.setOnLongClickListener(new OnLongClickListener() {
	
	@Override
	public boolean onLongClick(View arg0) {
		// TODO Auto-generated method stub
		
		
		
		et.setText(null);

		return false;
	}
});


call.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		 s=et.getText().toString();
		if(s.isEmpty())
		{
			
		//	AlertDialog d= new AlertDialog.Builder(MainActivity.this).create();
			//d.setTitle("Empty Response");
			//d.setMessage("Enter a Number!");
			
			//Toast.makeText(MainActivity.this, "Enter Number!", 111).show();
			AlertDialog d = new AlertDialog.Builder(MainActivity.this).create();
			d.setTitle("Empty Response");
			d.setMessage("Enter Some Number!");
			d.setButton("OK", new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface arg0, int arg1) {
					// TODO Auto-generated method stub
					
				}
			});
			
			d.show();
		}
		else
		{
		Intent i = new Intent(Intent.ACTION_CALL,Uri.parse("tel:"+s));
		startActivity(i);
		}
	}
});
call.setOnLongClickListener(new OnLongClickListener() {
	
	@Override
	public boolean onLongClick(View v) {
		// TODO Auto-generated method stub
		s=et.getText().toString();

		if(s.isEmpty())
		{
		//Toast.makeText(MainActivity.this, "Enter Number!", 111).show();	
		
			AlertDialog d = new AlertDialog.Builder(MainActivity.this).create();
			d.setTitle("Empty Response");
			d.setMessage("Enter Some Number!");
			d.setButton("OK", new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface arg0, int arg1) {
					// TODO Auto-generated method stub
					
				}
			});
			
			d.show();
		}
		else
		{
		Intent i = new Intent(MainActivity.this,Send_sms.class);
		startActivity(i);
		}
		return false;
	}
});

btest.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		Intent i = new Intent();
		i.setAction(Intent.ACTION_VIEW);
		i.setData(ContactsContract.Contacts.CONTENT_URI);
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
		if (id == R.id.theme) {
			lay.setBackgroundResource(Color.parseColor("#B0C4DE"));
			
			//lay.setBackgroundColor(Color.parseColor("#B0C4DE"));
			//sp1.setBackgroundColor(Color.parseColor("#A9A9A9"));
			//sp2.setBackgroundColor(Color.parseColor("DCDCDC"));
			Intent i=new Intent(MainActivity.this,MainActivity.class);
			startActivity(i);
			return true;
		}
		else if(id==R.id.about)
		{
		Intent i=new Intent(MainActivity.this,About.class);
		startActivity(i);
		
		}
		else if(id==R.id.exit)
		{
		finish();
		System.exit(0);
		
		}
		return super.onOptionsItemSelected(item);
	}
}
