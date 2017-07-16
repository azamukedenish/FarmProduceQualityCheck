package com.example.farmproducequality;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button bt1,bt2,bt3,bt4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt1= (Button) findViewById(R.id.button3);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Buyer link clicked",Toast.LENGTH_SHORT).show();
                Intent myIntent = new Intent(MainActivity.this,Buyer.class);
                startActivity(myIntent);
            }
        });
        bt2= (Button) findViewById(R.id.button4);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Farmer link clicked",Toast.LENGTH_SHORT).show();
               Intent SecondIntent = new Intent(MainActivity.this, Farmer.class);
                startActivity(SecondIntent);
            }
        });
        bt3= (Button) findViewById(R.id.button5);
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Administrator link clicked",Toast.LENGTH_SHORT).show();
               Intent myIntent = new Intent(MainActivity.this,Administrator.class);
                startActivity(myIntent);

            }
        });
        bt4= (Button) findViewById(R.id.button15);
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Market link clicked",Toast.LENGTH_SHORT).show();
                Intent myIntent = new Intent(MainActivity.this,Market.class);
                startActivity(myIntent);

            }
        });
    }
}
