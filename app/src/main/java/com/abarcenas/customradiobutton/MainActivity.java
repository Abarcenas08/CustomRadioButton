package com.abarcenas.customradiobutton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatRadioButton;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
  AppCompatRadioButton rbLeft, rbRight, rbCenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rbLeft = findViewById(R.id.rbLeft);
        rbRight = findViewById(R.id.rbRight);
        rbCenter = findViewById(R.id.rbCenter);
    }

    public void onRadioButtonClicked(View view){
        boolean isSelected = ((AppCompatRadioButton)view).isChecked();
        switch (view.getId()){
            case R.id.rbLeft:
                if (isSelected){
                    rbLeft.setTextColor(Color.WHITE);
                    rbRight.setTextColor(Color.RED);
                    rbCenter.setTextColor(Color.RED);
                }
                break;;
            case R.id.rbCenter;
                if (isSelected){
                    rbRight.setTextColor(Color.WHITE);
                    rbLeft.setTextColor(Color.RED);
                    rbCenter.setTextColor(Color.WHITE);
                }
                break;;
                case R.id.rbRight;
                    if (isSelected){
                        rbRight.setTextColor(Color.WHITE);
                        rbLeft.setTextColor(Color.RED);
                        rbCenter.setTextColor(Color.RED);
                    }
                break;;
        }

    }
}