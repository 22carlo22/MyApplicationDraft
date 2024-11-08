package com.example.myapplication.ui.boards;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.myapplication.R;
import com.example.myapplication.databinding.ActivityMyboardBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MyBoardActivity extends AppCompatActivity {

    private ActivityMyboardBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Extract the views from this activity and display
        binding = ActivityMyboardBinding.inflate(getLayoutInflater());
        View root = binding.getRoot();
        setContentView(root);

        //Diplay the title of the chosen board
        setTitle("Smart Office Project");
        //Enable the back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //Set the "lists" fragment as default, and display it
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainerView2, new TasksFragment()).commit();

        //Listen to the inputs of the bottom navigation
        binding.bottomnavboard.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fr = null;

                //Choose the fragment based on the user input
                int id = item.getItemId();
                if(id == R.id.item_tasks) fr = new TasksFragment();
                else if(id == R.id.item_deadline) fr = new DeadlineFragment();
                else if(id == R.id.item_analytic) fr = new AnalyticFragment();
                else if(id == R.id.item_menu) fr = new MenuBoardFragment();

                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainerView2, fr).commit();
                return true;
            }
        });


    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}