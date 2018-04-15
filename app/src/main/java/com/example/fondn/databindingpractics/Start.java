package com.example.fondn.databindingpractics;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Start extends AppCompatActivity {
    TextView one,two,three;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);


        one = (TextView) findViewById(R.id.textViewIDOne);
        two = (TextView) findViewById(R.id.textViewIDTwo);
        three = (TextView) findViewById(R.id.textViewIDThree);

        one.setText("sagor");
        two.setText("khan");
        three.setText("Sabuj");
    }
}
