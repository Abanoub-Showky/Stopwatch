package com.example.stopwatchapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.ImageView;

public class StopWatch extends AppCompatActivity {
    Button startButton;
    Button stopButton;
    ImageView iconImageView;
    Animation animation;
    Chronometer timerHere;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stop_watch);
        startButton = (Button)findViewById(R.id.startButton);
        iconImageView = (ImageView)findViewById(R.id.icanchor);
        stopButton = (Button)findViewById(R.id.stoptButton);
        timerHere = (Chronometer)findViewById(R.id.timerHere);

        stopButton.setAlpha(0);
        timerHere.setAlpha(0);

        animation = AnimationUtils.loadAnimation(this,R.anim.roundingalone);

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iconImageView.startAnimation(animation);
                stopButton.animate().alpha(1).setDuration(300).start();
                startButton.animate().alpha(0).setDuration(300).start();
//                start timer here
                timerHere.animate().alpha(1).setDuration(200).start();
                timerHere.setBase(SystemClock.elapsedRealtime());
                timerHere.start();
            }
        });

        stopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iconImageView.clearAnimation();
                stopButton.animate().alpha(0).setDuration(300).start();
                startButton.animate().alpha(1).setDuration(300).start();
                timerHere.animate().alpha(0).setDuration(200).start();
            }
        });
    }
}
