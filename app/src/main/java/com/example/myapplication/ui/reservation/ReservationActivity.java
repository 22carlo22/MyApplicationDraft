package com.example.myapplication.ui.reservation;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;
import com.example.myapplication.databinding.ActivityReservationBinding;

public class ReservationActivity extends AppCompatActivity {

    private ActivityReservationBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_new_reservation);
        //Extract the views from this activity and display



    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}