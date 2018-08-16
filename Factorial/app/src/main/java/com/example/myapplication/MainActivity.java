package com.example.myapplication;

import lab.ivn;

import android.app.Activity;
import android.os.Bundle;
import android.view.*;
import android.widget.*;

import com.example.myapplication.R;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }
    
    public void calcular(View view){
      
   EditText txtInN  = (EditText)findViewById(R.id.txtInN);
   String tres = txtInN.getText().toString();
      
      TextView txtResult = (TextView)findViewById(R.id.txtResult);
      
      int n = Integer.parseInt(tres);
      
      
     tres =  "Factorial = " + Long.toString((new ivn()).factorial(n));
      txtResult.setText(tres);
      
      
    }



}
