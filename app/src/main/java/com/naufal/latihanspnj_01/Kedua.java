package com.naufal.latihanspnj_01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Kedua extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kedua);

        Button next = findViewById(R.id.bttn2);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), Awal.class);
                startActivityForResult(myIntent, 0);
            }

        });
    }
}
