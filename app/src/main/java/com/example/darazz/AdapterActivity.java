package com.example.darazz;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.darazz.model.Item;

import java.util.ArrayList;
import java.util.List;

public class AdapterActivity extends RecyclerView.Adapter<AdapterActivity.MyHolder> {
    List<Item> item_list = new ArrayList<>();
    Context contexts;

    public AdapterActivity(List<Item> item_list, Context contexts) {
        this.item_list = item_list;
        this.contexts = contexts;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        MyHolder myHolder = new MyHolder(view);
        return myHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, final int position) {
        final Item item = item_list.get(position);
        holder.itemname.setText(item.getName());
        holder.qty.setText(item.getQty());
        holder.price.setText(item.getPrice());
        holder.year.setText(item.getYear());
        holder.imageview.setImageDrawable(contexts.getResources().getDrawable(R.drawable.ic_delete));
    }

    @Override
    public int getItemCount(){
        return item_list.size();
    }
    public class MyHolder extends RecyclerView.ViewHolder{
        ImageView imageview, delete;
        TextView itemname, qty, price, year;
        public  MyHolder(@NonNull View itemView){
            super(itemView);
            imageview = itemView.findViewById(R.id.image);
            itemname = itemView.findViewById(R.id.itemname);
            qty = itemView.findViewById(R.id.itemqty);
            price = itemView.findViewById(R.id.itemprice);
            year = itemView.findViewById(R.id.itemManufac);
        }
    }
}
