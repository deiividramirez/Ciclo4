package com.JobNet;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.JobNet.databinding.ActivityLimpiezaBinding;

public class LimpiezaActivity extends AppCompatActivity {
    private ActivityLimpiezaBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        binding = ActivityLimpiezaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    }
}