package com.example.image;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView ivPicture = (ImageView) findViewById(R.id.ivPicture);
        ivPicture.setImageResource(R.drawable.paris);

    }
}