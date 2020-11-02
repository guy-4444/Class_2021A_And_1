package com.classy.class_2021a_and_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity_Score extends AppCompatActivity {

    public static final String EXTRA_KEY_SCORE = "EXTRA_KEY_SCORE";

    /*
    1. create view - TextView
    2. connect view to second activity
    3. pass data
    4. read data
    5. Display data.
     */



    private TextView score_LBL_score;
    private Button score_BTN_close;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        score_LBL_score = findViewById(R.id.score_LBL_score);
        score_BTN_close = findViewById(R.id.score_BTN_close);


        score_BTN_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                closeActivity();
            }
        });



        int scoreFromPreviousActivity = getIntent().getIntExtra(EXTRA_KEY_SCORE, -1);

        score_LBL_score.setText("" + scoreFromPreviousActivity);

    }

    private void closeActivity() {
        finish();
    }
}