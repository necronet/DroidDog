package com.tpa;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class ToolProcessAccessActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Button btnaccesar = (Button) findViewById(R.id.btnaccesar);
        
        btnaccesar.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String user = ((EditText) findViewById(R.id.txtuser)).getText().toString();
				String passwd = ((EditText) findViewById(R.id.txtpassword)).getText().toString();
				Log.d("tpa", "Te pica el ayote!!!" + user + ", " + passwd);
				Intent dashboardintent = new Intent(ToolProcessAccessActivity.this,DashBoardActivity.class);
			    startActivity(dashboardintent);		
			}
		});
        
    }
}