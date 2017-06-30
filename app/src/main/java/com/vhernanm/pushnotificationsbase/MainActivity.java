package com.vhernanm.pushnotificationsbase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void subscribe (View view){
        Log.d("App", "En función subscribe");
    }

    public void unsubscribe (View view){
        Log.d("App", "En función unsubscribe");
    }
}
