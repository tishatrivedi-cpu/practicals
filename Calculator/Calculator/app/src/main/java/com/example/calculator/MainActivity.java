package com.example.calculator;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView tvans;
    Button btn1,btn2,btn3,btn4;
    EditText etno1,etno2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        tvans=findViewById(R.id.tvans);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        etno1=findViewById(R.id.etno1);
        etno2=findViewById(R.id.etno2);

        btn1.setOnClickListener(v -> {
            String no1=etno1.getText().toString();
            String no2=etno2.getText().toString();

            if(TextUtils.isEmpty(no1)){
                Toast.makeText(this, "enter no 1", Toast.LENGTH_SHORT).show();
            } else if (TextUtils.isEmpty(no2)) {
                Toast.makeText(this, "enter no2", Toast.LENGTH_SHORT).show();
            }else{
                int i=Integer.parseInt(no1);
                int j=Integer.parseInt(no2);

                int result= i + j;

                tvans.setText("the answer is :" + result);
            }
        });
        btn2.setOnClickListener(v -> {
            String no1=etno1.getText().toString();
            String no2=etno2.getText().toString();

            if(TextUtils.isEmpty(no1)){
                Toast.makeText(this, "enter no 1", Toast.LENGTH_SHORT).show();
            } else if (TextUtils.isEmpty(no2)) {
                Toast.makeText(this, "enter no2", Toast.LENGTH_SHORT).show();
            }else{
                int i=Integer.parseInt(no1);
                int j=Integer.parseInt(no2);

                int result= i - j;

                tvans.setText("the answer is :" + result);
            }
        });
        btn3.setOnClickListener(v -> {
            String no1=etno1.getText().toString();
            String no2=etno2.getText().toString();

            if(TextUtils.isEmpty(no1)){
                Toast.makeText(this, "enter no 1", Toast.LENGTH_SHORT).show();
            } else if (TextUtils.isEmpty(no2)) {
                Toast.makeText(this, "enter no2", Toast.LENGTH_SHORT).show();
            }else{
                int i=Integer.parseInt(no1);
                int j=Integer.parseInt(no2);

                int result= i * j;

                tvans.setText("the answer is :" + result);
            }
        });
        btn4.setOnClickListener(v -> {
            String no1=etno1.getText().toString();
            String no2=etno2.getText().toString();

            if(TextUtils.isEmpty(no1)){
                Toast.makeText(this, "enter no 1", Toast.LENGTH_SHORT).show();
            } else if (TextUtils.isEmpty(no2)) {
                Toast.makeText(this, "enter no2", Toast.LENGTH_SHORT).show();
            }else{
                int i=Integer.parseInt(no1);
                int j=Integer.parseInt(no2);

                int result= i / j;

                tvans.setText("the answer is :" + result);
            }
        });
    }
}