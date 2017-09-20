package com.example.mac.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Alternativa_1_1_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alternativa_1_1_1);
    }

    public void alternativa2(View view) {

        Toast.makeText(this, "Este es el final del cuento, por favor", Toast.LENGTH_SHORT).show();

    }
}
