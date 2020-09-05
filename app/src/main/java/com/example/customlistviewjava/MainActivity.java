package com.example.customlistviewjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    // Array of TextViews
    String OurApps[] = {
            "Master Android App",
            "Master Android App Pro",
            "Master Flutter App",
            "Subcribe to our channel",
            "Rate our app 5 stars"
    };

    // Array of Images
    int Images[] = {
            R.drawable.facebook,
            R.drawable.googleplus,
            R.drawable.instagram,
            R.drawable.youtube,
            R.drawable.facebook
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView customList = findViewById(R.id.customListy);

        // Create instance of the CustomAdapter
        CustomAdapter customAdapter =
                new CustomAdapter(
                        this,
                        OurApps,
                        Images);

        customList.setAdapter(customAdapter);
    }
}
