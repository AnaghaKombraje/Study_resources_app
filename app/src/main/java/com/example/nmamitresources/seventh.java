package com.example.nmamitresources;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class seventh extends AppCompatActivity {
    Button a1,a2,a3,a4,a5,a6,a9,a10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventh);

        a1=findViewById(R.id.a1);
        a2=findViewById(R.id.a2);
        a3=findViewById(R.id.a3);
        a4=findViewById(R.id.a4);
        a5=findViewById(R.id.a5);
        a6=findViewById(R.id.a6);
        a9=findViewById(R.id.a9);
        a10=findViewById(R.id.a10);
        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://drive.google.com/drive/folders/1ynvMdBJEkmek9P3GSwvo44ITVwAM7Obn?usp=share_link");
            }
        });
        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://drive.google.com/drive/folders/10pD4jKT5WRMA61Pr_CNPyIYZ_ORjKmmv?usp=share_link");
            }
        });
        a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://drive.google.com/drive/folders/1dkJX3BRcdC2sca5Ebfs_nNti0OCys-e8?usp=share_link");
            }
        });
        a4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://drive.google.com/drive/folders/1Lst0imrNK3XEHbhJgWUgbCDdQqohtIF2?usp=share_link");
            }
        });
        a5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://drive.google.com/drive/folders/1Lst0imrNK3XEHbhJgWUgbCDdQqohtIF2?usp=share_link");
            }
        });
        a6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://drive.google.com/drive/folders/139zxDut-RgOysTglptWzacM_TTutGAiy?usp=share_link");
            }
        });

        a9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://drive.google.com/drive/folders/1eNFhzgk5Ya_Ep4mI-rv5HmFtM1jAT7rG?usp=share_link");
            }
        });
        a10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://drive.google.com/drive/folders/1SU97xdwkxtYlSxLydOdhVf1dtb2ddDcO?usp=share_link");
            }
        });
    }
    private void goLink (String s){
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
}