package com.example.bottomnavigationview;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.firebase.auth.FirebaseAuth;

public class OtpActivity extends AppCompatActivity {

    private FirebaseAuth mAuth;
    String verificationId;
    String code;


    EditText etotp1,etotp2,etotp3,etotp4,etotp5,etotp6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_otp);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ui_ids();
        etSwicher();
        String mob=getIntent().getStringExtra("mob");




    }
    public void ui_ids(){
        etotp1=findViewById(R.id.etotp1);
        etotp2=findViewById(R.id.etotp2);
        etotp3=findViewById(R.id.etotp3);
        etotp4=findViewById(R.id.etotp4);
        etotp5=findViewById(R.id.etotp5);
        etotp6=findViewById(R.id.etotp6);
    }
    public void etSwicher(){
        etotp1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                if (s != null){
                    if (s.length()==1);
                    etotp2.requestFocus();
                }
            }
        });
        etotp2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                if (s != null){
                    if (s.length()==1);
                    etotp3.requestFocus();
                }
            }
        });
        etotp3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                if (s != null){
                    if (s.length()==1);
                    etotp4.requestFocus();
                }
            }
        });
        etotp4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                if (s != null){
                    if (s.length()==1);
                    etotp5.requestFocus();
                }
            }
        });
        etotp5.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                if (s != null){
                    if (s.length()==1);
                    etotp6.requestFocus();
                }
            }
        });
    }
}