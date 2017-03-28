package com.example.optimus.tarotkeywords;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Optimus on 20-Aug-16.
 */
public class MinorArcanaCups extends AppCompatActivity {
    TextView cdes;
    Button aoc, twoc, thoc, foc, fvoc, soc, svoc, eoc, noc, toc, poc, knoc, qoc, koc;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cups);
    cdes = (TextView)findViewById(R.id.cdes);
        aoc = (Button)findViewById(R.id.cups1);
        twoc = (Button)findViewById(R.id.cups2);
        thoc = (Button)findViewById(R.id.cups3);
        foc = (Button)findViewById(R.id.cups4);
        fvoc = (Button)findViewById(R.id.cups5);
        soc = (Button)findViewById(R.id.cups6);
        svoc = (Button)findViewById(R.id.cups7);
        eoc = (Button)findViewById(R.id.cups8);
        noc = (Button)findViewById(R.id.cups9);
        toc = (Button)findViewById(R.id.cups10);
        poc = (Button)findViewById(R.id.poc);
        knoc = (Button)findViewById(R.id.knoc);
        qoc = (Button)findViewById(R.id.qoc);
        koc = (Button)findViewById(R.id.koc);

        cdes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dialog d = new Dialog(MinorArcanaCups.this);
                d.setContentView(R.layout.minorcups);
                d.setTitle("Mô tả chung");
                d.show();
            }
        });
        aoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MinorArcanaCups.this, MajorSub.class);
                myIntent.putExtra("layout", R.layout.cupsace);
                startActivity(myIntent);
            }
        });
        twoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MinorArcanaCups.this, MajorSub.class);
                myIntent.putExtra("layout", R.layout.cupstwo);
                startActivity(myIntent);
            }
        });
        thoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MinorArcanaCups.this, MajorSub.class);
                myIntent.putExtra("layout", R.layout.cupsthree);
                startActivity(myIntent);
            }
        });
        foc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MinorArcanaCups.this, MajorSub.class);
                myIntent.putExtra("layout", R.layout.cupsfour);
                startActivity(myIntent);
            }
        });
        fvoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MinorArcanaCups.this, MajorSub.class);
                myIntent.putExtra("layout", R.layout.cupsfive);
                startActivity(myIntent);
                //setContentView(R.layout.thefool);
            }
        });
        soc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MinorArcanaCups.this, MajorSub.class);
                myIntent.putExtra("layout", R.layout.cupssix);
                startActivity(myIntent);
            }
        });
        svoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MinorArcanaCups.this, MajorSub.class);
                myIntent.putExtra("layout", R.layout.cupsseven);
                startActivity(myIntent);
            }
        });
        eoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MinorArcanaCups.this, MajorSub.class);
                myIntent.putExtra("layout", R.layout.cupseight);
                startActivity(myIntent);
            }
        });
        noc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MinorArcanaCups.this, MajorSub.class);
                myIntent.putExtra("layout", R.layout.cupsnine);
                startActivity(myIntent);
            }
        });
        toc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MinorArcanaCups.this, MajorSub.class);
                myIntent.putExtra("layout", R.layout.cupsten);
                startActivity(myIntent);
            }
        });
        poc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MinorArcanaCups.this, MajorSub.class);
                myIntent.putExtra("layout", R.layout.cupspage);
                startActivity(myIntent);
            }
        });
        knoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MinorArcanaCups.this, MajorSub.class);
                myIntent.putExtra("layout", R.layout.cupsknight);
                startActivity(myIntent);
            }
        });
        qoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MinorArcanaCups.this, MajorSub.class);
                myIntent.putExtra("layout", R.layout.cupsqueen);
                startActivity(myIntent);
            }
        });
        koc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MinorArcanaCups.this, MajorSub.class);
                myIntent.putExtra("layout", R.layout.cupsking);
                startActivity(myIntent);
            }
        });
    }
}
