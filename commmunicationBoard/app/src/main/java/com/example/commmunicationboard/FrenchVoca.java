package com.example.commmunicationboard;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import java.util.Locale;

public class FrenchVoca extends AppCompatActivity {
    TextToSpeech tts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_french_voca);

        EditText e1=findViewById(R.id.txtspeak1);
        Button b1=findViewById(R.id.btnspeak1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tts=new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        if(i==TextToSpeech.SUCCESS){
                            tts.setLanguage(Locale.FRANCE);
                            tts.setSpeechRate(0.8f);
                            tts.speak(e1.getText().toString(), TextToSpeech.QUEUE_ADD, null, null);
                        }
                    }
                });
            }
        });

        ImageView imageView=findViewById(R.id.backvocab1);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent( FrenchVoca.this, mainpage.class);
                startActivity(intent);
                finish();
            }

        });
    }
}