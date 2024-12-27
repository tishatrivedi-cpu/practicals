package com.example.sharedprefrences_example.activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.sharedprefrences_example.R;
import com.example.sharedprefrences_example.utils.ConstantData;

public class loginActivity extends AppCompatActivity {

    EditText et1,et2;
    Button btnlogin;
    SharedPreferences sp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        btnlogin=findViewById(R.id.btnlogin);

        btnlogin.setOnClickListener(v -> {
            sp=getSharedPreferences(ConstantData.SP_NAME,MODE_PRIVATE);
            SharedPreferences.Editor ed = sp.edit();
            ed.putBoolean(ConstantData.KEY_SP_ISLOGIN,true);
            ed.putString(ConstantData.KEY_SP_EMAIL,et1.getText().toString().trim());
            ed.commit();
            Intent intent=new Intent(this,homeActivity.class);
            startActivity(intent);
            finish();
        });
    }
}