package com.cmaisonneuve.activity1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button b1 = findViewById(R.id.button5);
        Button b2 = findViewById(R.id.button6);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button5:
                Toast.makeText(MainActivity2.this, "haha", Toast.LENGTH_LONG).show();
                break;
            case R.id.button6:
                Toast.makeText(MainActivity2.this, "xixi", Toast.LENGTH_LONG).show();
                break;
        }

    }
}