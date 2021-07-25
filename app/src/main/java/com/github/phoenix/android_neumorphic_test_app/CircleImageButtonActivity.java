package com.github.phoenix.android_neumorphic_test_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.github.phoenix.CircleButton;

public class CircleImageButtonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle_image_button);

        CircleButton circle_button = findViewById(R.id.circle_image_button);
        circle_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("1111", "onClick: i am clicked");
            }
        });
    }
}