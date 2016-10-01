package com.example.interface_pogram;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import com.example.calcplus.R;

public class MainActivity extends ActionBarActivity {
	Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, badd, bsub, bdiv, bmul,
			bres, bcl;
	EditText n;
	float p, q, r;
	int choice;

	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		bcl = (Button) findViewById(R.id.button16);
		b1 = (Button) findViewById(R.id.button1);
		b2 = (Button) findViewById(R.id.button2);
		b3 = (Button) findViewById(R.id.button3);
		b4 = (Button) findViewById(R.id.button4);
		b5 = (Button) findViewById(R.id.button5);
		b6 = (Button) findViewById(R.id.button6);
		b7 = (Button) findViewById(R.id.button7);
		b8 = (Button) findViewById(R.id.button8);
		b9 = (Button) findViewById(R.id.button9);
		b10 = (Button) findViewById(R.id.button10);
		badd = (Button) findViewById(R.id.button11);
		bsub = (Button) findViewById(R.id.button12);
		bdiv = (Button) findViewById(R.id.button13);
		bmul = (Button) findViewById(R.id.button14);
		bres = (Button) findViewById(R.id.button15);
		n = (EditText) findViewById(R.id.editText1);

		b1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if (p == 0) {
					p = 1;
				} else {
					q = 1;
				}
				n.setText("1");

			}
		});

		b2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if (p == 0) {
					p = 2;
				} else {
					q = 2;
				}
				n.setText("2");
			}
		});

		b3.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if (p == 0) {
					p = 3;
				} else {
					q = 3;
				}
				n.setText("3");
			}
		});

		b4.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if (p == 0) {
					p = 4;
				} else {
					q = 4;
				}
				n.setText("4");
			}
		});

		b5.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if (p == 0) {
					p = 5;
				} else {
					q = 5;
				}
				n.setText("5");
			}
		});

		b6.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if (p == 0) {
					p = 6;
				} else {
					q = 6;
				}
				n.setText("6");
			}
		});

		b7.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if (p == 0) {
					p = 7;
				} else {
					q = 7;
				}
				n.setText("7");
			}
		});

		b8.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if (p == 0) {
					p = 8;
				} else {
					q = 8;
				}
				n.setText("8");
			}
		});

		b9.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if (p == 0) {
					p = 9;
				} else {
					q = 9;
				}
				n.setText("9");
			}
		});

		b10.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if (p == 0) {
					p = 0;
				} else {
					q = 0;
				}
				n.setText("0");
			}
		});

		badd.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				choice = 1;
				n.setText("+");
			}
		});

		bsub.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				choice = 2;
				n.setText("-");
			}
		});

		bmul.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				choice = 3;
				n.setText("x");
			}
		});

		bdiv.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				choice = 4;
				n.setText("/");
			}
		});

		bcl.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				n.setText(null);
			}
		});

		bres.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if (choice == 1)
					r = p + q;

				else if (choice == 2)
					r = p - q;
				else if (choice == 3)
					r = p * q;
				else if (choice == 4)
					r = p / q;

				String s;
				s = String.valueOf(r);
				n.setText(s);
				r = 0;
				p = 0;
				q = 0;

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
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
