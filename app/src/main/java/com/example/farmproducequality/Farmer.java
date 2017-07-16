package com.example.farmproducequality;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Farmer extends AppCompatActivity {
    Button f1,f2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_farmer2);
        f1= (Button) findViewById(R.id.button10);
        f1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplication(),"Registration clicked",Toast.LENGTH_SHORT).show();
                Intent myintent = new Intent(Farmer.this,FarmerRegistration.class);
                startActivity(myintent);
            }
        });
        f2= (Button) findViewById(R.id.button11);
        f2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplication(),"login clicked",Toast.LENGTH_SHORT).show();
                Intent myintent = new Intent(Farmer.this,FarmerLogin.class);
                startActivity(myintent);
            }
        });
    }
}
