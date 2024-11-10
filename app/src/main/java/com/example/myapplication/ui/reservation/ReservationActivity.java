package com.example.myapplication.ui.reservation;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.myapplication.R;
import com.example.myapplication.databinding.ActivityMyboardBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class ReservationActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Extract the views from this activity and display


    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}