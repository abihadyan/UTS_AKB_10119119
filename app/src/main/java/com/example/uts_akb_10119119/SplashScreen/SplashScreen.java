package com.example.uts_akb_10119119.SplashScreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

import com.example.uts_akb_10119119.R;
import com.example.uts_akb_10119119.ViewPager.SlideActivity;

//NIM     : 10119119
//NAMA    : MUHAMMAD HADYAN NUR ADABI
//KELAS   : IF-3

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        int time = 2000;

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen.this, SlideActivity.class);
                SplashScreen.this.startActivity(intent);
                SplashScreen.this.finish();
            }
        },time);
    }
}