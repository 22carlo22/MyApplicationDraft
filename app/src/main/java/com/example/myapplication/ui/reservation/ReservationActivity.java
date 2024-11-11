package com.example.myapplication.ui.reservation;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.myapplication.R;
import com.example.myapplication.databinding.ActivityReservationBinding;

public class ReservationActivity extends AppCompatActivity {

    private ActivityReservationBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservation);
        //Extract the views from this activity and display

        Fragment firstFragment = new MyReservationFragment();
        Fragment secondFragment = new NewReservationFragment();
        Fragment thirdFragment = new FindColleagueFragment();




    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}