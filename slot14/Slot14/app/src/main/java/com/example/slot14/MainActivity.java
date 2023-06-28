package com.example.slot14;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
public class MainActivity extends AppCompatActivity implements
        View.OnClickListener {
    Button buttonStart, buttonStop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonStart = findViewById(R.id.buttonStart);
        buttonStop = findViewById(R.id.buttonStop);

        buttonStart.setOnClickListener(this);
        buttonStop.setOnClickListener(this);
    }

    public void onClick(View src) {
        if (src.getId() == R.id.buttonStart) {
            startService(new Intent(this, MyService.class));
        } else if (src.getId() == R.id.buttonStop) {
            stopService(new Intent(this, MyService.class));
        }
    }
}