package com.example.appdemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;


public class MainActivity extends Activity {
WebView vb;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		vb=(WebView)findViewById(R.id.webView1);
		vb.loadUrl("http://www.google.com");
		
		
	}

	

	
}
