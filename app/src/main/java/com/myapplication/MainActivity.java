package com.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.myapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.btnServices.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentServices = new Intent(getApplicationContext(), ServiceActivity.class);
                startActivity(intentServices);
            }
        });

        binding.btnFormulario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intentPersonForm = new Intent(getApplicationContext(), PersonFormActivity.class);
               startActivity(intentPersonForm);
            }
        });

        String name = getIntent().getStringExtra("user");

        Toast.makeText(this, "Bienvenido " + name, Toast.LENGTH_SHORT).show();
    }



}