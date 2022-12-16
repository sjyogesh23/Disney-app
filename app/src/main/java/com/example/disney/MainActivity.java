package com.example.disney;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private static int b = 5000;


    //If Back pressed the app will close
    @Override
    public void onBackPressed(){
        Intent abc= new Intent(Intent.ACTION_MAIN);
        abc.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(abc);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.disney);

        ImageView av = findViewById(R.id.i1);

        av.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,avengers.class);
                startActivity(i);
            }
        });

        ImageView pl = findViewById(R.id.ply);

        pl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j = new Intent(MainActivity.this,playlist.class);
                startActivity(j);
            }
        });

        ImageView call=findViewById(R.id.call);
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent c=new Intent(Intent.ACTION_CALL);
                c.setData(Uri.parse("9940441223"));

                    if(ActivityCompat.checkSelfPermission(MainActivity.this,Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                    return;
                }
                startActivity(c);
            }
        });

        LinearLayout a1 = findViewById(R.id.b1);
        LinearLayout a2 = findViewById(R.id.b2);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //Intent k = new Intent(R.id.b1,R.id.b2);
            }
        },b
        );

    }
}