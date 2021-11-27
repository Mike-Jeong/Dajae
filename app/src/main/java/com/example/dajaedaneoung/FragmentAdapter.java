package com.example.dajaedaneoung;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class FragmentAdapter extends FragmentStateAdapter {

    private int mPageCount = 3;

    public FragmentAdapter(AppCompatActivity fm) {
        super(fm);
        //this.mPageCount = pageCount;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {

            case 0:
                Fragmentt1 Fragment01 = new Fragmentt1();
                return Fragment01;
            case 1:
                Fragmentt2 Fragment02 = new Fragmentt2();
                return Fragment02;
            case 2:
                Fragmentt3 Fragment03 = new Fragmentt3();
                return Fragment03;

            default:
                return null;
        }
    }

    @Override
    public long getItemId(int position) {
        return super.getItemId(position);
    }

    @Override
    public int getItemCount() {
        return mPageCount;
    }
}
