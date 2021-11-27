package com.example.dajaedaneoung;

import android.annotation.TargetApi;
import android.graphics.Color;

import android.os.Build;
import android.os.Bundle;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;

import androidx.annotation.NonNull;
import androidx.viewpager2.widget.ViewPager2;
import androidx.appcompat.app.AppCompatActivity;

import com.example.dajaedaneoung.databinding.ActivityMain2Binding;
import com.google.android.material.tabs.TabLayoutMediator;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager2 viewPager2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setTabTextColors(Color.parseColor("#7C7C7C"), Color.parseColor("#FE4819"));
        tabLayout.setSelectedTabIndicatorColor(Color.parseColor("#FE4819"));
//      mTabLayout.addTab(mTabLayout.newTab().setText("홈"));

        viewPager2 = (ViewPager2) findViewById(R.id.view_pager);

        //프레그먼트 이동 구현
        FragmentAdapter fragmentAdapter = new FragmentAdapter(this);
        viewPager2.setAdapter(fragmentAdapter);

        final List<String> tabElement = Arrays.asList("전체", "재능 구매", "재능 교환");

        //tabLyout와 viewPager 연결
        new TabLayoutMediator(tabLayout, viewPager2, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull @NotNull TabLayout.Tab tab, int position) {
                TextView textView = new TextView(MainActivity2.this);
                textView.setText(tabElement.get(position));
                tab.setCustomView(textView);
            }
        }).attach();


    }
}