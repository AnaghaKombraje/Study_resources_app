package com.example.nmamitresources;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sixth extends AppCompatActivity {
    Button a1,a2,a3,a4,a5,a6,a7,a18,a9,a10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth);

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
                goLink("https://drive.google.com/drive/folders/1ED_tl2nbetA2-xoXfOnOsZNurfewzhm_?usp=share_link");
            }
        });
        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://drive.google.com/drive/folders/1he4sqNKPSlo_4v3aolho8T_Nm9vOHGGh?usp=share_link");
            }
        });
        a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://drive.google.com/drive/folders/1AG_sblO4lXoSOZN4VZyaNgPhRKDjlFa0?usp=share_link");
            }
        });
        a4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://drive.google.com/drive/folders/1Jf6N1peTTUeR1C01uYNgJwWql0ksa1qu?usp=share_link");
            }
        });
        a5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://drive.google.com/drive/folders/1ZTQyiuKe6YvZVXVImKpd83WELjfY2i1v?usp=share_link");
            }
        });
        a6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://drive.google.com/drive/folders/1Q15nwvLZ0T36uvfLyI3Z9dWnTSE-jDnS?usp=share_link");
            }
        });
        a7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://drive.google.com/drive/folders/1xRy7YdHeACBtrfKXL5EIDBBfl-aSewCZ?usp=share_link");
            }
        });
        a18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://drive.google.com/drive/folders/19pLUg6VhcoRj-PIcLJATWHyL0vHiKs9R?usp=share_link");
            }
        });
        a9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://drive.google.com/drive/folders/1Jf6N1peTTUeR1C01uYNgJwWql0ksa1qu?usp=share_link");
            }
        });
        a10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://drive.google.com/drive/folders/1iw0BrxblV1neVRE0EJOrT6ATM1uNn4ky?usp=share_link");
            }
        });
    }
    private void goLink (String s){
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
}