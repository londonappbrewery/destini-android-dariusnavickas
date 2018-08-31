package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:

    private TextView storyTextView;
    private Button answerTopButton;
    private Button answerBottomButton;
    private int mStoryIndex =1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:

        storyTextView = findViewById(R.id.storyTextView);
        answerTopButton = findViewById(R.id.buttonTop);
        answerBottomButton = findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

        answerTopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if ((mStoryIndex == 1) || (mStoryIndex == 2)) {
                    storyTextView.setText(R.string.T3_Story);
                    answerTopButton.setText(R.string.T3_Ans1);
                    answerBottomButton.setText(R.string.T3_Ans2);
                    mStoryIndex = 3;
                } else {
                    storyTextView.setText(R.string.T6_End);
                    answerTopButton.setVisibility(View.GONE);
                    answerBottomButton.setVisibility(View.GONE);
                }

            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

        answerBottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mStoryIndex == 1) {
                    storyTextView.setText(R.string.T2_Story);
                    answerTopButton.setText(R.string.T2_Ans1);
                    answerBottomButton.setText(R.string.T2_Ans2);
                    mStoryIndex = 2;
                } else if (mStoryIndex == 2){
                    storyTextView.setText(R.string.T4_End);
                    answerTopButton.setVisibility(View.GONE);
                    answerBottomButton.setVisibility(View.GONE);
                } else {
                    storyTextView.setText(R.string.T5_End);
                    answerTopButton.setVisibility(View.GONE);
                    answerBottomButton.setVisibility(View.GONE);
                }

            }
        });

    }
}
