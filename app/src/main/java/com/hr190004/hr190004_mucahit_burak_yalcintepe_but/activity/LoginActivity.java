package com.hr190004.hr190004_mucahit_burak_yalcintepe_but.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.hr190004.hr190004_mucahit_burak_yalcintepe_but.R;
import com.hr190004.hr190004_mucahit_burak_yalcintepe_but.util.NetworkUtil;

public class LoginActivity extends AppCompatActivity {

    EditText Ad;
    EditText Soyad;
    Button btnKaydol;

    private void init(){
        Ad = findViewById(R.id.editTextAd);
        Soyad = findViewById(R.id.editTextSoyad);
        btnKaydol = findViewById(R.id.btnKayit);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getWindow().setStatusBarColor(ContextCompat.getColor(LoginActivity.this,R.color.status_bar));
        init();

        btnKaydol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String kullaniciAd = Ad.getText().toString();
                String kullaniciSoyad = Soyad.getText().toString();

                if(v.getId() == R.id.btnKayit) {
                    if (kullaniciAd == null || kullaniciAd.equals("") || kullaniciSoyad == null || kullaniciSoyad.equals("")) {
                        Toast.makeText(getApplicationContext(), "Gerekli alanları doldurunuz.", Toast.LENGTH_LONG).show();
                    } else {
                        SharedPreferences sharedPref = getSharedPreferences("Ad", 0);
                        getSharedPreferences("Soyad", 0);
                        SharedPreferences.Editor editor = sharedPref.edit();
                        editor.putString("Ad", kullaniciAd);
                        editor.putString("Soyad", kullaniciSoyad);
                        editor.commit();

                        if (!NetworkUtil.isOnline(LoginActivity.this)) {
                            openNextNotConnectScreenActivity();
                        } else {
                            openNextConnectScreenActivity();
                        }
                    }
                }
            }
        });
    }

    private void openNextNotConnectScreenActivity(){

        Log.e("COUNTER","FİNİSH");
        Intent secondActivityIntent=new Intent(getApplicationContext(), InternetYokActivity.class);
        startActivity(secondActivityIntent);
        finish();

    }

    private void openNextConnectScreenActivity(){

        Log.e("COUNTER","FİNİSH");
        Intent secondActivityIntent=new Intent(getApplicationContext(), InternetVarActivity.class);
        startActivity(secondActivityIntent);
        finish();

    }
}