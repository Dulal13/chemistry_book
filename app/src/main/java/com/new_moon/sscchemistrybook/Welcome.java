package com.new_moon.sscchemistrybook;


import androidx.appcompat.app.AppCompatActivity;


import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class Welcome extends AppCompatActivity {

    Button nextPage ,check;
    LinearLayout welcome;
    RelativeLayout noInternet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        getSupportActionBar().hide();

        nextPage = findViewById(R.id.nextPage);
        check = findViewById(R.id.check);
        welcome = findViewById(R.id.welcome);
        noInternet = findViewById(R.id.noInternet);

        checkInternet();

        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkInternet();
            }
        });


        nextPage.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent = new Intent(Welcome.this , ChapterList.class);
               startActivity(intent);
           }
       });





    }

    private void checkInternet() {

        ConnectivityManager manager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo info = manager.getActiveNetworkInfo();

        if(info != null){

            if(info.isConnected()){

                welcome.setVisibility(View.VISIBLE);
                noInternet.setVisibility(View.GONE);

            }
            else{
                welcome.setVisibility(View.GONE);
                noInternet.setVisibility(View.VISIBLE);

            }
        }
        else{
            welcome.setVisibility(View.GONE);
            noInternet.setVisibility(View.VISIBLE);

        }

    }


}