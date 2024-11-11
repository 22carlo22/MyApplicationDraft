package com.example.myapplication.ui.reservation;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.myapplication.R;
import com.example.myapplication.databinding.FragmentNewReservationBinding;
import com.example.myapplication.ui.boards.MyBoardActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class NewReservationFragment extends Fragment {

    private FragmentNewReservationBinding binding;

    public NewReservationFragment() {
        // Required empty public constructor
    }

    View view;
    Button newReservation;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstancedState){
        //return inflater.inflate(R.layout.fragment_new_reservation,parent,false);
        view = inflater.inflate(R.layout.fragment_new_reservation,parent,false);
        newReservation = (Button) view.findViewById(R.id.testbutton);

        newReservation.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(getActivity(),"New Reservation", Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstancedState){

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}