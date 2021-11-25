package com.JobNet;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.JobNet.databinding.ActivityAlbanilBinding;

public class AlbanilActivity extends AppCompatActivity {
    private ActivityAlbanilBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        binding = ActivityAlbanilBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    }
}