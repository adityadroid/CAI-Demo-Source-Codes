package com.example.splashdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
		Thread d= new Thread(){
			public void run()
			{
				try
				{
					sleep(2000);
					
				}
				catch(Exception e)
				{
					
				}
			
			
			finally{
				Intent i = new Intent(MainActivity.this,Other.class);
				
				i.setFlags(i.FLAG_ACTIVITY_NO_HISTORY);
				
				startActivity(i);
				finish();
			}
			}
		};
		
		d.start();
		
	}

	
	
	
}
