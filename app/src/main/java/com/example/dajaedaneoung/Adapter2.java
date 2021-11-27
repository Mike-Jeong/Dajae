package com.example.dajaedaneoung;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter2 extends RecyclerView.Adapter<ViewHolder2> {
    private ArrayList<DataModel2> arrayList;
    Context context;
    String TAG = "Adapter";

    public Adapter2(Context context, ArrayList<DataModel2> dataModels) {
        this.arrayList = dataModels;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder2 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.list_class, parent, false);

        ViewHolder2 viewholder = new ViewHolder2(context, view);

        return viewholder;
    }

    @Override public void onBindViewHolder(@NonNull ViewHolder2 holder, @SuppressLint("RecyclerView") int position) {
        Log.d(TAG,"onBindViewHolder");

        ViewHolder2 myViewHolder = (ViewHolder2) holder;

        myViewHolder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, position +"번째 텍스트 뷰 클릭", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(context, MainActivity4.class);
                context.startActivity(intent);
            }
        });

        myViewHolder.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, position+"번째 버튼 클릭", Toast.LENGTH_SHORT).show();
            }
        });



        myViewHolder.imageView.setImageResource(arrayList.get(position).image_path);

    }



    @Override
    public int getItemCount() {

        return arrayList.size();

    }
}

