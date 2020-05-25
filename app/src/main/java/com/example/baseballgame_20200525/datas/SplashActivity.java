package com.example.baseballgame_20200525.datas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.baseballgame_20200525.BaseActivity;
import com.example.baseballgame_20200525.MainActivity;
import com.example.baseballgame_20200525.R;

public class SplashActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        setUpEvents();
        setValues();
    }

    @Override
    public void setUpEvents() {

    }

    @Override
    public void setValues() {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent myIntent = new Intent(mContext, MainActivity.class);
                startActivity(myIntent);

                finish();
            }
        }, 2000);

    }
}
