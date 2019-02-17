package com.example.kushal.demopassmodelthroughintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText editTextName;
    EditText editTextAge;
    Button btn;
    Model model;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        btn.setOnClickListener(this);
    }

    private void init()
    {
        editTextName = findViewById(R.id.edtTextName);
        editTextAge = findViewById(R.id.edtTextAge);
        btn = findViewById(R.id.btn);
    }

    @Override
    public void onClick(View v) {
        if(v == btn)
        {
            set();
            Bundle bundle = new Bundle();
            bundle.putSerializable("KEY", model);
            Intent intent = new Intent(this,ShowActivity.class);
            intent.putExtras(bundle);


           /* Intent intent = new Intent(this,ShowActivity.class);
            intent.putExtra("Model", (Serializable) model);*/


            startActivity(intent);
        }
    }
    private void set()
    {   model = new Model();
        String name =String.valueOf(editTextName.getText());
        String age = String.valueOf(editTextAge.getText());
        model.setName(name);
        model.setAge(age);
    }
}
