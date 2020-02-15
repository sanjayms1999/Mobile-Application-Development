package com.example.myapplication22;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Secondactivity extends AppCompatActivity {
     TextView t1,t2,t3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        t1=(TextView)findViewById(R.id.textView8);
        t2=(TextView)findViewById(R.id.textView9);
        t3=(TextView)findViewById(R.id.textView10)

        Intent i = getIntent();
        name = i.getStringExtra("name_key");
        Reg= i.getStringExtra("reg_key");
        dept = i.getStringExtra("dept_key");
        t1.setText(name);
        t2.setText(reg);
        t3.setText(dept);
    }
}
