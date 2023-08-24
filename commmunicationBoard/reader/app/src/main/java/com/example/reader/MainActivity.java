package com.example.reader;

import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
TextToSpeech textToSpeech;
Intent intent;
    private Button extractPDFBtn;
    private TextView extractedTV;
    private Button btnuploadpdf, btnuploaddocx, btnspeak, btnclear;
    //private TextView filepath;
    //EditText txtview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
// initializing variables for button and text view.
        extractedTV = findViewById(R.id.PDFTV);
        extractPDFBtn = findViewById(R.id.BtnExtract);
        EditText e1=findViewById(R.id.PDFTV);
       // Intent intent = new Intent();


        // adding on click listener for button
        extractPDFBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.setAction(Intent.ACTION_GET_CONTENT);
                intent.setType("application/pdf");
                startActivity(intent);

                intent= new Intent(getApplicationContext()pdfActivity.class)

            }
        });

      /*  private void extractPDF () {
            try {
                // creating a string for
                // storing our extracted text.
                String extractedText = "";

                // creating a variable for pdf reader
                // and passing our PDF file in it.
                PdfReader reader = new PdfReader(" ");

                // below line is for getting number
                // of pages of PDF file.
                int n = reader.getNumberOfPages();

                // running a for loop to get the data from PDF
                // we are storing that data inside our string.
                for (int i = 0; i < n; i++) {
                    extractedText = extractedText + PdfTextExtractor.getTextFromPage(reader, i + 1).trim() + "\n";
                    // to extract the PDF content from the different pages
                }

                // after extracting all the data we are
                // setting that string value to our text view.
                extractedTV.setText(extractedText);

                // below line is used for closing reader.
                reader.close();
            } catch (Exception e) {
                // for handling error while extracting the text file.
                extractedTV.setText("Error found is : \n" + e);
            }
        }*/


        extractedTV = findViewById(R.id.BtnExtract);
         btnspeak= findViewById(R.id.btnspeak);

        // create an object textToSpeech and adding features into it
        textToSpeech = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {

                // if No error is found then only it will run
                if(i!=TextToSpeech.ERROR){
                    // To Choose language of speech
                    textToSpeech.setLanguage(Locale.UK);
                }
            }
        });

        // Adding OnClickListener
        btnspeak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak(e1.getText().toString(),TextToSpeech.QUEUE_ADD,null);
            }
        });

    }
}


