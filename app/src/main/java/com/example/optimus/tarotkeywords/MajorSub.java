package com.example.optimus.tarotkeywords;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Optimus on 23-Aug-16.
 */
public class MajorSub extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle major = getIntent().getExtras();
        if(major!= null && major.containsKey("layout"))
            setContentView(major.getInt("layout"));
        else
            setContentView(R.layout.majorarcana);
    }
}
