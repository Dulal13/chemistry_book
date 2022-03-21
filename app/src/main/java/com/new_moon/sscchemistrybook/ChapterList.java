package com.new_moon.sscchemistrybook;

import static com.new_moon.sscchemistrybook.PdfView.chapter;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.LinearLayout;



public class ChapterList extends AppCompatActivity {

    LinearLayout chapterOne , chapterTwo , chapterThree , chapterFour , chapterFive , chapterSix , chapterSeven , chapterEight , chapterNine , chapterTen , chapterEleven , chapterTweleve;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter_list);
        getSupportActionBar().hide();


        chapterOne = findViewById(R.id.chapterOne);
        chapterTwo = findViewById(R.id.chapterTwo);
        chapterThree = findViewById(R.id.chapterThree);
        chapterFour = findViewById(R.id.chapterFour);
        chapterFive = findViewById(R.id.chapterFive);
        chapterSix = findViewById(R.id.chapterSix);
        chapterSeven = findViewById(R.id.chapterSeven);
        chapterEight = findViewById(R.id.chapterEight);
        chapterNine = findViewById(R.id.chapterNine);
        chapterTen = findViewById(R.id.chapterTen);
        chapterEleven = findViewById(R.id.chapterEleven);
        chapterTweleve = findViewById(R.id.chapterTweleve);

//        MobileAds.initialize(this, new OnInitializationCompleteListener() {
//            @Override
//            public void onInitializationComplete(InitializationStatus initializationStatus) {
//            }
//        });

//        mAdView = findViewById(R.id.adView);
//        AdRequest adRequest = new AdRequest.Builder().build();
//        mAdView.loadAd(adRequest);
      
      
            chapterOne.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {


                        chapter = 1;
                        Intent pdf = new Intent(ChapterList.this , PdfView.class);
                        startActivity(pdf);

                }
            });
            chapterTwo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    chapter = 2;
                    Intent pdf = new Intent(ChapterList.this , PdfView.class);
                    startActivity(pdf);
                }
            });
            chapterThree.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    chapter = 3;
                    Intent pdf = new Intent(ChapterList.this , PdfView.class);
                    startActivity(pdf);
                }
            });
            chapterFour.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    chapter = 4;
                    Intent pdf = new Intent(ChapterList.this , PdfView.class);
                    startActivity(pdf);
                }
            });
            chapterFive.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    chapter = 5;
                    Intent pdf = new Intent(ChapterList.this , PdfView.class);
                    startActivity(pdf);
                }
            });
            chapterSix.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    chapter = 6;
                    Intent pdf = new Intent(ChapterList.this , PdfView.class);
                    startActivity(pdf);
                }
            });
            chapterSeven.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    chapter = 7;
                    Intent pdf = new Intent(ChapterList.this , PdfView.class);
                    startActivity(pdf);
                }
            });
            chapterEight.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    chapter = 8;
                    Intent pdf = new Intent(ChapterList.this , PdfView.class);
                    startActivity(pdf);
                }
            });
            chapterNine.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    chapter = 9;
                    Intent pdf = new Intent(ChapterList.this , PdfView.class);
                    startActivity(pdf);
                }
            });
            chapterTen.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    chapter = 10;
                    Intent pdf = new Intent(ChapterList.this , PdfView.class);
                    startActivity(pdf);
                }
            });
            chapterEleven.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    chapter = 11;
                    Intent pdf = new Intent(ChapterList.this , PdfView.class);
                    startActivity(pdf);
                }
            });
            chapterTweleve.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    chapter = 12;
                    Intent pdf = new Intent(ChapterList.this , PdfView.class);
                    startActivity(pdf);
                }
            });
        
        

    }




}