package com.example.cat_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class BadEnding extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bad_ending);

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                finish();
                startActivity(new Intent(BadEnding.this, Credits.class));
            }
        };
        Timer opening = new Timer();
        opening.schedule(task, 10000);
    }
    }
}