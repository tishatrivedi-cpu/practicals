package com.example.bottomnavigationview;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MobileActivity extends AppCompatActivity {

    Button btnsend;

    EditText etMobile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_mobile);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        btnsend=findViewById(R.id.btnsend);
        etMobile=findViewById(R.id.etMobile);

        btnsend.setOnClickListener(v -> {
            String mob=etMobile.getText().toString();
            if (TextUtils.isEmpty(mob)){
                Toast.makeText(this, "Please Enter Moblie Number", Toast.LENGTH_SHORT).show();
            }else {
                Intent intent=new Intent(MobileActivity.this,OtpActivity.class);
                intent.putExtra("mob",mob);
                startActivity(intent);
            }
        });
    }
}