package com.ehappy.exintent02;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Second extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page2);
        
        
        Button btnHome=(Button)findViewById(R.id.btnHome);  
        btnHome.setOnClickListener(btnHomeListner); 
    }
    
    private Button.OnClickListener btnHomeListner=new Button.OnClickListener(){
    	public void onClick(View v){
    		finish();
    	}
    };    
}