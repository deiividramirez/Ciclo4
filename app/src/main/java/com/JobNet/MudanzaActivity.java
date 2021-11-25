package com.JobNet;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.JobNet.databinding.ActivityMudanzaBinding;

public class MudanzaActivity extends AppCompatActivity {
    private ActivityMudanzaBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        binding = ActivityMudanzaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    }
}