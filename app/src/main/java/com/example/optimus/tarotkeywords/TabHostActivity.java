package com.example.optimus.tarotkeywords;

import android.app.TabActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

/**
 * Created by Optimus on 16/10/06.
 */
public class TabHostActivity extends TabActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tablayout);

        //TabHost tabHost = getTabHost();
        TabHost tabHost = (TabHost) findViewById(android.R.id.tabhost);

        TabSpec wands = tabHost.newTabSpec("Suit of Wands");
        wands.setIndicator("Wands");
        Intent wandsintent = new Intent(TabHostActivity.this, MinorArcanaWands.class);
        wands.setContent(wandsintent);

        TabSpec cups = tabHost.newTabSpec("Suit of Cups");
        // setting Title and Icon for the Tab
        cups.setIndicator("Cups");
        Intent cupsintent = new Intent(TabHostActivity.this, MinorArcanaCups.class);
        cups.setContent(cupsintent);

        // Tab for Videos
        TabSpec swords = tabHost.newTabSpec("Suit of Swords");
        swords.setIndicator("Swords");
        Intent swordsintent = new Intent(TabHostActivity.this, MinorArcanaSwords.class);
        swords.setContent(swordsintent);

        // Adding all TabSpec to TabHost

        TabSpec pentacles = tabHost.newTabSpec("Suit of Pentacles");
        pentacles.setIndicator("Pentacles");
        Intent pentaclesintent = new Intent(TabHostActivity.this, MinorArcanaPentacles.class);
        pentacles.setContent(pentaclesintent);



        tabHost.addTab(wands); // Adding photos tab
        tabHost.addTab(cups); // Adding songs tab
        tabHost.addTab(swords); // Adding videos tab
        tabHost.addTab(pentacles); // Adding videos tab
        tabHost.setup();
    }
}
