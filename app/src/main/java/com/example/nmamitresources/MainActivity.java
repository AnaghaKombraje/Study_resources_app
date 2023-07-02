package com.example.nmamitresources;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText usn;
    SQLiteDatabase db;
    CalendarView calendar;
    TextView date_view;
    Button sub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        db=openOrCreateDatabase("usndb",MODE_PRIVATE,null);
        sub=findViewById(R.id.sub);
        usn=findViewById(R.id.usn);
        calendar = (CalendarView)  findViewById(R.id.calendar);
        date_view = (TextView)findViewById(R.id.date_view);
        ArrayList<String> l=new ArrayList<>();

        l.add("4nm");
        l.add("4NM");
        l.add("is");
        l.add("IS");
        l.add("19");
        l.add("20");
        l.add("21");
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String u=usn.getText().toString();
                String sb="";
                @SuppressLint("Recycle") Cursor c = db.rawQuery("select usn from usndb1 where usn='"+u+"'",null);
                if(c.moveToFirst())
                {
                    do {

                        int column=c.getColumnCount();
                        for(int idx=0;idx<column;idx++)
                        {
                            sb=sb+c.getString(idx);
                        }
                    }while(c.moveToNext());
                }
                if(sb.equals(""))
                {
                    Toast.makeText(MainActivity.this, "Enter a valid usn!", Toast.LENGTH_SHORT).show();

                }
                else if(sb.equals(u))
                {
                    Intent i=new Intent(MainActivity.this,res.class);
                    startActivity(i);
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Enter a valid usn!", Toast.LENGTH_SHORT).show();
                }
               /* if(l.contains(u.substring(0,3))&& l.contains(u.substring(5,7)) && l.contains(u.substring(3,5))&&u.length()==10&&  Integer.parseInt(u.substring(7,10))>0 && Integer.parseInt(u.substring(7,10))<240)
                {
                    Intent i=new Intent(MainActivity.this,res.class);
                    startActivity(i);
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Enter a valid usn!", Toast.LENGTH_SHORT).show();
                }*/

            }
        });
        calendar.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
                            @Override

                            public void onSelectedDayChange(
                                    @NonNull CalendarView view,
                                    int year,
                                    int month,
                                    int dayOfMonth)
                            {
                                String Date= dayOfMonth + "-"+ (month + 1) + "-" + year;
                                date_view.setText(Date);
                            }

                        });


    }
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.web_link,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.item1:
                goLink("https://nmamit.nitte.edu.in/admissions.php");
                break;
            case R.id.item2:

                goLink("https://nmamit.nitte.edu.in/research-national.php");
                break;
            case R.id.item3:

                goLink("http://guru.nmamit.in/");
                break;
            case R.id.item4:

                goLink("http://parent-login.nmamit.in/index.php");
                break;
            case R.id.item5:

                goLink("http://nmamit.in/result/index.php");
                break;
            case R.id.item6:
                Intent i1=new Intent(MainActivity.this,adminusn.class);
                startActivity(i1);
        }
        return super.onOptionsItemSelected(item);
    }
    private void goLink (String s){
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }

}