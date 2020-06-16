package com.example.chatapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class hodugaza extends AppCompatActivity {

    private ImageView img1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hodugaza);

        img1=findViewById(R.id.img1);

        Button button1 = (Button) findViewById(R.id.hodugaza1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(),hodugaza1.class);
                startActivity(intent);




            }
        });



        Button button2 = (Button) findViewById(R.id.hodugaza2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),hodugaza2.class);
                startActivity(intent);




            }
        });
    }
}
