package com.JobNet;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.JobNet.databinding.ActivityTecnicoBinding;

public class TecnicoActivity extends AppCompatActivity {
    private ActivityTecnicoBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        binding = ActivityTecnicoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    }
}