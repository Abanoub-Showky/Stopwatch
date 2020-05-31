package com.example.stopwatchapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class StopWatch extends AppCompatActivity {
    Button startButton;
    ImageView iconImageView;
    Animation animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stop_watch);
        startButton = (Button)findViewById(R.id.startButton);
        iconImageView = (ImageView)findViewById(R.id.icanchor);

        animation = AnimationUtils.loadAnimation(this,R.anim.)
    }
}
