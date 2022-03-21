package com.new_moon.sscchemistrybook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.media.MediaSync;
import android.media.SoundPool;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.github.barteksc.pdfviewer.PDFView;
import com.google.android.material.progressindicator.CircularProgressIndicator;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Timer;
import java.util.TimerTask;

import javax.net.ssl.HttpsURLConnection;

public class PdfView extends AppCompatActivity {

    PDFView pdfView;
    ProgressBar pd;
    public static int chapter ;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_view);
        getSupportActionBar().hide();
        pdfView = findViewById(R.id.pdfView);
        pd = findViewById(R.id.pd);
        
        boolean res = isConnected(this);



       if(res){
           if(chapter == 1){
               pdfView.setVisibility(View.VISIBLE);
               pd.setVisibility(View.GONE);
               pdfView.fromAsset("chapter1.pdf").load();

           }
           else if(chapter == 2){
               pdfView.setVisibility(View.VISIBLE);
               pd.setVisibility(View.GONE);
               pdfView.fromAsset("chapter2.pdf").load();
           }
           else if(chapter == 3){
               pdfView.setVisibility(View.VISIBLE);
               pd.setVisibility(View.GONE);
               pdfView.fromAsset("chapter3.pdf").load();
           }
           else if(chapter == 4){
               pdfView.setVisibility(View.VISIBLE);
               pd.setVisibility(View.GONE);
               pdfView.fromAsset("chapter4.pdf").load();
           }
           else if(chapter == 5){
               pdfView.setVisibility(View.VISIBLE);
               pd.setVisibility(View.GONE);
               pdfView.fromAsset("chapter5.pdf").load();
           }
           else if(chapter == 6){
               pdfView.setVisibility(View.VISIBLE);
               pd.setVisibility(View.GONE);
               pdfView.fromAsset("chapter6.pdf").load();
           }
           else if(chapter == 7){
               pdfView.setVisibility(View.VISIBLE);
               pd.setVisibility(View.GONE);
               pdfView.fromAsset("chapter7.pdf").load();
           }
           else if(chapter == 8){
               pdfView.setVisibility(View.VISIBLE);
               pd.setVisibility(View.GONE);
               pdfView.fromAsset("chapter8.pdf").load();
           }
           else if(chapter == 9){
               pdfView.fromAsset("chapter9.pdf").load();
           }
           else  if(chapter == 10){
               pdfView.setVisibility(View.VISIBLE);
               pd.setVisibility(View.GONE);
               pdfView.fromAsset("chapter10.pdf").load();
           }
           else if(chapter == 11){
               pdfView.setVisibility(View.VISIBLE);
               pd.setVisibility(View.GONE);
               pdfView.fromAsset("chapter11.pdf").load();
           }
           else if(chapter == 12){
               pdfView.setVisibility(View.VISIBLE);
               pd.setVisibility(View.GONE);
               pdfView.fromAsset("chapter12.pdf").load();
           }
       }
       else{
           Toast.makeText(PdfView.this,
                   "Please Connect with internet and go back", Toast.LENGTH_LONG).show();
                    pdfView.setVisibility(View.GONE);
                    pd.setVisibility(View.VISIBLE);

       }

    }





    private boolean isConnected(PdfView pdfView) {
        ConnectivityManager connectivityManager = (ConnectivityManager) pdfView.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo wifi = connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
        NetworkInfo mobile = connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);

        if ((wifi != null && wifi.isConnected()) || (mobile != null && mobile.isConnected())) {
            return true;
        } else {
            return false;
        }
    }




}


