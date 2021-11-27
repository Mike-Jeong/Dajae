package com.example.dajaedaneoung;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

class ViewHolder extends RecyclerView.ViewHolder {
    public ImageView imageView;

    ViewHolder(Context context, View itemView) {
        super(itemView);

        imageView = itemView.findViewById(R.id.menuimage);

    }
}

