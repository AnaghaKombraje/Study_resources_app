package com.example.nmamitresources;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class adminusn extends AppCompatActivity {
   Button bb;
   EditText ee;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adminusn);
       ee=findViewById(R.id.ee);
       bb=findViewById(R.id.bb);
       bb.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               String s="";
               s=ee.getText().toString();
               if(s.equals("nitte"))
               {
                   Intent i=new Intent(adminusn.this,adminusn1.class);
                   startActivity(i);
               }
               else
               {
                   Toast.makeText(adminusn.this, "Enter valid password", Toast.LENGTH_SHORT).show();
               }
           }
       });
    }
}