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

        binding = ActivityMyboardBinding.inflate(getLayoutInflater());
        View root = binding.getRoot();
        setContentView(root);

        setTitle("Smart Office Project");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainerView2, new TasksFragment()).commit();
        binding.bottomnavboard.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fr = new DeadlineFragment();
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