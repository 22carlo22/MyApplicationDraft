package com.example.myapplication.ui.reservation;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

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

        return root;
    }



    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}