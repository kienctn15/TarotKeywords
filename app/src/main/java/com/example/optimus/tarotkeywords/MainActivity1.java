package com.example.optimus.tarotkeywords;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Optimus on 16/10/06.
 */
public class MainActivity1 extends AppCompatActivity {
    Button btnmajor, btnminor, btnabout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        btnmajor = (Button)findViewById(R.id.major);
        btnminor = (Button)findViewById(R.id.minor);
        btnminor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goMajor = new Intent(MainActivity1.this, TabHostActivity.class);
                startActivity(goMajor);
                //Toast.makeText(getApplicationContext(),"WHERE ARE YOU NOW?", Toast.LENGTH_LONG).show();
            }
        });
        btnmajor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goMajor = new Intent(MainActivity1.this, MajorArcana.class);
                startActivity(goMajor);
                //Toast.makeText(getApplicationContext(),"WHERE ARE YOU NOW?", Toast.LENGTH_LONG).show();
            }
        });
    }
}
