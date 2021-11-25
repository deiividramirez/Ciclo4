package com.JobNet;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.JobNet.databinding.ActivityCarpenterBinding;

public class CarpenterActivity extends AppCompatActivity {
    private ActivityCarpenterBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        binding = ActivityCarpenterBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    }
}