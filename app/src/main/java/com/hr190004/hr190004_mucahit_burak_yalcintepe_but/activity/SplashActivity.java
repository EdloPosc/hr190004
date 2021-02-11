package com.hr190004.hr190004_mucahit_burak_yalcintepe_but.activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.hr190004.hr190004_mucahit_burak_yalcintepe_but.R;
import com.hr190004.hr190004_mucahit_burak_yalcintepe_but.util.NetworkUtil;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        init();
        getWindow().setStatusBarColor(ContextCompat.getColor(SplashActivity.this,R.color.status_bar));

    }

    private void init(){
        CountDownTimer countDownTimer = new CountDownTimer(4000, 1000) {
            @Override
            public void onTick(long l) {

                Log.e("COUNTER", "TİCK");
            }

            @Override
            public void onFinish() {
                SharedPreferences sharedPref = getSharedPreferences("Ad", 0);
                getSharedPreferences("Soyad", 0);
                String Ad = sharedPref.getString("Ad", null );
                String Soyad = sharedPref.getString("Soyad", null);

                if(Ad == null || Ad.equals("") || Soyad == null || Soyad.equals("")){
                    openNextLoginScreenActivity();
                }else{
                    if (!NetworkUtil.isOnline(SplashActivity.this)) {
                        openNextNotConnectScreenActivity();
                    } else {
                        openNextConnectScreenActivity();
                    }
                }
            }
        };
        countDownTimer.start();
    }

    private void openNextLoginScreenActivity(){

        Log.e("COUNTER","FİNİSH");
        Intent secondActivityIntent=new Intent(getApplicationContext(), LoginActivity.class);
        startActivity(secondActivityIntent);
        finish();

    }

    private void openNextConnectScreenActivity(){

        Log.e("COUNTER","FİNİSH");
        Intent secondActivityIntent=new Intent(getApplicationContext(), InternetVarActivity.class);
        startActivity(secondActivityIntent);
        finish();

    }

    private void openNextNotConnectScreenActivity(){

        Log.e("COUNTER","FİNİSH");
        Intent secondActivityIntent=new Intent(getApplicationContext(), InternetYokActivity.class);
        startActivity(secondActivityIntent);
        finish();

    }
}