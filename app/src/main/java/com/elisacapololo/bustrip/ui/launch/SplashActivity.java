package com.elisacapololo.bustrip.ui.launch;

import android.content.Intent;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.elisacapololo.bustrip.R;
import com.elisacapololo.bustrip.ui.main.NavigationActivity;

public class SplashActivity extends AppCompatActivity {

    private int seconds = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        runTimer();
    }

    public void runTimer() {
        final Handler handle = new Handler();
        handle.post(new Runnable(){
            @Override
            public void run() {
                if(++seconds == 5){
                    Intent intent = new Intent(SplashActivity.this, NavigationActivity.class);
                    startActivity(intent);
                    finish();
                }
                handle.postDelayed(this, 1000);
            }
        });
    }

}
