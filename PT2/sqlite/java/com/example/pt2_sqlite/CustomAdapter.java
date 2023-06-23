package com.example.pt2_sqlite;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomAdapter  extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {

    private Context context;
    private Activity activity;
    private ArrayList product_id, product_name, product_desc, product_price;

    CustomAdapter(Activity activity, Context context, ArrayList product_id, ArrayList product_name, ArrayList product_desc,
                  ArrayList product_price) {
        this.activity = activity;
        this.context = context;
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_desc = product_desc;
        this.product_price = product_price;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.my_row, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        holder.product_id_tv.setText(String.valueOf(product_id.get(position)));
        holder.product_name_tv.setText(String.valueOf(product_name.get(position)));
        holder.product_desc_tv.setText(String.valueOf(product_desc.get(position)));
        holder.product_price_tv.setText(String.valueOf(product_price.get(position)));
        holder.mainLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, UpdateActivity.class);
                intent.putExtra("id", String.valueOf(product_id.get(position)));
                intent.putExtra("name", String.valueOf(product_name.get(position)));
                intent.putExtra("desc", String.valueOf(product_desc.get(position)));
                intent.putExtra("price", String.valueOf(product_price.get(position)));
                activity.startActivityForResult(intent, 1);
            }
        });
    }

    @Override
    public int getItemCount() {
        return product_id.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        TextView product_id_tv, product_name_tv, product_desc_tv, product_price_tv;
        LinearLayout mainLayout;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            product_id_tv = itemView.findViewById(R.id.product_id_tv);
            product_name_tv = itemView.findViewById(R.id.product_name_tv);
            product_desc_tv = itemView.findViewById(R.id.product_desc_tv);
            product_price_tv = itemView.findViewById(R.id.product_price_tv);
            mainLayout = itemView.findViewById(R.id.mainLayout);
        }
    }
}
