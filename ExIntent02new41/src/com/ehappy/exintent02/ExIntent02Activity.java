package com.ehappy.exintent02;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ExIntent02Activity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ex_intent02);
		
       
        Button btnPage2=(Button)findViewById(R.id.btnPage2);  
 
        btnPage2.setOnClickListener(btnPage2Listner); 
    }
    
    private Button.OnClickListener btnPage2Listner=new Button.OnClickListener(){
    	public void onClick(View v){
    		Intent intent=new Intent();
    		intent.setClass(ExIntent02Activity.this,Second.class);
    		startActivity(intent);
    	}
    };
}