package com.example.atividadeum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DroidTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.droid_two_layout);
    }

    public void abrirJanela(View view) {
        Intent intent = new Intent(getApplicationContext(), Droid_Activity.class);
        startActivity(intent);
    }
}
