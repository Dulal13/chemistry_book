package com.new_moon.sscchemistrybook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.widget.Toast;

import com.github.barteksc.pdfviewer.PDFView;

public class PdfView extends AppCompatActivity {
    PDFView pdfView;
    public static int chapter ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_view);
        getSupportActionBar().hide();
        pdfView = findViewById(R.id.pdfView);
        
        boolean res = isConnected(this);

       if(res){
           if(chapter == 1){
               pdfView.fromAsset("chapter1.pdf").load();
           }
           else if(chapter == 2){
               pdfView.fromAsset("chapter2.pdf").load();
           }
           else if(chapter == 3){
               pdfView.fromAsset("chapter3.pdf").load();
           }
           else if(chapter == 4){
               pdfView.fromAsset("chapter4.pdf").load();
           }
           else if(chapter == 5){
               pdfView.fromAsset("chapter5.pdf").load();
           }
           else if(chapter == 6){
               pdfView.fromAsset("chapter6.pdf").load();
           }
           else if(chapter == 7){
               pdfView.fromAsset("chapter7.pdf").load();
           }
           else if(chapter == 8){
               pdfView.fromAsset("chapter8.pdf").load();
           }
           else if(chapter == 9){
               pdfView.fromAsset("chapter9.pdf").load();
           }
           else  if(chapter == 10){
               pdfView.fromAsset("chapter10.pdf").load();
           }
           else if(chapter == 11){
               pdfView.fromAsset("chapter11.pdf").load();
           }
           else if(chapter == 12){
               pdfView.fromAsset("chapter12.pdf").load();
           }
       }
       else{
           Toast.makeText(PdfView.this,
                   "Please Connect with internet and go back", Toast.LENGTH_LONG).show();

       }

    }

    private boolean isConnected(PdfView pdfView) {
        ConnectivityManager connectivityManager = (ConnectivityManager) pdfView.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo wifi = connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
        NetworkInfo mobile = connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);

        if((wifi != null && wifi.isConnected()) || (mobile != null && mobile.isConnected()) ){
            return true;
        }
        else{
            return false;
        }

    }
}