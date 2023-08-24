package com.example.commmunicationboard;

import androidx.appcompat.app.AppCompatActivity;

import android.speech.tts.TextToSpeech;
import android.view.View;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import java.util.Locale;

public class want extends AppCompatActivity {
TextToSpeech tts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_want);
        ImageView imageView=findViewById(R.id.backwant);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(want.this, mainpage.class);
                startActivity(intent);
                finish();
            }

        });
        ImageView imageView1=findViewById(R.id.bath);
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tts=new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        if(i==TextToSpeech.SUCCESS){
                            tts.setLanguage(Locale.US);
                            tts.setSpeechRate(1.0f);
                            tts.speak("I want to go and bath",TextToSpeech.QUEUE_FLUSH,null);
                        }
                    }
                });
            }
        });

        ImageView imageView2=findViewById(R.id.walk);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tts=new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        if(i==TextToSpeech.SUCCESS){
                            tts.setLanguage(Locale.US);
                            tts.setSpeechRate(1.0f);
                            tts.speak("I want to go for a walk",TextToSpeech.QUEUE_FLUSH,null);
                        }
                    }
                });
            }
        });

        ImageView imageView3=findViewById(R.id.music);
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tts=new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        if(i==TextToSpeech.SUCCESS){
                            tts.setLanguage(Locale.US);
                            tts.setSpeechRate(1.0f);
                            tts.speak("I want to listen to music",TextToSpeech.QUEUE_FLUSH,null);
                        }
                    }
                });
            }
        });

        ImageView imageView4=findViewById(R.id.toilet);
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tts=new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        if(i==TextToSpeech.SUCCESS){
                            tts.setLanguage(Locale.US);
                            tts.setSpeechRate(1.0f);
                            tts.speak("I want to go to private",TextToSpeech.QUEUE_FLUSH,null);
                        }
                    }
                });
            }
        });

        ImageView imageView5=findViewById(R.id.eat);
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tts=new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        if(i==TextToSpeech.SUCCESS){
                            tts.setLanguage(Locale.US);
                            tts.setSpeechRate(1.0f);
                            tts.speak("I want to eat",TextToSpeech.QUEUE_FLUSH,null);
                        }
                    }
                });
            }
        });

        ImageView imageView6=findViewById(R.id.tv);
        imageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tts=new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        if(i==TextToSpeech.SUCCESS){
                            tts.setLanguage(Locale.US);
                            tts.setSpeechRate(1.0f);
                            tts.speak("I want to watch television",TextToSpeech.QUEUE_FLUSH,null);
                        }
                    }
                });
            }
        });


    }
}