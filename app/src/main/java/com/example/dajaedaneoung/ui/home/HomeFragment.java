package com.example.dajaedaneoung.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
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
import com.example.dajaedaneoung.MainActivity2;
import com.example.dajaedaneoung.OnboardingActivity3;
import com.example.dajaedaneoung.R;
import com.example.dajaedaneoung.SearchActivity;
import com.example.dajaedaneoung.databinding.FragmentHomeBinding;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    private FragmentHomeBinding binding;
    Adapter adapter;
    Adapter2 adapter2;
    RecyclerView recyclerView;
    RecyclerView recyclerView2;
    TextView search;
    TextView more;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        search = (TextView)root.findViewById(R.id.search_view);
        more = (TextView)root.findViewById(R.id.ishowmore);
        recyclerView = (RecyclerView) root.findViewById(R.id.iconrecycle);
        recyclerView2 = (RecyclerView) root.findViewById(R.id.recomendrecycle);

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    Intent intent = new Intent(getContext(), SearchActivity.class);
                    startActivity(intent);

            }
        });
        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getContext(), MainActivity2.class);
                startActivity(intent);

            }
        });


        ArrayList<DataModel> dataModels = new ArrayList<>();
        ArrayList<DataModel2> dataModels2 = new ArrayList<>();

        dataModels.add(new DataModel(R.drawable.iknow, "?????? ??????"));
        dataModels.add(new DataModel(R.drawable.icamp, "?????? ??????"));
        dataModels.add(new DataModel(R.drawable.isport, "??????"));
        dataModels.add(new DataModel(R.drawable.idraw, "??????/?????????"));
        dataModels.add(new DataModel(R.drawable.imusic, "??????"));
        dataModels.add(new DataModel(R.drawable.iphoto, "??????"));
        dataModels.add(new DataModel(R.drawable.igame, "??????"));
        dataModels.add(new DataModel(R.drawable.ilang, "?????????"));
        dataModels.add(new DataModel(R.drawable.ipro, "???????????? ???"));
        dataModels.add(new DataModel(R.drawable.ibake, "?????????"));
        dataModels.add(new DataModel(R.drawable.iother, "??????"));
        dataModels.add(new DataModel(R.drawable.iall, "??????"));

        dataModels2.add(new DataModel2(R.drawable.card0, ""));
        dataModels2.add(new DataModel2(R.drawable.card1, ""));
        dataModels2.add(new DataModel2(R.drawable.card2, ""));
        dataModels2.add(new DataModel2(R.drawable.card3, ""));


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