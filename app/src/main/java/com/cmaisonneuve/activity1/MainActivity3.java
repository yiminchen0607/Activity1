package com.cmaisonneuve.activity1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Button b1 = findViewById(R.id.button7);

    }
    public void haha(View v){
        Toast.makeText(MainActivity3.this, "acticity3", Toast.LENGTH_LONG).show();

    }
}