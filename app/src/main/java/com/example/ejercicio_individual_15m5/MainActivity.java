package com.example.ejercicio_individual_15m5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.ejercicio_individual_15m5.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mbinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mbinding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mbinding.getRoot());
    }
}


