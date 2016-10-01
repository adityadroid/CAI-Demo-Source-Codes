package com.example.winglo;


import android.app.Activity;
import android.app.ListActivity;
import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends Activity {
private static final String SEARCHES="searches";

    EditText search,tagedit;
    Button google,addtag;
    SharedPreferences savedsearches;
    ArrayList<String> tags;
    ArrayAdapter<String> adapter;
    ListView lv;
    
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
lv=(ListView)findViewById(R.id.listView);
search=(EditText)findViewById(R.id.editText);
        google=(Button)findViewById(R.id.button);
tagedit=(EditText)findViewById(R.id.editText2);
addtag=(Button)findViewById(R.id.button2);
savedsearches = getSharedPreferences(SEARCHES, MODE_PRIVATE);
tags=new ArrayList<String>(savedsearches.getAll().keySet());
Collections.sort(tags,String.CASE_INSENSITIVE_ORDER);
adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,tags);
lv.setAdapter(adapter);



addtag.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
		
		if(search.getText().length()>0&&tagedit.getText().length()>0)
		{
			
			SharedPreferences.Editor editor = savedsearches.edit();
			editor.putString(tagedit.getText().toString(),search.getText().toString());
			
			editor.apply();
			if(!tags.contains(tagedit.getText().toString()))
			{
				tags.add(tagedit.getText().toString());
				Collections.sort(tags,String.CASE_INSENSITIVE_ORDER);
				adapter.notifyDataSetChanged();
			}
			
			search.setText("");
			tagedit.setText("");

            ((InputMethodManager) getSystemService(
               Context.INPUT_METHOD_SERVICE)).hideSoftInputFromWindow(
               tagedit.getWindowToken(), 0);  
			
		}
		
		else
		{
			Toast.makeText(MainActivity.this, "Error", 111).show();
		}
		
		
		
	}
});

lv.setOnItemClickListener(new OnItemClickListener() {

	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		// TODO Auto-generated method stub
		
		
		String tag=(String)arg0.getItemAtPosition(arg2);
	String finalterm=savedsearches.getString(tag, "");
      Intent i = new Intent(Intent.ACTION_WEB_SEARCH);
      i.putExtra(SearchManager.QUERY,finalterm);
startActivity(i); 
	}
});


lv.setOnItemLongClickListener(new OnItemLongClickListener() {

	@Override
	public boolean onItemLongClick(AdapterView<?> arg0, View arg1, int arg2,
			long arg3) {
		// TODO Auto-generated method stub
		return false;
	}
});
        google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            	
            	try
            	{
                String term = search.getText().toString();
               Intent i = new Intent(Intent.ACTION_WEB_SEARCH);
               i.putExtra(SearchManager.QUERY,term);
startActivity(i);               
            	}
            	catch(Exception e)
            	{
            		
            	}
                
            }
        });

    }
}
