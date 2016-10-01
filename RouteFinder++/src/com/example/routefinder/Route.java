package com.example.routefinder;




import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class Route extends Activity {

	TextView tv1;
	TextView tv2;
	ListView lv;
	int ptr1=0,ptr2=0;
	String lst1,lst2;
	 
static String[] jpjd={"Jaipur","Phulera","Nawa","Kuchaman","Makrana","Degana","Merta","Gotan","Raikabagh","Jodhpur"};
static String[] jpaj={"Jaipur","Phulera","Kishangarh","Ajmer"};
static String[] jpud={"Jaipur","Phulera","Kishangarh","Ajmer","Nasirabad","Bijaingar","Bhilwara","Chanderiya","Kapasan","Mavli","Ranapratapnagar","Udaipur"};
static String[] ajjd={"Ajmer","Marwar","Pali Marwar","Bhagat ki Kothi","Jodhpur"};

static String[] ajud={"Ajmer","Nasirabad","Bijaingar","Bhilwara","Chanderiya","Kapasan","Mavli","Ranapratapnagar","Udaipur"};
static String[] jdud={"No Direct Trains Available!"};	
	List<String> ints = new ArrayList<String>();
	

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_route);
		
		tv1=(TextView)findViewById(R.id.textView2);
		tv2=(TextView)findViewById(R.id.textView4);
		lv=(ListView)findViewById(R.id.listView1);
		
		tv1.setText(MainActivity.st1);
		tv2.setText(MainActivity.st2);
		lst1=MainActivity.st1;
		lst2=MainActivity.st2;
		for(int i =0;i<4;i++)
		{
			if(lst1==MainActivity.data[i])
				
			{
				ptr1=i;
				
			}
			if(lst2==MainActivity.data[i])
			{
				ptr2=i;
			}
		}
		
		
		
		if(ptr1==0&&ptr2==1)
			
		{
		for(int i=0;i<4;i++)
		{
			ints.add(jpaj[i]);
		}
		}
		else if(ptr1==0&&ptr2==2)
			
		{
			for(int i=0;i<10;i++)
			{
				ints.add(jpjd[i]);
			}	
		}
else if(ptr1==0&&ptr2==3)
			
		{
	for(int i=0;i<12;i++)
	{
		ints.add(jpud[i]);
	}	
		}
else if(ptr1==1&&ptr2==0)
	
{
	for(int i=3;i>=0;i--)
	{
		ints.add(jpaj[i]);
	}
}
else if(ptr1==1&&ptr2==2)
	
{
	for(int i=0;i<5;i++)
	{
		ints.add(ajjd[i]);
	}
}
else if(ptr1==1&&ptr2==3)
{
	for(int i=0;i<9;i++)
	{
		ints.add(ajud[i]);
	}
}
else if(ptr1==2&&ptr2==0)
	
{
	for(int i=9;i>=0;i--)
	{
		ints.add(jpjd[i]);
	}
}
else if(ptr1==2&&ptr2==1)
	
{
	for(int i=4;i>=0;i--)
	{
		ints.add(ajjd[i]);
	}
}
else if(ptr1==2&&ptr2==3)
{
	ints.add(jdud[0]);
}
else if(ptr1==3&&ptr2==0)
	
{
	for(int i=11;i>=0;i--)
	{
		ints.add(jpud[i]);
	}
}
else if(ptr1==3&&ptr2==1)
	
{
	for(int i=8;i>=0;i--)
	{
		ints.add(ajud[i]);
	}
}
else if(ptr1==3&&ptr2==2)
	
{
	ints.add(jdud[0]);

	
}
		
		else
		{
			Toast.makeText(Route.this,"SOURCE and DESTINATION are Same!",111).show();
			
		}
		
		
		//for(int i=0;i<5;i++)
		//{
			//Toast.makeText(Route.this,route[i],111).show();

		//}
		
		ArrayAdapter<String>obj=new ArrayAdapter<String>(Route.this,android.R.layout.simple_list_item_1,ints);
		
	lv.setAdapter(obj);
		lv.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
			Toast.makeText(Route.this,(CharSequence) arg0.getItemAtPosition(arg2), 111).show();
			}
		});
		lst1=lst2=null; 
		
		
		
	}

	
}
