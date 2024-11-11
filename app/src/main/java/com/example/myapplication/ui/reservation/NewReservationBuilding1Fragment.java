package com.example.myapplication.ui.reservation;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.R;
import com.example.myapplication.databinding.FragmentNewReservationBuilding1Binding;

public class NewReservationBuilding1Fragment extends Fragment {

    private FragmentNewReservationBuilding1Binding binding;

    public NewReservationBuilding1Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //Extract the views from this fragment and display it
        binding = FragmentNewReservationBuilding1Binding.inflate(inflater, container, false);
        View root = binding.getRoot();

        binding.Building1Floor7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Display the other fragment or activity
                getFragmentManager().beginTransaction().replace(R.id.fragmentContainerView, new NewReservationBuilding1Floor7Fragment()).commit();

            }
        });

        return root;
    }



    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}