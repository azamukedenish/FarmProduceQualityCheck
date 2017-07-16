package com.example.farmproducequality;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Market extends AppCompatActivity {
    Button m1,m2,m3,m4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_market);
        m1=(Button) findViewById(R.id.button16);
        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Market place link clicked",Toast.LENGTH_SHORT).show();
                Intent myintent = new Intent(Market.this,MarketPlace.class);
                startActivity(myintent);
            }
        });
    }
}
