package com.example.midterm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button leftButton, rightButton;
    private TextView text;
    private int random;
    public int clicks = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.textView);
        leftButton = findViewById(R.id.leftButton);
        rightButton = findViewById(R.id.rightButton);
        random = (int) (2 * (Math.random()));

        leftButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (random == 0) {
                    leftButton.setVisibility(v.VISIBLE);
                    rightButton.setVisibility(v.INVISIBLE);
                } else if(random == 1) {
                    leftButton.setVisibility(v.INVISIBLE);
                    rightButton.setVisibility(v.VISIBLE);

                }
                text.setText("Number of clicks: " + clicks);
                clicks++;
            }

        });
        rightButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (random == 0) {
                    leftButton.setVisibility(v.INVISIBLE);
                    rightButton.setVisibility(v.VISIBLE);
                } else if(random == 1){
                    leftButton.setVisibility(v.VISIBLE);
                    rightButton.setVisibility(v.INVISIBLE);
                }
                text.setText("Number of clicks: " + clicks);
                clicks++;
            }

        });
    }

    @Override
    public void onClick(View v) {
    }


}
