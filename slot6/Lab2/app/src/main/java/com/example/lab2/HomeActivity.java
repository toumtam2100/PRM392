package com.example.lab2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        List<Product> products = new ArrayList<>();
        products.add(new Product(R.drawable.pharmacy, "Pharmacy"));
        products.add(new Product(R.drawable.registry, "Registry"));
        products.add(new Product(R.drawable.cart, "Cartwheel"));
        products.add(new Product(R.drawable.clothes, "Clothing"));
        products.add(new Product(R.drawable.shoes, "Shoes"));
        products.add(new Product(R.drawable.accesories, "Accessories"));
        products.add(new Product(R.drawable.grill, "Patio & Garden"));
        products.add(new Product(R.drawable.baby, "Baby"));
        products.add(new Product(R.drawable.home, "Home"));

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 3));
        recyclerView.setAdapter(new ProductAdapter(products));
    }
}







