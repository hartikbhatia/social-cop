package com.example.hp.eocodin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;

public class Splashscreen extends AppCompatActivity {

    private ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        progressBar = (ProgressBar) findViewById(R.id.progressBar);

        new Thread(new Runnable() {
            @Override
            public void run() {
                dowork();
                startapp();
                finish();
            }
        }).start();

    }

    private void dowork() {
        for(int progress=0;progress<20;progress+=10){
            try {
                Thread.sleep(1000);
                progressBar.setProgress(progress);


            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }}



    private void startapp() {
        Intent i=new Intent(Splashscreen.this,back.class);
        startActivity(i);
    }
}
