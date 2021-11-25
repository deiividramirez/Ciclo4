package com.JobNet;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.JobNet.databinding.ActivitySoldaduraBinding;

public class SoldaduraActivity extends AppCompatActivity {
    private ActivitySoldaduraBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        binding = ActivitySoldaduraBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    }
}