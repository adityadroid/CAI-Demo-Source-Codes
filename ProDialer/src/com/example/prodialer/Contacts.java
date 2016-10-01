package com.example.prodialer;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;
public class Contacts extends Activity {

	ListView lv;
	 String[] data={"9928981600","9284928395","8729298128","8383749382","9228485334","77292902092","8192938483"};

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_contacts);
		lv=(ListView)findViewById(R.id.listView1);
		
		ArrayAdapter<String>obj= new ArrayAdapter<String>(Contacts.this,android.R.layout.simple_list_item_1,data);
lv.setAdapter(obj);

lv.setOnItemClickListener(new OnItemClickListener() {

	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
			long arg3) {
		// TODO Auto-generated method stub
		
		MainActivity.s=(String)arg0.getItemAtPosition(arg2);

		Intent i = new Intent(Contacts.this,MainActivity.class);
		startActivity(i);
		
		
	}
});	
	}

	
}
