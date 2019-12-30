package com.example.darazz.ui.account.home;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.darazz.MainActivity;
import com.example.darazz.R;
import com.example.darazz.model.Item;
import com.example.darazz.ui.account.home.AdapterActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {
    private HomeViewModel homeViewModel;
    RecyclerView recyclerView;
    List<Item> items = new ArrayList<>();
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        homeViewModel = ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home,container,false);
        recyclerView=root.findViewById(R.id.rvitems);
        if (MainActivity.it.isEmpty()){
            MainActivity.it.add(new Item("Helmet", "100", "5000","2020" ));


          AdapterActivity
        }
    }


    public HomeFragment() {
        // Required empty public constructor
    }

/*
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }*/

}
