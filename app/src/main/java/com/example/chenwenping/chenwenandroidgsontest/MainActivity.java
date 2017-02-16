package com.example.chenwenping.chenwenandroidgsontest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.chenwenping.chenwenandroidgsontest.utils.DataUtils;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            String jsonString = DataUtils.readRawFile(R.raw.jsontest);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
