package com.example.fragment;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        fragmentThree fragmentDemo = fragmentThree.newInstance("Fragment", "Android");
        ft.replace(R.id.your_placeholder, fragmentDemo);
        ft.commit();
    }
}