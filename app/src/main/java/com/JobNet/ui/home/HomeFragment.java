package com.JobNet.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.JobNet.AlbanilActivity;
import com.JobNet.ElectricoActivity;
import com.JobNet.PinturaActivity;
import com.JobNet.PlumberActivity;
import com.JobNet.TecnicoActivity;
import com.JobNet.SoldaduraActivity;
import com.JobNet.databinding.FragmentHomeBinding;
import com.JobNet.CarpenterActivity;
import com.JobNet.LimpiezaActivity;
import com.JobNet.MudanzaActivity;


public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.btPlomero;
        initListeners();
        return root;
    }
    public void initListeners(){

        binding.btPlomero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentPlumber = new Intent(getContext(), PlumberActivity.class);
                startActivity(intentPlumber);
            }
        });

        binding.btElectrico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentElectrico = new Intent(getContext(), ElectricoActivity.class);
                startActivity(intentElectrico);
            }
        });

        binding.btTecnico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentTecnico = new Intent(getContext(), TecnicoActivity.class);
                startActivity(intentTecnico);
            }
        });

        binding.btAlbaIl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentAlbanil = new Intent(getContext(), AlbanilActivity.class);
                startActivity(intentAlbanil);
            }
        });

        binding.btCarpintero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentCarpenter = new Intent(getContext(), CarpenterActivity.class);
                startActivity(intentCarpenter);
            }
        });

        binding.btSoldadura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSoldadura = new Intent(getContext(), SoldaduraActivity.class);
                startActivity(intentSoldadura);
            }
        });

        binding.btLimpieza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLimpieza = new Intent(getContext(), LimpiezaActivity.class);
                startActivity(intentLimpieza);
            }
        });

        binding.btPintura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentPintura = new Intent(getContext(), PinturaActivity.class);
                startActivity(intentPintura);
            }
        });

        binding.btMudanzas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentMudanza = new Intent(getContext(), MudanzaActivity.class);
                startActivity(intentMudanza);
            }
        });
    }

}
