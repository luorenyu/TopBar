package com.timen4.ronnny.topbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.timen4.ronnny.topbar.widget.TopBar;

public class MainActivity extends AppCompatActivity {

    private TopBar mtopBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mtopBar = (TopBar) findViewById(R.id.topBar);
        mtopBar.setButtonVisable(TopBar.RIGHT_BUTTUN,true);
        mtopBar.setButtonVisable(TopBar.LEFT_BUTTUN,true);
    }
}
