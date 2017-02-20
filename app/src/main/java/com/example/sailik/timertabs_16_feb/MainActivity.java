package com.example.sailik.timertabs_16_feb;

import android.app.TabActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;


public class MainActivity extends TabActivity {

    TabHost TabHostWindow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TabHostWindow = (TabHost) findViewById(android.R.id.tabhost);

        //Creating tab menu.
        TabHost.TabSpec TabMenu1 = TabHostWindow.newTabSpec("First tab");
        TabHost.TabSpec TabMenu2 = TabHostWindow.newTabSpec("Second Tab");


        //Setting up tab 1 name.
        TabMenu1.setIndicator("Tab1");
        //Set tab 1 activity to tab 1 menu.
        TabMenu1.setContent(new Intent(this, TabActivity1.class));


        TabMenu2.setIndicator("Tab2");

        TabMenu2.setContent(new Intent(this, TabActivity2.class));



        //Adding tab1, tab2 to tabhost view.

        TabHostWindow.addTab(TabMenu1);
        TabHostWindow.addTab(TabMenu2);


    }
}
