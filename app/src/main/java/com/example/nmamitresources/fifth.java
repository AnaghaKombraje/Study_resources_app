package com.example.nmamitresources;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class fifth extends AppCompatActivity {
    Button a1,a2,a3,a4,a5,a6,a7,a18,a9,a10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);
        a1=findViewById(R.id.a1);
        a2=findViewById(R.id.a2);
        a3=findViewById(R.id.a3);
        a4=findViewById(R.id.a4);
        a5=findViewById(R.id.a5);
        a6=findViewById(R.id.a6);
        a7=findViewById(R.id.a7);
        a18=findViewById(R.id.a18);

        a9=findViewById(R.id.a9);
        a10=findViewById(R.id.a10);
        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://drive.google.com/drive/folders/1cZqsVSVPuZbPSAMg5eOe0U_AqhV-jSRm?usp=share_link");
            }
        });
        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://drive.google.com/drive/folders/1xZE1vJvMbo8K9zYZSzl3-7Zf7YUeoYhH?usp=share_link");
            }
        });
        a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://drive.google.com/drive/folders/1UAQAJ0VRaTWJPHbbEyXySwd5atPRB4ZT?usp=share_link");
            }
        });
        a4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://drive.google.com/drive/folders/1364G2rTdkhbZlI3eYYMG-mRdKHTFhShT?usp=share_link");
            }
        });
        a5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://drive.google.com/drive/folders/1f6vy85jS477rQyonQ8sg-9BxdVPKcj4O?usp=share_link");
            }
        });
        a6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://drive.google.com/drive/folders/18DLjFuDN0ie1yY24XesOV3P4v-C9HmRt?usp=share_link");
            }
        });
        a7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://drive.google.com/drive/folders/1LEahghRnPSdT7Yct9mLjFITQkVgoCdis?usp=share_link");
            }
        });
        a18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://drive.google.com/folderview?id=1knDfUBZvIz-PUXhKqce6F1vjHC7FA6LO");
            }
        });
        a9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://drive.google.com/drive/folders/10x9ulyPAPDjHjGlRitZnuAItcTZ5QUWc?usp=share_link");
            }
        });
        a10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://drive.google.com/file/d/1jYg6SW5cT-V2SjZB3Ucg4oIKsWJOwC-9/view?usp=share_link");
            }
        });
    }
    private void goLink (String s){
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }

}