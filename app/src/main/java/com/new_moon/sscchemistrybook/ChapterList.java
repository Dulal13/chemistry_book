package com.new_moon.sscchemistrybook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ChapterList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter_list);
        getSupportActionBar().hide();
    }
}