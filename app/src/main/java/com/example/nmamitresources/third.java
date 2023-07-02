package com.example.nmamitresources;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class third extends AppCompatActivity {
    Button a1,a2,a3,a4,a5,a6,a7,a18,a9,a10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
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
                goLink("https://drive.google.com/drive/folders/1ZmCoK1l9wBaNMtVbWq-ntRIO0aLs-WoV?usp=share_link");
            }
        });
        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://drive.google.com/drive/folders/1Pn3D97NPRhOWlMGj4y7b1-0nBCls4qCX?usp=share_link");
            }
        });
        a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://drive.google.com/drive/folders/1qw45ZzNxtzMCY5gBq_knaVXQVMp0Dw8l?usp=share_link");
            }
        });
        a4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://drive.google.com/drive/folders/1-Fq_C6efK0qA_XKj0AXTvExv6LgMUgFT?usp=share_link");
            }
        });
        a5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://drive.google.com/drive/folders/1NTBswBPihHCi76vzdVVbmp-bp-Ru3f6P?usp=share_link");
            }
        });
        a6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://drive.google.com/drive/folders/124xFb5QgB5DlnLK_w2eI98whEIrQX9A5?usp=share_link");
            }
        });
        a7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://drive.google.com/drive/folders/1tZouGQsmLQVYpYkNxj7KSN9YQfbgLLsB?usp=share_link");
            }
        });
        a18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://drive.google.com/drive/folders/1xPTKbm02ehJE9XRMkR7DMGpbbmTnbMex?usp=share_link");
            }
        });
        a9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://drive.google.com/drive/folders/1gDxXCeBwSemO5wLWS9UgptpjxCLrG-aM?usp=share_link");
            }
        });
        a10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://drive.google.com/file/d/1v46Ko6H7ZnTV7XSzYlR82pwAFUTZSlWs/view?usp=share_link");
            }
        });
    }
    private void goLink (String s){
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
}