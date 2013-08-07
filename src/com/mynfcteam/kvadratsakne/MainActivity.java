package com.mynfcteam.kvadratsakne;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	private TextView fa;
	private TextView fb;
	private TextView fc;
	private TextView result;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		fa = (TextView) findViewById(R.id.a);
		fb = (TextView) findViewById(R.id.b);
		fc = (TextView) findViewById(R.id.c);
		result = (TextView) findViewById(R.id.result);
		Button submit=(Button) findViewById(R.id.submit);
		submit.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(!fa.getText().toString().equalsIgnoreCase("") || !fb.getText().toString().equalsIgnoreCase("") ||!fc.getText().toString().equalsIgnoreCase(""));
				double a=Double.valueOf((String) fa.getText().toString());
				double b=Double.valueOf((String) fb.getText().toString());
				double c=Double.valueOf((String) fc.getText().toString());
				double discriminant = b * b - 4 * a * c;
			    if (discriminant < 0) {
			    	result.setText("Reālas saknes neeksistē");
			    } else {
			        double discriminantRoot = Math.sqrt(discriminant);
			        double root1 = (-b + discriminantRoot) / (2 * a);
			        double root2 = (-b - discriminantRoot) / (2 * a);
			        result.setText("Saknes ir " + root1 + " un " + root2);
			    }				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
