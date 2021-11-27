package com.example.dajaedaneoung;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.recyclerview.widget.RecyclerView;

class ViewHolder2 extends RecyclerView.ViewHolder {
    public ImageView imageView;
    public ImageButton button;

    ViewHolder2(Context context, View itemView) {
        super(itemView);

        imageView = itemView.findViewById(R.id.classph);
        button = itemView.findViewById(R.id.classbtn);

    }
}

