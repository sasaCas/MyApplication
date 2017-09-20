package com.example.mac.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void alternativa1(View view) {

        Intent intent = new Intent(this, Alternativa_1_1.class);
        startActivity(intent);

    }

    public void alternativa2(View view) {

        Intent intent = new Intent(this, Alternativa_1_2.class);
        startActivity(intent);

    }
}
