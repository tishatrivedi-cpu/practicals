package com.example.alertdialog;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button btndialog;

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

        btndialog=findViewById(R.id.btndialog);

        btndialog.setOnClickListener(v -> {
            AlertDialog.Builder builder=new AlertDialog.Builder(this);
            builder.setTitle("EXIT")
                    .setMessage("Are u Sure??")
                    .setPositiveButton("YES",(dialog, which) -> {
                        Toast.makeText(this, "YES BUTTON CLICKED", Toast.LENGTH_SHORT).show();
                    })
                    .setNegativeButton("NO",(dialog, which) -> {
                        Toast.makeText(this, "NO BUTTON CLICKED", Toast.LENGTH_SHORT).show();
                    })
                    .show();
        });
    }
}