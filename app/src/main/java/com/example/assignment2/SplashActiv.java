package com.example.assignment2;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class SplashActiv extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        ImageView appLogo = findViewById(R.id.appLogo);
        Animation translate = AnimationUtils.loadAnimation(this, R.anim.translation);
        Animation scale = AnimationUtils.loadAnimation(this, R.anim.scaling);

        appLogo.startAnimation(translate);
        appLogo.startAnimation(scale);

        new Handler().postDelayed(() -> {
            Intent intent = new Intent(SplashActiv.this, MainActivity.class);
            startActivity(intent);
            finish();
        }, 4500);
    }
}
