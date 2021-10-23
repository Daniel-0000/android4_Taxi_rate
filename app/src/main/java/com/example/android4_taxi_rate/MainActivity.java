package com.example.android4_taxi_rate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculate(View view){
        EditText distance = findViewById(R.id.distance);
        TextView T3 = (TextView)findViewById(R.id.textView3);
        double Distance = Double.parseDouble(distance.getText().toString());
        Distance = 75 + ((Math.floor(Distance / 250)) * 5);
        T3.setText(""+Distance);
    }

}