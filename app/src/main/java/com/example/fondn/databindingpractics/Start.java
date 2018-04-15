package com.example.fondn.databindingpractics;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.fondn.databindingpractics.databinding.ActivityStartBinding;

public class Start extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityStartBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_start);
        binding.textviewone.setText("Sagor");
        binding.textViewIDTwo.setText("khan");
        binding.textViewIDThreeFour.setText("Sabuj");



    }
}
