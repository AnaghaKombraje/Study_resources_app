package com.example.nmamitresources;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class fourth extends AppCompatActivity {
Button a1,a2,a3,a4,a5,a6,a7,a8,a9,a10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        a1=findViewById(R.id.a1);
        a2=findViewById(R.id.a2);
        a3=findViewById(R.id.a3);
        a4=findViewById(R.id.a4);
        a5=findViewById(R.id.a5);
        a6=findViewById(R.id.a6);
        a7=findViewById(R.id.a7);
        a8=findViewById(R.id.a8);
        a9=findViewById(R.id.a9);
        a10=findViewById(R.id.a10);
        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://drive.google.com/drive/folders/1DtmUUEwocMfsukV7fzlQZqMmiPf3EV1u?usp=share_link");
            }
        });
        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://drive.google.com/drive/folders/1vtnFLDBuo-m3HCWN2_bL0Hb6hh3YgoO8?usp=share_link");
            }
        });
        a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://drive.google.com/drive/folders/1pXOq4kodRYi1UgMTuqdpuAnUeWi7nenj?usp=share_link");
            }
        });
        a4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://drive.google.com/drive/folders/1mJZkNQb9XswTp82-TMQ3mpjwH2vYZZB0?usp=share_link");
            }
        });
        a5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://drive.google.com/drive/folders/1JONVvnFc5IXhcSt6PpkQRapKn5xmowVF?usp=share_link");
            }
        });
        a6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://drive.google.com/drive/folders/1I0zUr8EDvnnQ65At_T5p6FK-dkgXXFgN?usp=share_link");
            }
        });
        a7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://drive.google.com/drive/folders/1tc76LS6vR-odpJAOQwtfV4TM57y-fqFT?usp=share_link");
            }
        });
        a8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://drive.google.com/drive/folders/1b-L4lTSX91_vIW6Ir_eCZ99bjsKYn584?usp=share_link");
            }
        });
        a9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://drive.google.com/drive/folders/1M8lyOErr_JHT0xhluamAirMBap_3G-4w?usp=share_link");
            }
        });
        a10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://drive.google.com/file/d/190ytmxlesNOW5q86C4iyIAxYns8HyC41/view?usp=share_link");
            }
        });

    }

    private void goLink (String s){
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
}