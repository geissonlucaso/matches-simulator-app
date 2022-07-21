package com.geissonlucaso.simulator.ui;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.geissonlucaso.simulator.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setupMatchList();
        setupMatchesRefresh();
        setupFloatingActionButton();
    }

    private void setupMatchList() {
        // TODO List all matches.
    }

    private void setupMatchesRefresh() {
        // TODO Update the matches in swipe refresh.
    }

    private void setupFloatingActionButton() {
        // TODO Event click of simulation of a match.
    }
}
