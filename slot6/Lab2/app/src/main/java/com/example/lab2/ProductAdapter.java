package com.example.lab2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {
    private List<Product> products;

    public ProductAdapter(List<Product> products) {
        this.products = products;
    }

    public class ProductViewHolder extends RecyclerView.ViewHolder {
        private ImageView productIcon;
        private TextView productLabel;

        public ProductViewHolder(View itemView) {
            super(itemView);
            productIcon = itemView.findViewById(R.id.productIcon);
            productLabel = itemView.findViewById(R.id.productLabel);
        }

        public void bind(Product product) {
            productIcon.setImageResource(product.getIcon());
            productLabel.setText(product.getLabel());
        }
    }

    @Override
    public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_product, parent, false);
        return new ProductViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ProductViewHolder holder, int position) {
        final Product product = products.get(position);
        holder.bind(product);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message = "You clicked product number " + (position + 1);
                Toast.makeText(view.getContext(), message, Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return products.size();
    }
}
