package com.JobNet;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.JobNet.databinding.ActivityPinturaBinding;

public class PinturaActivity extends AppCompatActivity {
    private ActivityPinturaBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        binding = ActivityPinturaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    }
}