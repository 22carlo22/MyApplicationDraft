package com.example.myapplication.ui.reservation;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.databinding.FragmentNewReservationBinding;

public class NewReservationFragment extends Fragment {

    private FragmentNewReservationBinding binding;

    public NewReservationFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //Extract the views from this fragment and display it
        binding = FragmentNewReservationBinding.inflate(inflater, container, false);
        View root = binding.getRoot();








        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}