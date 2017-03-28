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
public class MinorArcanaSwords extends AppCompatActivity {
    TextView sdes;
    Button aoc, twoc, thoc, foc, fvoc, soc, svoc, eoc, noc, toc, poc, knoc, qoc, koc;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.swords);
        sdes = (TextView)findViewById(R.id.sdes);
        aoc = (Button)findViewById(R.id.swords1);
        twoc = (Button)findViewById(R.id.swords2);
        thoc = (Button)findViewById(R.id.swords3);
        foc = (Button)findViewById(R.id.swords4);
        fvoc = (Button)findViewById(R.id.swords5);
        soc = (Button)findViewById(R.id.swords6);
        svoc = (Button)findViewById(R.id.swords7);
        eoc = (Button)findViewById(R.id.swords8);
        noc = (Button)findViewById(R.id.swords9);
        toc = (Button)findViewById(R.id.swords10);
        poc = (Button)findViewById(R.id.pos);
        knoc = (Button)findViewById(R.id.knos);
        qoc = (Button)findViewById(R.id.qos);
        koc = (Button)findViewById(R.id.kos);
        sdes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dialog d = new Dialog(MinorArcanaSwords.this);
                d.setContentView(R.layout.minorswords);
                d.setTitle("Mô tả chung");
                d.show();
            }
        });
        aoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MinorArcanaSwords.this, MajorSub.class);
                myIntent.putExtra("layout", R.layout.swordsace);
                startActivity(myIntent);
            }
        });
        twoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MinorArcanaSwords.this, MajorSub.class);
                myIntent.putExtra("layout", R.layout.swordstwo);
                startActivity(myIntent);
            }
        });
        thoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MinorArcanaSwords.this, MajorSub.class);
                myIntent.putExtra("layout", R.layout.swordsthree);
                startActivity(myIntent);
            }
        });
        foc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MinorArcanaSwords.this, MajorSub.class);
                myIntent.putExtra("layout", R.layout.swordsfour);
                startActivity(myIntent);
            }
        });
        fvoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MinorArcanaSwords.this, MajorSub.class);
                myIntent.putExtra("layout", R.layout.swordsfive);
                startActivity(myIntent);
                //setContentView(R.layout.thefool);
            }
        });
        soc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MinorArcanaSwords.this, MajorSub.class);
                myIntent.putExtra("layout", R.layout.swordssix);
                startActivity(myIntent);
            }
        });
        svoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MinorArcanaSwords.this, MajorSub.class);
                myIntent.putExtra("layout", R.layout.swordsseven);
                startActivity(myIntent);
            }
        });
        eoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MinorArcanaSwords.this, MajorSub.class);
                myIntent.putExtra("layout", R.layout.swordseight);
                startActivity(myIntent);
            }
        });
        noc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MinorArcanaSwords.this, MajorSub.class);
                myIntent.putExtra("layout", R.layout.swordsnine);
                startActivity(myIntent);
            }
        });
        toc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MinorArcanaSwords.this, MajorSub.class);
                myIntent.putExtra("layout", R.layout.swordsten);
                startActivity(myIntent);
            }
        });
        poc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MinorArcanaSwords.this, MajorSub.class);
                myIntent.putExtra("layout", R.layout.swordspage);
                startActivity(myIntent);
            }
        });
        knoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MinorArcanaSwords.this, MajorSub.class);
                myIntent.putExtra("layout", R.layout.swordsknight);
                startActivity(myIntent);
            }
        });
        qoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MinorArcanaSwords.this, MajorSub.class);
                myIntent.putExtra("layout", R.layout.swordsqueen);
                startActivity(myIntent);
            }
        });
        koc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MinorArcanaSwords.this, MajorSub.class);
                myIntent.putExtra("layout", R.layout.swordsking);
                startActivity(myIntent);
            }
        });
    }
}
