package com.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.myapplication.databinding.ActivityMainBinding;
import com.myapplication.databinding.ActivityServiceBinding;

public class ServiceActivity extends AppCompatActivity {
    private ActivityServiceBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityServiceBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btPlomero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentPlumber = new Intent(getApplicationContext(), PlomeroActivity.class);
                startActivity(intentPlumber);
            }
        });

        binding.btElectrico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentElectrico = new Intent(getApplicationContext(), ElectricoActivity.class);
                startActivity(intentElectrico);
            }
        });

        binding.btTecnico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentTecnico = new Intent(getApplicationContext(), TecnicoActivity.class);
                startActivity(intentTecnico);
            }
        });

        binding.btAlbaIl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentAlbanil = new Intent(getApplicationContext(), AlbanilActivity.class);
                startActivity(intentAlbanil);
            }
        });

        binding.btCarpintero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentcarpintero = new Intent(getApplicationContext(), CarpinteroActivity.class);
                startActivity(intentcarpintero);
            }
        });

        binding.btSoldadura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSoldadura = new Intent(getApplicationContext(), SoldadorActivity.class);
                startActivity(intentSoldadura);
            }
        });

        binding.btLimpieza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLimpieza = new Intent(getApplicationContext(), LimpiezaActivity.class);
                startActivity(intentLimpieza);
            }
        });
        binding.btPintura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentPintura = new Intent(getApplicationContext(), PinturaActivity.class);
                startActivity(intentPintura);
            }
        });
        binding.btMudanzas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentMudanza = new Intent(getApplicationContext(), MudanzaActivity.class);
                startActivity(intentMudanza);
            }
        });
    }



}