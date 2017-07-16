package com.example.farmproducequality;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Administrator extends AppCompatActivity {
    Button Ad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_administrator2);
        Ad= (Button)findViewById(R.id.button13);
        Ad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplication(),"Admin login clicked",Toast.LENGTH_SHORT).show();
                Intent myintent = new Intent(Administrator.this,AdminLogin.class);
                startActivity(myintent);
            }
        });
    }
}
