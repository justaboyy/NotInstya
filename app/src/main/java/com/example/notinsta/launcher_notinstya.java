package com.example.notinsta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class launcher_notinstya extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher_notinstya);

        //rediriger vers la main page aprs un temps
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                //démarrer une page
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();
            }
        };
        //handler post delayed
        new Handler().postDelayed(runnable, 1500);
    }
}