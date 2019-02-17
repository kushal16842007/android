package com.example.kushal.demopassmodelthroughintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ShowActivity extends AppCompatActivity {
    TextView txtViewName;
    TextView txtViewAge;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        txtViewName = findViewById(R.id.txtViewName);
        txtViewAge = findViewById(R.id.txtViewAge);
        Intent intent = getIntent();

        Bundle bundle = intent.getExtras();
        Model model = (Model) bundle.getSerializable("KEY");


       // Model model = (Model) intent.getSerializableExtra("Model");


        String name = model.getName();
        String age = model.getAge();
        txtViewName.setText(name);
        txtViewAge.setText(age);
    }
}
