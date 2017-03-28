package com.example.optimus.tarotkeywords;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Adapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Optimus on 20-Aug-16.
 */
public class MajorArcana extends AppCompatActivity{
    Button btnFool,btnMagi,btnHigh,btnEmprs,btnEmprr,btnHiero,btnLove,btnChar,btnStreng,btnHer,btnWheel,btnJus,btnHang,btnTemp,btnDeath,btnDevil,btnTower,btnStar,btnMoon,btnSun,btnJudge,btnWorld;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.majorarcana);
        btnFool = (Button)findViewById(R.id.theFool);
        btnMagi = (Button)findViewById(R.id.theMagi);
        btnHigh = (Button)findViewById(R.id.theHigh);
        btnEmprs = (Button)findViewById(R.id.theEmpress);
        btnEmprr = (Button)findViewById(R.id.theEmperor);
        btnHiero = (Button)findViewById(R.id.theHierophant);
        btnLove = (Button)findViewById(R.id.theLovers);
        btnChar = (Button)findViewById(R.id.theChariot);
        btnStreng = (Button)findViewById(R.id.Strength);
        btnHer = (Button)findViewById(R.id.theHermit);
        btnWheel = (Button)findViewById(R.id.theWheel);
        btnJus = (Button)findViewById(R.id.Justice);
        btnHang = (Button)findViewById(R.id.theHanged);
        btnDeath = (Button)findViewById(R.id.Death);
        btnTemp = (Button)findViewById(R.id.Temperance);
        btnDevil = (Button)findViewById(R.id.theDevil);
        btnTower = (Button)findViewById(R.id.Tower);
        btnStar = (Button)findViewById(R.id.theStar);
        btnMoon = (Button)findViewById(R.id.theMoon);
        btnSun = (Button)findViewById(R.id.theSun);
        btnJudge = (Button)findViewById(R.id.theJudgement);
        btnWorld = (Button)findViewById(R.id.theWorld);
        TextView mjdes = (TextView) findViewById(R.id.mjdes);


        mjdes.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Dialog d = new Dialog(MajorArcana.this);
                d.setContentView(R.layout.majordescription);
                d.setTitle("Mô tả chung");
                d.show();
            }
        });

        btnFool.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MajorArcana.this, MajorSub.class);
                myIntent.putExtra("layout", R.layout.thefool);
                startActivity(myIntent);
                //setContentView(R.layout.thefool);
            }
        });
        btnMagi.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MajorArcana.this, MajorSub.class);
                myIntent.putExtra("layout", R.layout.themagician);
                startActivity(myIntent);
            }
        });
        btnHigh.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MajorArcana.this, MajorSub.class);
                myIntent.putExtra("layout", R.layout.thehigh);
                startActivity(myIntent);
            }
        });
        btnEmprs.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MajorArcana.this, MajorSub.class);
                myIntent.putExtra("layout", R.layout.theemprs);
                startActivity(myIntent);
            }
        });
        btnEmprr.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MajorArcana.this, MajorSub.class);
                myIntent.putExtra("layout", R.layout.theemprr);
                startActivity(myIntent);
            }
        });
        btnHiero.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MajorArcana.this, MajorSub.class);
                myIntent.putExtra("layout", R.layout.thehie);
                startActivity(myIntent);
            }
        });
        btnLove.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MajorArcana.this, MajorSub.class);
                myIntent.putExtra("layout", R.layout.thelov);
                startActivity(myIntent);
            }
        });
        btnChar.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MajorArcana.this, MajorSub.class);
                myIntent.putExtra("layout", R.layout.thecha);
                startActivity(myIntent);
            }
        });
        btnStreng.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MajorArcana.this, MajorSub.class);
                myIntent.putExtra("layout", R.layout.thestr);
                startActivity(myIntent);
            }
        });
        btnHer.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MajorArcana.this, MajorSub.class);
                myIntent.putExtra("layout", R.layout.theher);
                startActivity(myIntent);
            }
        });
        btnWheel.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MajorArcana.this, MajorSub.class);
                myIntent.putExtra("layout", R.layout.thewhe);
                startActivity(myIntent);
            }
        });
        btnJus.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MajorArcana.this, MajorSub.class);
                myIntent.putExtra("layout", R.layout.thejus);
                startActivity(myIntent);
            }
        });
        btnHang.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MajorArcana.this, MajorSub.class);
                myIntent.putExtra("layout", R.layout.thehan);
                startActivity(myIntent);
            }
        });
        btnDeath.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MajorArcana.this, MajorSub.class);
                myIntent.putExtra("layout", R.layout.thedea);
                startActivity(myIntent);
            }
        });
        btnTemp.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MajorArcana.this, MajorSub.class);
                myIntent.putExtra("layout", R.layout.thetem);
                startActivity(myIntent);
            }
        });
        btnDevil.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MajorArcana.this, MajorSub.class);
                myIntent.putExtra("layout", R.layout.thedev);
                startActivity(myIntent);
            }
        });
        btnTower.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MajorArcana.this, MajorSub.class);
                myIntent.putExtra("layout", R.layout.thetow);
                startActivity(myIntent);
            }
        });
        btnStar.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MajorArcana.this, MajorSub.class);
                myIntent.putExtra("layout", R.layout.thesta);
                startActivity(myIntent);
            }
        });
        btnMoon.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MajorArcana.this, MajorSub.class);
                myIntent.putExtra("layout", R.layout.themoo);
                startActivity(myIntent);
            }
        });
        btnSun.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MajorArcana.this, MajorSub.class);
                myIntent.putExtra("layout", R.layout.thesun);
                startActivity(myIntent);
            }
        });
        btnJudge.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MajorArcana.this, MajorSub.class);
                myIntent.putExtra("layout", R.layout.thejud);
                startActivity(myIntent);
            }
        });
        btnWorld.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MajorArcana.this, MajorSub.class);
                myIntent.putExtra("layout", R.layout.thewor);
                startActivity(myIntent);
            }
        });
    }
}
