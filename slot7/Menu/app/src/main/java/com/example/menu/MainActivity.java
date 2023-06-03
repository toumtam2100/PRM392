package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Create an Options menu
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.optionmenu, menu);
        return true;
    }

    // Click an item in Options menu
    public boolean onOptionsItemSelected(MenuItem item) {
        int itemId = item.getItemId();

        if (itemId == R.id.message) {
            Toast.makeText(getApplicationContext(), "You clicked Message menu", Toast.LENGTH_SHORT).show();
            return true;
        } else if (itemId == R.id.picture) {
            Toast.makeText(getApplicationContext(), "You clicked Picture menu", Toast.LENGTH_SHORT).show();
            return true;
        } else if (itemId == R.id.mode) {
            Toast.makeText(getApplicationContext(), "You clicked Mode menu", Toast.LENGTH_SHORT).show();
            return true;
        } else if (itemId == R.id.option_favorites1) {
            Toast.makeText(getApplicationContext(), "You clicked Music menu", Toast.LENGTH_SHORT).show();
            return true;
        } else if (itemId == R.id.option_favorites2) {
            Toast.makeText(getApplicationContext(), "You clicked Book menu", Toast.LENGTH_SHORT).show();
            return true;
        } else if (itemId == R.id.about) {
            Toast.makeText(getApplicationContext(), "You clicked About menu", Toast.LENGTH_SHORT).show();
            return true;
        } else if (itemId == R.id.exit) {
            finish();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}