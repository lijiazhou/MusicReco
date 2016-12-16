package com.lijiazhou.musicreco.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.lijiazhou.musicreco.R;
import com.lijiazhou.musicreco.utils.file.managers.FileManagerCollection;

import java.util.Timer;
import java.util.TimerTask;

public class Loading extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);
        final Intent intent = new Intent(this, Nav.class);
        new FileManagerCollection();
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                startActivity(intent);
                finish();
            }
        }, 3600);
    }
}
