package com.example.myapplication.ui.boards;

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

        //Extract the views from this activity and display
        binding = ActivityReservationBinding.inflate(getLayoutInflater());
        View root = binding.getRoot();
        setContentView(root);
    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}