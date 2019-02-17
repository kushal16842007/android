package com.example.kushal.demobottomsheet;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    BottomSheetBehavior behavior;
    CoordinatorLayout coordinatorLayout;
    Button btn;
    TextView txtViewCamera;
    TextView txtViewGallery;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btnBottomSheet);
        txtViewCamera = findViewById(R.id.txtViewCamera);
        txtViewGallery = findViewById(R.id.txtViewGallery);

        coordinatorLayout = (CoordinatorLayout) findViewById(R.id.coordinatorLayout);
        View bottomSheet = findViewById(R.id.bottom_Sheet);
        behavior = BottomSheetBehavior.from(bottomSheet);
        behavior.setBottomSheetCallback(new BottomSheetBehavior.BottomSheetCallback() {
            @Override
            public void onStateChanged(@NonNull View bottomSheet, int newState) {
                Log.d("OnstateCganged----->","click");
            }

            @Override
            public void onSlide(@NonNull View bottomSheet, float slideOffset) {
                Log.d("Onslide----->","click");
            }
        });




        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                behavior.setState(BottomSheetBehavior.STATE_EXPANDED);
                Log.d("button----->","click");
            }
        });


        txtViewCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("camera---->","click");
                behavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
            }
        });

        txtViewGallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("gallry----->","click");
                behavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
            }
        });
    }
}
