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
public class MinorArcanaWands extends AppCompatActivity { Button btnFinish;
    Button aoc, twoc, thoc, foc, fvoc, soc, svoc, eoc, noc, toc, poc, knoc, qoc, koc;
    TextView  wdes;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wands);
        wdes = (TextView)findViewById(R.id.wdes);
        aoc = (Button)findViewById(R.id.wand1);
        twoc = (Button)findViewById(R.id.wand2);
        thoc = (Button)findViewById(R.id.wand3);
        foc = (Button)findViewById(R.id.wand4);
        fvoc = (Button)findViewById(R.id.wand5);
        soc = (Button)findViewById(R.id.wand6);
        svoc = (Button)findViewById(R.id.wand7);
        eoc = (Button)findViewById(R.id.wand8);
        noc = (Button)findViewById(R.id.wand9);
        toc = (Button)findViewById(R.id.wand10);
        poc = (Button)findViewById(R.id.pow);
        knoc = (Button)findViewById(R.id.know);
        qoc = (Button)findViewById(R.id.qow);
        koc = (Button)findViewById(R.id.kow);

        wdes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dialog d = new Dialog(MinorArcanaWands.this);
                d.setContentView(R.layout.minorwands);
                d.setTitle("Mô tả chung");
                d.show();
            }
        });
        aoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MinorArcanaWands.this, MajorSub.class);
                myIntent.putExtra("layout", R.layout.w1);
                startActivity(myIntent);
            }
        });
        twoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MinorArcanaWands.this, MajorSub.class);
                myIntent.putExtra("layout", R.layout.w2);
                startActivity(myIntent);
            }
        });
        thoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MinorArcanaWands.this, MajorSub.class);
                myIntent.putExtra("layout", R.layout.w3);
                startActivity(myIntent);
            }
        });
        foc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MinorArcanaWands.this, MajorSub.class);
                myIntent.putExtra("layout", R.layout.w4);
                startActivity(myIntent);
            }
        });
        fvoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MinorArcanaWands.this, MajorSub.class);
                myIntent.putExtra("layout", R.layout.w5);
                startActivity(myIntent);
                //setContentView(R.layout.thefool);
            }
        });
        soc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MinorArcanaWands.this, MajorSub.class);
                myIntent.putExtra("layout", R.layout.w6);
                startActivity(myIntent);
            }
        });
        svoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MinorArcanaWands.this, MajorSub.class);
                myIntent.putExtra("layout", R.layout.w7);
                startActivity(myIntent);
            }
        });
        eoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MinorArcanaWands.this, MajorSub.class);
                myIntent.putExtra("layout", R.layout.w8);
                startActivity(myIntent);
            }
        });
        noc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MinorArcanaWands.this, MajorSub.class);
                myIntent.putExtra("layout", R.layout.w9);
                startActivity(myIntent);
            }
        });
        toc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MinorArcanaWands.this, MajorSub.class);
                myIntent.putExtra("layout", R.layout.w10);
                startActivity(myIntent);
            }
        });
        poc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MinorArcanaWands.this, MajorSub.class);
                myIntent.putExtra("layout", R.layout.wp);
                startActivity(myIntent);
            }
        });
        knoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MinorArcanaWands.this, MajorSub.class);
                myIntent.putExtra("layout", R.layout.wkn);
                startActivity(myIntent);
            }
        });
        qoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MinorArcanaWands.this, MajorSub.class);
                myIntent.putExtra("layout", R.layout.wq);
                startActivity(myIntent);
            }
        });
        koc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MinorArcanaWands.this, MajorSub.class);
                myIntent.putExtra("layout", R.layout.wk);
                startActivity(myIntent);
            }
        });
    }
}
