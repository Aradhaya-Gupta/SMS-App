package com.example.smsapp;

import android.os.Bundle;
import android.app.Activity;
import android.telephony.gsm.SmsManager;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
  
	EditText ed1, ed2 ;
	Button b;
	SmsManager sm;
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    ed1=(EditText)findViewById(R.id.editText1);
    ed2=(EditText)findViewById(R.id.editText2);
    b=(Button)findViewById(R.id.button1);
    sm=SmsManager.getDefault();
    b.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			String msg=ed1.getText().toString();
			String mob=ed2.getText().toString();
			sm.sendTextMessage(mob, null, msg, null, null);
			Toast.makeText(getApplicationContext(), "Send SMS Successfully", Toast.LENGTH_SHORT).show();
			
		}
	});
    }
    
}