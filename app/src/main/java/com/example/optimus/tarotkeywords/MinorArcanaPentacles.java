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
public class MinorArcanaPentacles extends AppCompatActivity {

    Button aoc, twoc, thoc, foc, fvoc, soc, svoc, eoc, noc, toc, poc, knoc, qoc, koc;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pentacles);
        TextView pdes = (TextView)findViewById(R.id.pdes);
        aoc = (Button)findViewById(R.id.pen1);
        twoc = (Button)findViewById(R.id.pen2);
        thoc = (Button)findViewById(R.id.pen3);
        foc = (Button)findViewById(R.id.pen4);
        fvoc = (Button)findViewById(R.id.pen5);
        soc = (Button)findViewById(R.id.pen6);
        svoc = (Button)findViewById(R.id.pen7);
        eoc = (Button)findViewById(R.id.pen8);
        noc = (Button)findViewById(R.id.pen9);
        toc = (Button)findViewById(R.id.pen10);
        poc = (Button)findViewById(R.id.pop);
        knoc = (Button)findViewById(R.id.knop);
        qoc = (Button)findViewById(R.id.qop);
        koc = (Button)findViewById(R.id.kop);
        pdes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dialog d = new Dialog(MinorArcanaPentacles.this);
                d.setContentView(R.layout.minorpentacles);
                d.setTitle("Mô tả chung");
                d.show();
            }
        });
        aoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MinorArcanaPentacles.this, MajorSub.class);
                myIntent.putExtra("layout", R.layout.penace);
                startActivity(myIntent);
            }
        });
        twoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MinorArcanaPentacles.this, MajorSub.class);
                myIntent.putExtra("layout", R.layout.pentwo);
                startActivity(myIntent);
            }
        });
        thoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MinorArcanaPentacles.this, MajorSub.class);
                myIntent.putExtra("layout", R.layout.penthree);
                startActivity(myIntent);
            }
        });
        foc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MinorArcanaPentacles.this, MajorSub.class);
                myIntent.putExtra("layout", R.layout.penfour);
                startActivity(myIntent);
            }
        });
        fvoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MinorArcanaPentacles.this, MajorSub.class);
                myIntent.putExtra("layout", R.layout.penfive);
                startActivity(myIntent);
                //setContentView(R.layout.thefool);
            }
        });
        soc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MinorArcanaPentacles.this, MajorSub.class);
                myIntent.putExtra("layout", R.layout.pensix);
                startActivity(myIntent);
            }
        });
        svoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MinorArcanaPentacles.this, MajorSub.class);
                myIntent.putExtra("layout", R.layout.penseven);
                startActivity(myIntent);
            }
        });
        eoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MinorArcanaPentacles.this, MajorSub.class);
                myIntent.putExtra("layout", R.layout.peneight);
                startActivity(myIntent);
            }
        });
        noc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MinorArcanaPentacles.this, MajorSub.class);
                myIntent.putExtra("layout", R.layout.pennine);
                startActivity(myIntent);
            }
        });
        toc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MinorArcanaPentacles.this, MajorSub.class);
                myIntent.putExtra("layout", R.layout.penten);
                startActivity(myIntent);
            }
        });
        poc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MinorArcanaPentacles.this, MajorSub.class);
                myIntent.putExtra("layout", R.layout.penpage);
                startActivity(myIntent);
            }
        });
        knoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MinorArcanaPentacles.this, MajorSub.class);
                myIntent.putExtra("layout", R.layout.penknight);
                startActivity(myIntent);
            }
        });
        qoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MinorArcanaPentacles.this, MajorSub.class);
                myIntent.putExtra("layout", R.layout.penqueen);
                startActivity(myIntent);
            }
        });
        koc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MinorArcanaPentacles.this, MajorSub.class);
                myIntent.putExtra("layout", R.layout.penking);
                startActivity(myIntent);
            }
        });
    }
}
