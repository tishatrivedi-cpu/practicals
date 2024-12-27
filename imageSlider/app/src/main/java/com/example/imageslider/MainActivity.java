package com.example.imageslider;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ImageSlider image_slider;
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

        image_slider=findViewById(R.id.image_slider);

        ArrayList<SlideModel> s=new ArrayList<>();
        s.add(new SlideModel("https://wowslider.com/sliders/demo-18/data1/images/hongkong1081704.jpg","caption1", ScaleTypes.CENTER_CROP));
        s.add(new SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRDyMzx1SrWytCI_Jen5yiflDYRGfqpLwpj_w&s","caption2", ScaleTypes.CENTER_CROP));
        s.add(new SlideModel("https://soliloquywp.com/wp-content/uploads/2013/05/action-backlit-beach-1046896-1200x450_c.jpg","caption3", ScaleTypes.FIT));
        s.add(new SlideModel("https://wowslider.com/sliders/demo-18/data1/images/new_york.jpg","caption4", ScaleTypes.FIT));

        image_slider.setImageList(s);
    }
}