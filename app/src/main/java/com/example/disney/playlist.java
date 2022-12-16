package com.example.disney;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class playlist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.playlist);

        ImageView av = findViewById(R.id.eg);

        av.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(playlist.this,avengers.class);
                startActivity(i);
            }
        });

        ImageView bc = findViewById(R.id.bac);

        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(playlist.this,MainActivity.class);
                startActivity(i);
            }
        });
    }
}