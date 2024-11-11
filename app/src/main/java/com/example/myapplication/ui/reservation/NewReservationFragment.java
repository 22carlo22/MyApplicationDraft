package com.example.myapplication.ui.reservation;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.R;
import com.example.myapplication.databinding.FragmentNewReservationBinding;
import com.example.myapplication.ui.boards.MyBoardActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

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

        binding.Building1start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Display the other screen, ie. MyBoardActivity
                Intent intent = new Intent(getActivity(), ReservationActivity.class);
                startActivity(intent);
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