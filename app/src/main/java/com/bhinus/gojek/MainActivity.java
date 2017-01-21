package com.bhinus.gojek;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goRide(View v){
        Intent i = new Intent(MainActivity.this, GoRideActivity.class);
        startActivity(i);
    }

    public void goSend(View v){
        Toast.makeText(this, "Ini adalah Go Send" +
                "", Toast.LENGTH_SHORT).show();
    }

    public void goFood(View v){
        Toast.makeText(this, "Ini adalah Go Food" +
                "", Toast.LENGTH_SHORT).show();
    }

    public void goMart(View v){
        Toast.makeText(this, "Ini adalah Go Mart" +
                "", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
