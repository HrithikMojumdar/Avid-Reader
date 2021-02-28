package com.example.avidreader;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button study1;
    Button study2;
    Button study3;
    Button study4;
    Button study5;
    Button study6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        study1 = (Button) findViewById(R.id.study1);
        study1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Study1Activity.class);
                startActivity(intent);

            }
        });

        study2 = (Button) findViewById(R.id.study2);
        study2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Study2Activity.class);
                startActivity(intent);

            }
        });


        study3 = (Button) findViewById(R.id.study3);
        study3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Study3Activity.class);
                startActivity(intent);

            }
        });

        study4 = (Button) findViewById(R.id.study4);
        study4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Study4Activity.class);
                startActivity(intent);

            }
        });

        study5 = (Button) findViewById(R.id.study5);
        study5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Study5Activity.class);
                startActivity(intent);

            }
        });


        study6 = (Button) findViewById(R.id.study6);
        study6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Study6Activity.class);
                startActivity(intent);

            }
        });
    }
}
