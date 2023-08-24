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


public class Frenchfeel extends AppCompatActivity {
    TextToSpeech tts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frenchfeel);

            ImageView imageView = findViewById(R.id.backfeel);
            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Frenchfeel.this, mainpage.class);
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
                                tts.setLanguage(Locale.FRANCE);
                                tts.setSpeechRate(1.0f);
                                tts.speak("Je suis en colère",TextToSpeech.QUEUE_FLUSH,null);
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
                            tts.setSpeechRate(1.0f);
                            tts.speak("Cool avec ça",TextToSpeech.QUEUE_FLUSH,null);
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
                            tts.setSpeechRate(1.0f);
                            tts.speak("j'ai envie de faire la fête",TextToSpeech.QUEUE_FLUSH,null);
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
                            tts.setSpeechRate(1.0f);
                            tts.speak("Je suis content",TextToSpeech.QUEUE_FLUSH,null);
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
                            tts.setSpeechRate(1.0f);
                            tts.speak("je me sens aimé",TextToSpeech.QUEUE_FLUSH,null);
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
                            tts.setSpeechRate(1.0f);
                            tts.speak("je suis confus",TextToSpeech.QUEUE_FLUSH,null);
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
                            tts.setSpeechRate(1.0f);
                            tts.speak("Je suis fatigué",TextToSpeech.QUEUE_FLUSH,null);
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
                            tts.setSpeechRate(1.0f);
                            tts.speak("je suis triste",TextToSpeech.QUEUE_FLUSH,null);
                        }
                    }
                });
            }
        });
    }
}