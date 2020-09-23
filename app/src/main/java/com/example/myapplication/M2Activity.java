package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class M2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m2);

        LinearLayout L01 = (LinearLayout) findViewById(R.id.L1);
        L01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(M2Activity.this , IndexActivity.class);
                startActivity(i);
            }
        });
        LinearLayout L02 = (LinearLayout) findViewById(R.id.L2);
        L02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(M2Activity.this , SshopActivity.class);
                startActivity(i);
            }
        });
        LinearLayout L03 = (LinearLayout) findViewById(R.id.vtr1);
        L03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(M2Activity.this , InfoActivity.class);
                startActivity(i);
            }
        });
        LinearLayout L04 = (LinearLayout) findViewById(R.id.gle1);
        L04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(M2Activity.this , M3Activity.class);
                startActivity(i);
            }
        });

    }
}
