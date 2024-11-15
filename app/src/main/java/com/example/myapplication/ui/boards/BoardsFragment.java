package com.example.myapplication.ui.boards;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.myapplication.databinding.FragmentBoardsBinding;

public class BoardsFragment extends Fragment {

    private FragmentBoardsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        //Extract the views from this fragment
        binding = FragmentBoardsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        //For prototype only: listen to the "Smart Office Project" button
        binding.button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Display the other screen, ie. MyBoardActivity
                Intent intent = new Intent(getActivity(), MyBoardActivity.class);
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