package com.example.optimus.tarotkeywords;

import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnAbout, btnRid, btnMajor, btnAir, btnWater, btnFire, btnEarth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnAir = (Button)findViewById(R.id.btnSwords);
        btnEarth = (Button)findViewById(R.id.btnPentacles);
        btnFire = (Button)findViewById(R.id.btnWands);
        btnWater = (Button)findViewById(R.id.btnCups);
        btnMajor = (Button)findViewById(R.id.btnMajor);
        btnAbout = (Button)findViewById(R.id.btnAbout);
        btnRid = (Button)findViewById(R.id.btnRid);

        btnAbout.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Dialog d = new Dialog(MainActivity.this);
                d.setContentView(R.layout.about);
                d.setTitle("Về tui");
                d.show();
            }
        });
        btnMajor.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goMajor = new Intent(MainActivity.this, MajorArcana.class);
                startActivity(goMajor);
                //Toast.makeText(getApplicationContext(),"WHERE ARE YOU NOW?", Toast.LENGTH_LONG).show();
            }
        });
        btnAir.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goAir = new Intent(MainActivity.this, MinorArcanaSwords.class);
                startActivity(goAir);
                //Toast.makeText(getApplicationContext(),"WHERE ARE YOU NOW?", Toast.LENGTH_LONG).show();
            }
        });
        btnEarth.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goEarth = new Intent(MainActivity.this, MinorArcanaPentacles.class);
                startActivity(goEarth);
                //Toast.makeText(getApplicationContext(),"WHERE ARE YOU NOW?", Toast.LENGTH_LONG).show();
            }
        });
        btnWater.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goWater = new Intent(MainActivity.this, MinorArcanaCups.class);
                startActivity(goWater);
                //Toast.makeText(getApplicationContext(),"WHERE ARE YOU NOW?", Toast.LENGTH_LONG).show();
            }
        });
        btnFire.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goFire = new Intent(MainActivity.this, MinorArcanaWands.class);
                startActivity(goFire);
                //Toast.makeText(getApplicationContext(),"WHERE ARE YOU NOW?", Toast.LENGTH_LONG).show();
            }
        });
    }
}
