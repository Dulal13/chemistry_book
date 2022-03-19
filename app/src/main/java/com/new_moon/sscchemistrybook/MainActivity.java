package com.new_moon.sscchemistrybook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

public class MainActivity extends AppCompatActivity {

    Handler handler = new Handler(Looper.getMainLooper());
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

       handler.postDelayed(new Runnable() {
           @Override
           public void run() {
               Intent chapter = new Intent(MainActivity.this , ChapterList.class);
               startActivity(chapter);
               finish();
           }
       },3000);
    }
}