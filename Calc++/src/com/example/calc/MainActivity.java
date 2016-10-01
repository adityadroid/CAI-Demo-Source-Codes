package com.example.calc;



import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,badd,bsub,bmul,bdiv,bcl,bbck,beq,bdot;
	EditText et;
	int top=-1;
	final float[] ar= new float[40];
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		b1=(Button)findViewById(R.id.button1);
		b2=(Button)findViewById(R.id.button4);
		b3=(Button)findViewById(R.id.button7);
		b4=(Button)findViewById(R.id.button2);
		b5=(Button)findViewById(R.id.button5);
		b6=(Button)findViewById(R.id.button8);
		b7=(Button)findViewById(R.id.button3);
		b8=(Button)findViewById(R.id.button6);
		b9=(Button)findViewById(R.id.button9);
		b0=(Button)findViewById(R.id.button10);
		badd=(Button)findViewById(R.id.button13);
		bsub=(Button)findViewById(R.id.button14);
		bmul=(Button)findViewById(R.id.button15);
		bdiv=(Button)findViewById(R.id.button12);
		bcl=(Button)findViewById(R.id.button16);
		bbck=(Button)findViewById(R.id.button11);
		et=(EditText)findViewById(R.id.editText1);
		beq=(Button)findViewById(R.id.button17);
		
		bdot=(Button)findViewById(R.id.button18);
		
		
		
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
			et.append("6");
			// TODO Auto-generated method stub
			
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
				
		}
	);
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
	bcl.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			et.setText(null);
		
		}	});
	bbck.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			if(et.length()==0)
			{
				Toast.makeText(MainActivity.this,"Enter some value first.",Toast.LENGTH_LONG).show();
			}
			else
				
			{
				String s=et.getText().toString();
				String cd= s.substring(0,s.length()-1);
				et.setText(cd);
			}
		}
	});
	bdot.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			et.append(".");
		}
	});
	
	beq.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
	
			
		String test=et.getText().toString();
		
		if(test.equals(""))
		{
			Toast.makeText(MainActivity.this, "Empty Field!", Toast.LENGTH_LONG);
		}
		
		else if(test.charAt(0)=='*'||test.charAt(0)=='+'||test.charAt(0)=='-'||test.charAt(0)=='/')
		{
			Toast.makeText(MainActivity.this,"Invalid operation format",Toast.LENGTH_SHORT).show();
		}
		else
		{
		
		String s = '#'+et.getText().toString();
		    int op1=0,op2;
		    op2=s.length();
		   	for(int i=s.length()-1;i>=0;i--)
		    {
		    
		    	
		    	
		    	if(s.charAt(i)=='+'||s.charAt(i)=='-'||s.charAt(i)=='/'||s.charAt(i)=='*'||s.charAt(i)=='#')
		    	{
		    	op1=i;
		    	String sub=s.substring(op1+1,op2);
		    	float m;
		    	m= Float.parseFloat(sub);
		    	push(m);
		    	op2=op1;
		    	
		         }
		    }
		    for(int i=0;i<s.length();i++)
		    {
		    	
		    	
		    if(s.charAt(i)=='+')
		    {
		    	float a,b;
		    	a=pop();
		    	b=pop();
		    	push(a+b);
		    	
		    }
		    
		  	
		    else if(s.charAt(i)=='-')
		    {
		    	float a,b;
		    	a=pop();
		    	b=pop();
		    	push(a-b);
		    	
		    }
		  	
		    else if(s.charAt(i)=='/')
		    {
		    	float a,b;
		    	a=pop();
		    	b=pop();
		    	if(b==0)
				{
				Toast.makeText(MainActivity.this,"Cannot Divide by zero", Toast.LENGTH_SHORT).show();
				}
		    	else
		    	{
		    	push(a/b);
		    	}
		    }
		    
		  	
		    else if(s.charAt(i)=='*')
		    {
		    	float a,b;
		    	a=pop();
		    	b=pop();
		    	push(a*b);
		    	
		    }
		    }
		    et.setText(""+pop());
		}
		
		
		
			}
		
	}
	);}
	
	public float pop()
	{
		float ret=0;
	
		if(top==-1)
		{
			Toast.makeText(MainActivity.this,"Underflow Reached", Toast.LENGTH_SHORT).show();
			
		}
		else
		{
 ret=	ar[top];
		top=top-1;
		
		}
		return ret;
		
	}
	
	public void push(float x)
	{
		if(top==9)
		{
			Toast.makeText(MainActivity.this, "Overflow reached", Toast.LENGTH_SHORT).show();
	}
		else
		{
			top=top+1;
			
		
		ar[top]	= x;
		
		}
	
	
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
