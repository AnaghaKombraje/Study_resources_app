package com.example.nmamitresources;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class adminusn1 extends AppCompatActivity {

    SQLiteDatabase db;
    EditText e1;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adminusn1);
        e1=findViewById(R.id.e1);
        b=findViewById(R.id.b);
        db=openOrCreateDatabase("usndb",MODE_PRIVATE,null);
        db.execSQL("create table if not exists usndb1(usn varchar(20) primary key)");
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=e1.getText().toString();
                db.execSQL("insert into usndb1 values('"+s+"')");
                Toast.makeText(adminusn1.this, "USN added to database", Toast.LENGTH_SHORT).show();
            }
        });
    }
}