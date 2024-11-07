package com.example.myapplication.ui.reservation;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.MainActivity;
import com.example.myapplication.R;
import com.example.myapplication.databinding.FragmentReservationBinding;
import com.example.myapplication.databinding.FragmentReservationBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class ReservationFragment extends Fragment {

    private FragmentReservationBinding binding;

    public ReservationFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentReservationBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        getFragmentManager().beginTransaction().replace(R.id.fragmentContainerView, new MyReservationFragment()).commit();

        binding.bottomnavReservation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fr = null;
                int id = item.getItemId();

                if(id == R.id.item_myR) fr = new MyReservationFragment();
                else if(id == R.id.item_addR) fr = new NewReservationFragment();
                else if(id == R.id.item_colleague) fr = new FindColleagueFragment();

                getFragmentManager().beginTransaction().replace(R.id.fragmentContainerView, fr).commit();
                return true;
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