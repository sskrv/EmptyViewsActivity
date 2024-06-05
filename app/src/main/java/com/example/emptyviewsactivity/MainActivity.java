package com.example.emptyviewsactivity;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "new activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: started");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: started");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: started");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: started");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: started");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: started");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart: started");
    }
}