package com.example.calcx;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bcl,bck,badd,bsub,bmul,bdiv,bdot,beq;
EditText et;
int top=-1;
final int[] n= new int[40];
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
		b0=(Button)findViewById(R.id.button10);
		bcl=(Button)findViewById(R.id.button18);
		bck=(Button)findViewById(R.id.button11);
		bdot=(Button)findViewById(R.id.button12);
		badd=(Button)findViewById(R.id.button13);
		bsub=(Button)findViewById(R.id.button14);
		bmul=(Button)findViewById(R.id.button16);
		bdiv=(Button)findViewById(R.id.button15);
		beq=(Button)findViewById(R.id.button17);
		et=(EditText)findViewById(R.id.editText1);
		
		b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				et.append("1");
			}
		});
		
b2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				et.append("2");
			}
		});

b3.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		et.append("3");
	}
});
b4.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		et.append("4");
	}
});
b5.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		et.append("5");
	}
});
b6.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		et.append("6");
	}
});
b7.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		et.append("7");
	}
});
b8.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		et.append("8");
	}
});
b9.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		et.append("9");
	}
});
b0.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		et.append("0");
	}
});
//bdot.setOnClickListener(new OnClickListener() {
	
//	@Override
	//public void onClick(View arg0) {
		// TODO Auto-generated method stub
		//et.append(".");
//	}
//});
bcl.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		et.setText(null);
	}
});
bck.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
		if(et.length()==0)
		{
			Toast.makeText(MainActivity.this,"Enter some value",Toast.LENGTH_SHORT).show();
		}
		else
			
		{
			String s = et.getText().toString();
			String c = s.substring(0,s.length()-1);
			et.setText(c);
			
		}
	}
});

beq.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
		
		String s="#"+et.getText().toString();
		int op1=0,op2=s.length();
		for(int i=s.length()-1;i>=0;i--)
		{
		//Toast.makeText(MainActivity.this,"For is Working", 1000).show();
		if(s.charAt(i)=='+'||s.charAt(i)=='-'||s.charAt(i)=='*'||s.charAt(i)=='/'||s.charAt(i)=='#')
		{
		//Toast.makeText(MainActivity.this,"If is Working", 1000).show();
		op1=i;
		//Toast.makeText(MainActivity.this,"1st step is Working "+op1, 1000).show();
		// String m=s.substring(op1+1, op2);
		int m=Integer.parseInt(s.substring(op1+1, op2));
		op2=op1;
		//Toast.makeText(MainActivity.this,"2nd step is Working "+m, 1000).show();
		push(m);

		}
		}
		for(int i=0;i<s.length();i++)
		{
		if(s.charAt(i)=='+'||s.charAt(i)=='-'||s.charAt(i)=='*'||s.charAt(i)=='/')
		{
		int a=pop();
		int b=pop();
		if(s.charAt(i)=='+')
		push(a+b);
		else if(s.charAt(i)=='-')
		push(a-b);
		else if(s.charAt(i)=='*')
		push(a*b);
		else if(s.charAt(i)=='/')
		{
		if(b==0)
		{
		Toast.makeText(MainActivity.this,"Cannot Divide by zero", Toast.LENGTH_SHORT).show();
		}
		else
		{
		push(a/b);
		}
		}
		}

		}


		et.setText(""+pop());
		
	}
});
badd.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		et.append("+");
	}
});

bsub.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		et.append("-");
	}
});
bdiv.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		et.append("/");
	}
});
bmul.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		et.append("*");
	}
});
		
	}

	   public void push(int a)
	    {
	    if(top==9)
	    {
	    Toast.makeText(MainActivity.this, "Overflow Reached", Toast.LENGTH_SHORT).show();
	    }
	    else
	    {
	    top++;
	    n[top]=a;
	    }
	    //Toast.makeText(MainActivity.this,"3rd step is Working "+top+"
	//"+n[top], 1000).show();
	    }
	    public int pop()
	    {
	    int b=0;
	    if(top==-1)
	    {
	    Toast.makeText(MainActivity.this,"Underflow Condition", Toast.LENGTH_LONG).show();
	    }

	    else
	    {
	    b=n[top];
	    top--;
	        };
	return b;
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
