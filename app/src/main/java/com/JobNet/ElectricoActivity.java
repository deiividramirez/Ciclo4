package com.JobNet;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.JobNet.databinding.ActivityElectricoBinding;

public class ElectricoActivity extends AppCompatActivity {
    private ActivityElectricoBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        binding = ActivityElectricoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    }
}