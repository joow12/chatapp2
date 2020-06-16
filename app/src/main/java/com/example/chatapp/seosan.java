package com.example.chatapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class seosan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seosan);

        Button button1 = (Button) findViewById(R.id.seo1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),seo1.class);
                startActivity(intent);
            }
        });

        Button button2 = (Button) findViewById(R.id.seo2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),seo2.class);
                startActivity(intent);
            }
        });

        Button button3 = (Button) findViewById(R.id.seo3);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),seo3.class);
                startActivity(intent);
            }
        });

        Button button4 = (Button) findViewById(R.id.seo4);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),seo4.class);
                startActivity(intent);
            }
        });

        Button button5 = (Button) findViewById(R.id.seo5);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),seo5.class);
                startActivity(intent);
            }
        });

        Button button6 = (Button) findViewById(R.id.seo6);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),seo6.class);
                startActivity(intent);
            }
        });

        Button button7 = (Button) findViewById(R.id.seo7);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),seo7.class);
                startActivity(intent);
            }
        });

        Button button8 = (Button) findViewById(R.id.seo8);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),seo8.class);
                startActivity(intent);
            }
        });

        Button button9 = (Button) findViewById(R.id.seo9);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),seo9.class);
                startActivity(intent);
            }
        });




    }
}
