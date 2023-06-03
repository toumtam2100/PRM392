package com.example.image;

import android.content.Context;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;
public class MainActivity1 extends AppCompatActivity {
    private Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ImageView ivPicture = (ImageView)
                findViewById(R.id.ivPicture2);
        String url =
                "https://www.planetware.com/wpimages/2020/02/france-in-picturesbeautiful-places-to-photograph-eiffel-tower.jpg";
        if (url == null || url.equals("")) {
            Toast.makeText(MainActivity1.this, "Error", Toast.LENGTH_LONG).show();
        }
        else {
            Picasso.with(MainActivity1.this).load(url).into(ivPicture);
        }
    }
}