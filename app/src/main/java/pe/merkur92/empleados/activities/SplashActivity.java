package pe.merkur92.empleados.activities;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import pe.merkur92.empleados.R;
import pe.merkur92.empleados.activities.MainActivity;

public class SplashActivity extends AppCompatActivity {

    private static final Integer TIMER_SPLASH = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                intentMain();
            }
        }, TIMER_SPLASH);
    }

    private void intentMain() {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
        finish();
    }
}
