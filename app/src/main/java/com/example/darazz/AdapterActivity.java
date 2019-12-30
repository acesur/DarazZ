package com.example.darazz;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.darazz.model.Item;

import java.util.ArrayList;
import java.util.List;

public class AdapterActivity extends RecyclerView.Adapter<AdapterActivity.MyHolder> {
    List<Item> item_list = new ArrayList<>();
    Context contexts;
}
public AdapterActivity(List<Item> item_list, Context contexts){
    this.item_list = item_list;
    this.contexts = contexts;
}
@NonNull
@Override
public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
    View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.)
}
