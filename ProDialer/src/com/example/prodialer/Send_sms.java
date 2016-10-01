package com.example.prodialer;

import android.app.Activity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View.OnClickListener;


public class Send_sms extends Activity {
ImageButton b;
	EditText et;
TextView tv;
String test;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_send_sms);
b=(ImageButton)findViewById(R.id.imageButton1);
et=(EditText)findViewById(R.id.editText1);
tv=(TextView)findViewById(R.id.textView2);
test = MainActivity.s;
tv.setText(test);


b.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		String text=et.getText().toString();
if(text.isEmpty()||test.isEmpty())
{
	Toast.makeText(Send_sms.this, "Error!",111).show();
}
else
{
SmsManager.getDefault().sendTextMessage(test, null, text, null, null);
test=null;
Toast.makeText(Send_sms.this, "Success!",111).show();

}
	}
});


	}

}
