package com.example.dajaedaneoung;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<ViewHolder> {
    private ArrayList<DataModel> arrayList;
    Context context;
    String TAG = "Adapter";

    public Adapter(Context context, ArrayList<DataModel> dataModels) {
        this.arrayList = dataModels;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.list_icon, parent, false);

        ViewHolder viewholder = new ViewHolder(context, view);

        return viewholder;
    }

    @Override public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        Log.d(TAG,"onBindViewHolder");

        ViewHolder myViewHolder = (ViewHolder) holder;

        myViewHolder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, position+"번째 텍스트 뷰 클릭" + arrayList.get(position).cata, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(context, MainActivity2.class);
                context.startActivity(intent);
            }
        });

        myViewHolder.imageView.setImageResource(arrayList.get(position).image_path);

    }



    @Override
    public int getItemCount() {

        return arrayList.size();

    }
}

