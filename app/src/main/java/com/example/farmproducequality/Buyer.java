package com.example.farmproducequality;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Buyer extends AppCompatActivity {
    Button by1;
    Button by2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buyer2);
        by1=(Button) findViewById(R.id.button);
        by1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Register clicked",Toast.LENGTH_SHORT).show();
                Intent myintent = new Intent(Buyer.this,Registration.class);
                startActivity(myintent);
            }
        });
        by2=(Button) findViewById(R.id.button2);
        by2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Login clicked",Toast.LENGTH_SHORT).show();
                Intent myintent = new Intent(Buyer.this,Login.class);
                startActivity(myintent);
            }
        });
    }
}
