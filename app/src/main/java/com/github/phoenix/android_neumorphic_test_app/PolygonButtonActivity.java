package com.github.phoenix.android_neumorphic_test_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.github.phoenix.PolygonButton;

public class PolygonButtonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.github.phoenix.android_neumorphic_test_app.R.layout.activity_polygon_button);

        PolygonButton polygonButton = findViewById(com.github.phoenix.android_neumorphic_test_app.R.id.polygon_button);

        findViewById(com.github.phoenix.android_neumorphic_test_app.R.id.backgroundLayout).setBackgroundColor(polygonButton.background_color);  // set layout background color from neo object.

        polygonButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("neo", "onClick: I am poly button !!");
            }
        });
    }
}