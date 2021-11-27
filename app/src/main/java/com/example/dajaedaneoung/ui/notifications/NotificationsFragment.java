package com.example.dajaedaneoung.ui.notifications;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dajaedaneoung.Adapter2;
import com.example.dajaedaneoung.DataModel2;
import com.example.dajaedaneoung.R;
import com.example.dajaedaneoung.databinding.FragmentNotificationsBinding;

import java.util.ArrayList;

public class NotificationsFragment extends Fragment {

    private NotificationsViewModel notificationsViewModel;
    private FragmentNotificationsBinding binding;
    Adapter2 adapter2;
    RecyclerView recyclerView2;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        notificationsViewModel =
                new ViewModelProvider(this).get(NotificationsViewModel.class);

        binding = FragmentNotificationsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        recyclerView2 = (RecyclerView) root.findViewById(R.id.myrecycle);

        ArrayList<DataModel2> dataModels2 = new ArrayList<>();

        dataModels2.add(new DataModel2(R.drawable.card5, ""));
        dataModels2.add(new DataModel2(R.drawable.card21, ""));

        recyclerView2.setHasFixedSize(true);
        adapter2 = new Adapter2(getActivity(), dataModels2);
        recyclerView2.setLayoutManager(new GridLayoutManager(getActivity(),2));
        recyclerView2.setAdapter(adapter2);

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}