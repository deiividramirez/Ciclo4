package com.JobNet;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.JobNet.databinding.ActivityPlumberBinding;

public class PlumberActivity extends AppCompatActivity {
    private ActivityPlumberBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        binding = ActivityPlumberBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    }
}