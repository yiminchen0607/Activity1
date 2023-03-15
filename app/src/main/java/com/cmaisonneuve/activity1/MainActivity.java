package com.cmaisonneuve.activity1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.yiqiong);
        Toast.makeText(this, "on creat", Toast.LENGTH_LONG).show();
        Log.i("FirstActivity", "Inside onCreate");

        Button b1 = findViewById(R.id.button3);
        Button b2 = findViewById(R.id.button4);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "bouton3", Toast.LENGTH_LONG).show();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "bouton4", Toast.LENGTH_LONG).show();
            }
        });
    }


}