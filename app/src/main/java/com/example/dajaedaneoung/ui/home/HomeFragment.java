package com.example.dajaedaneoung.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dajaedaneoung.Adapter;
import com.example.dajaedaneoung.Adapter2;
import com.example.dajaedaneoung.DataModel;
import com.example.dajaedaneoung.DataModel2;
import com.example.dajaedaneoung.R;
import com.example.dajaedaneoung.databinding.FragmentHomeBinding;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    private FragmentHomeBinding binding;
    Adapter adapter;
    Adapter2 adapter2;
    RecyclerView recyclerView;
    RecyclerView recyclerView2;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        recyclerView = (RecyclerView) root.findViewById(R.id.iconrecycle);
        recyclerView2 = (RecyclerView) root.findViewById(R.id.recomendrecycle);


        ArrayList<DataModel> dataModels = new ArrayList<>();
        ArrayList<DataModel2> dataModels2 = new ArrayList<>();

        dataModels.add(new DataModel(R.drawable.iknow, "전공 지식"));
        dataModels.add(new DataModel(R.drawable.icamp, "대학 생활"));
        dataModels.add(new DataModel(R.drawable.isport, "운동"));
        dataModels.add(new DataModel(R.drawable.idraw, "그림/만들기"));
        dataModels.add(new DataModel(R.drawable.imusic, "음악"));
        dataModels.add(new DataModel(R.drawable.iphoto, "사진"));
        dataModels.add(new DataModel(R.drawable.igame, "게임"));
        dataModels.add(new DataModel(R.drawable.ilang, "외국어"));
        dataModels.add(new DataModel(R.drawable.ipro, "프로그램 툴"));
        dataModels.add(new DataModel(R.drawable.ibake, "베이킹"));
        dataModels.add(new DataModel(R.drawable.iother, "기타"));
        dataModels.add(new DataModel(R.drawable.iall, "전체"));

        dataModels2.add(new DataModel2(R.drawable.card_1, "전체"));
        dataModels2.add(new DataModel2(R.drawable.card4, "전체2"));
        dataModels2.add(new DataModel2(R.drawable.card_12, "전체3"));
        dataModels2.add(new DataModel2(R.drawable.card_13, "전체4"));


        recyclerView.setHasFixedSize(true);
        adapter = new Adapter(getActivity(), dataModels);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(),5));
        recyclerView.setAdapter(adapter);

        recyclerView2.setHasFixedSize(true);
        adapter2 = new Adapter2(getActivity(), dataModels2);
        recyclerView2.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.HORIZONTAL, false));
        recyclerView2.setAdapter(adapter2);

        return root;
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}