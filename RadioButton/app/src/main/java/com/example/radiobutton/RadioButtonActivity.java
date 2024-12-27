package com.example.radiobutton;

import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class RadioButtonActivity extends AppCompatActivity {

    RadioGroup radiogrp;
    String gender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_radio_button);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        radiogrp=findViewById(R.id.radiogrp);

        radiogrp.setOnCheckedChangeListener((group, checkedId) -> {
            if (radiogrp.getCheckedRadioButtonId() == R.id.rbMale){
                gender = "Male";
                Toast.makeText(this, gender+ "Selected", Toast.LENGTH_SHORT).show();
            }else {
                gender="Female";
                Toast.makeText(this, gender+ "Selected", Toast.LENGTH_SHORT).show();
            }
        });
    }
}