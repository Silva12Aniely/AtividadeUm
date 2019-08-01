package com.example.atividadeum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Droid_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.droid_layout);
    }

    public void abrirJanela(View view) {
        Intent intent = new Intent(getApplicationContext(), DroidTwo.class);
        startActivity(intent);
    }
}
