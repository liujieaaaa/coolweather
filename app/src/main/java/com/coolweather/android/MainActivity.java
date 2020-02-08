package com.coolweather.android;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //从SharedPreferences中读取缓存文件，如果不为空，就没必要再次选择城市了，直接跳转即可
        SharedPreferences prefs= PreferenceManager.getDefaultSharedPreferences
                (this);
        if(prefs.getString("weather",null)!=null){
            Intent intent =new Intent(this,WeatherActivity.class);
            startActivity(intent);
            finish();
        }
    }
}
