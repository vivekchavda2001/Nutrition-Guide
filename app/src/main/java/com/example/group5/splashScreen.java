package com.example.group5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class splashScreen extends AppCompatActivity {
    TextView mSlogan;
    Button mLoginButton;
    ImageView mLogo;
    Animation topAnim,bottomAnim;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        topAnim = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottomAnim = AnimationUtils.loadAnimation(this,R.anim.bottom_animation);
        mLogo = findViewById(R.id.logo);
        mLoginButton = findViewById(R.id.login);
        mSlogan = findViewById(R.id.slogan);
        mLoginButton.setAnimation(bottomAnim);
        mLogo.setAnimation(topAnim);
        mSlogan.setAnimation(topAnim);

    }
}