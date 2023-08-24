package com.example.commmunicationboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.Locale;

public class feeling extends AppCompatActivity {
TextToSpeech tts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feeling);
        ImageView imageView=findViewById(R.id.backfeel);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(feeling.this, mainpage.class);
                startActivity(intent);
                finish();
            }

        });

        ImageView imageView1=findViewById(R.id.angry);
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tts=new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        if(i==TextToSpeech.SUCCESS){
                            tts.setLanguage(Locale.US);
                            tts.setSpeechRate(0.8f);
                            tts.speak("I am angry",TextToSpeech.QUEUE_FLUSH,null);
                        }
                    }
                });
            }
        });

        ImageView imageView2=findViewById(R.id.cool);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tts=new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        if(i==TextToSpeech.SUCCESS){
                            tts.setLanguage(Locale.US);
                            tts.setSpeechRate(0.8f);
                            tts.speak("Cool with it",TextToSpeech.QUEUE_FLUSH,null);
                        }
                    }
                });
            }
        });

        ImageView imageView3=findViewById(R.id.celebrate);
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tts=new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        if(i==TextToSpeech.SUCCESS){
                            tts.setLanguage(Locale.US);
                            tts.setSpeechRate(0.8f);
                            tts.speak("I feel like celebrating",TextToSpeech.QUEUE_FLUSH,null);
                        }
                    }
                });
            }
        });

        ImageView imageView4=findViewById(R.id.happy);
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tts=new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        if(i==TextToSpeech.SUCCESS){
                            tts.setLanguage(Locale.US);
                            tts.setSpeechRate(0.8f);
                            tts.speak("I am Happy",TextToSpeech.QUEUE_FLUSH,null);
                        }
                    }
                });
            }
        });

        ImageView imageView5=findViewById(R.id.love);
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tts=new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        if(i==TextToSpeech.SUCCESS){
                            tts.setLanguage(Locale.US);
                            tts.setSpeechRate(0.8f);
                            tts.speak("I feel loved",TextToSpeech.QUEUE_FLUSH,null);
                        }
                    }
                });
            }
        });

        ImageView imageView6=findViewById(R.id.confuse);
        imageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tts=new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        if(i==TextToSpeech.SUCCESS){
                            tts.setLanguage(Locale.US);
                            tts.setSpeechRate(0.8f);
                            tts.speak("I am confused",TextToSpeech.QUEUE_FLUSH,null);
                        }
                    }
                });
            }
        });

        ImageView imageView7=findViewById(R.id.tired);
        imageView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tts=new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        if(i==TextToSpeech.SUCCESS){
                            tts.setLanguage(Locale.US);
                            tts.setSpeechRate(0.8f);
                            tts.speak("I am tired",TextToSpeech.QUEUE_FLUSH,null);
                        }
                    }
                });
            }
        });

        ImageView imageView8=findViewById(R.id.sad);
        imageView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tts=new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        if(i==TextToSpeech.SUCCESS){
                            tts.setLanguage(Locale.US);
                            tts.setSpeechRate(0.8f);
                            tts.speak("I am sad",TextToSpeech.QUEUE_FLUSH,null);
                        }
                    }
                });
            }
        });
}
}