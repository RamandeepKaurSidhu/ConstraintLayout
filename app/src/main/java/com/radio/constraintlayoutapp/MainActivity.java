package com.radio.constraintlayoutapp;

import android.support.constraint.ConstraintLayout;
import android.support.constraint.ConstraintSet;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout relativeLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        relativeLayout = (RelativeLayout)findViewById(R.id.relativeTest);
        View view = getLayoutInflater().inflate(R.layout.game_frame_text_text_constraint,null,true);
        /*ConstraintLayout layout = (ConstraintLayout)view.findViewById(R.id.constraintSetLay);
        ConstraintLayout.LayoutParams params = new ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.CHAIN_PACKED, ConstraintLayout.LayoutParams.MATCH_PARENT);
        layout.setLayoutParams(params);*/
        relativeLayout.addView(view);
    }
}
