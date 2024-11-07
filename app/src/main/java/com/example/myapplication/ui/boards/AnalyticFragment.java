package com.example.myapplication.ui.boards;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.R;
import com.example.myapplication.databinding.FragmentAnalyticBinding;
import com.example.myapplication.databinding.FragmentBoardsBinding;
import com.example.myapplication.databinding.FragmentDeadlineBinding;
import com.example.myapplication.databinding.FragmentTasksBinding;

public class AnalyticFragment extends Fragment {

    private FragmentAnalyticBinding binding;

    public AnalyticFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentAnalyticBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}