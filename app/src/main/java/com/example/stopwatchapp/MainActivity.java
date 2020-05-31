package com.example.stopwatchapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView imageViewSplash;
    TextView textViewSplash;
    TextView textViewSubSplash;
    Button buttonSplash;
    Animation imageViewAnimationSplash;
    Animation animationOne;
    Animation animationTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageViewSplash = (ImageView)findViewById(R.id.ivSplash);
        textViewSplash = (TextView)findViewById(R.id.tvSplash);
        textViewSubSplash = (TextView)findViewById(R.id.tvSubSplash);
        buttonSplash = (Button)findViewById(R.id.btnGet);

//        load custom animation
        imageViewAnimationSplash = AnimationUtils.loadAnimation(this,R.anim.animation);
        animationOne = AnimationUtils.loadAnimation(this,R.anim.animation_one);
        animationTwo = AnimationUtils.loadAnimation(this,R.anim.animation_two);

//        pass custom animation
        imageViewSplash.startAnimation(imageViewAnimationSplash);
        textViewSplash.startAnimation(animationOne);
        textViewSubSplash.startAnimation(animationOne);
        buttonSplash.startAnimation(animationTwo);

        buttonSplash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,StopWatch.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent);
            }
        });
    }
}
