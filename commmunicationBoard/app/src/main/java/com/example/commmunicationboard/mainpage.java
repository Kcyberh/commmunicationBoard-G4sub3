package com.example.commmunicationboard;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.content.Intent;

import android.widget.Button;
import android.os.Bundle;

import android.widget.ImageView;

public class mainpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainpage);

ImageView imageView=findViewById(R.id.imageView1);
Button btn = findViewById(R.id.button1);
        Button btn1 = findViewById(R.id.button2);
imageView.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent=new Intent(mainpage.this, response.class);
        startActivity(intent);
        finish();
    }

    });
ImageView imageView1=findViewById(R.id.imageView2);
imageView1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent=new Intent(mainpage.this, want.class);
        startActivity(intent);
        finish();
    }
});
        ImageView imageView2=findViewById(R.id.imageView3);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(mainpage.this, feeling.class);
                startActivity(intent);
                finish();
            }
        });
        /*
        ImageView imageView3=findViewById(R.id.imageView4);
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(mainpage.this, vocab.class);
                startActivity(intent);
                finish();
            }
        }); */

        ImageView imageView5=findViewById(R.id.imageView5);
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(mainpage.this, Frenchfeel.class);
                startActivity(intent);
                finish();
            }
        });

        ImageView imageView6=findViewById(R.id.imageView6);
        imageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(mainpage.this, frenchresponse.class);
                startActivity(intent);
                finish();
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(mainpage.this, FrenchVoca.class);
                startActivity(intent);
                finish();
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(mainpage.this, vocab.class);
                startActivity(intent);
                finish();
            }
        });


    }
}