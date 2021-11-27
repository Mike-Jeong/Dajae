package com.example.dajaedaneoung;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import java.util.ArrayList;

public class Fragmentt3 extends Fragment {

    Adapter2 adapter2;
    RecyclerView recyclerView2;;

    public Fragmentt3() {

    }

    public static Fragmentt1 newInstance() {
        Fragmentt1 fragment = new Fragmentt1();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_fragmentt3, container, false);
        recyclerView2 = (RecyclerView) root.findViewById(R.id.changerecycle);

        ArrayList<DataModel2> dataModels2 = new ArrayList<>();

        dataModels2.add(new DataModel2(R.drawable.card2, ""));
        dataModels2.add(new DataModel2(R.drawable.card_3, ""));
        dataModels2.add(new DataModel2(R.drawable.card4, ""));
        dataModels2.add(new DataModel2(R.drawable.card5, ""));
        dataModels2.add(new DataModel2(R.drawable.card6, ""));
        dataModels2.add(new DataModel2(R.drawable.card7, ""));
        dataModels2.add(new DataModel2(R.drawable.card18, ""));
        dataModels2.add(new DataModel2(R.drawable.card19, ""));

        recyclerView2.setHasFixedSize(true);
        adapter2 = new Adapter2(getActivity(), dataModels2);
        recyclerView2.setLayoutManager(new GridLayoutManager(getActivity(),2));
        recyclerView2.setAdapter(adapter2);

        // Inflate the layout for this fragment
        return root;
    }

}