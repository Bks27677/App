package com.example.myapplication.chaotha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.myapplication.IndexActivity;
import com.example.myapplication.M2Activity;
import com.example.myapplication.R;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Button next = (Button)findViewById(R.id.googlebt1);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(DetailsActivity.this , M2Activity.class);
                startActivity(i);
            }
        });
        ImageView V1 = (ImageView)findViewById(R.id.imageView6);
        V1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(DetailsActivity.this , IndexActivity.class);
                startActivity(i);
            }
        });


    }
}