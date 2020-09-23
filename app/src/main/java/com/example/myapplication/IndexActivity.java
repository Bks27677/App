package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.myapplication.adapter.RecentsAdapter;
import com.example.myapplication.adapter.TopPlacesAdapter;
import com.example.myapplication.model.RecentsData;
import com.example.myapplication.model.TopPlacesData;

import java.util.ArrayList;
import java.util.List;

public class IndexActivity extends AppCompatActivity {

    RecyclerView recentRecycler, topPlacesRecycler;
    RecentsAdapter recentsAdapter;
    TopPlacesAdapter topPlacesAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);

        TextView a1 = (TextView)findViewById(R.id.textView4);
        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(IndexActivity.this , M1Activity.class);
                startActivity(i);
            }
        });

        List<RecentsData> recentsDataList = new ArrayList<>();
        recentsDataList.add(new RecentsData("Chaotha1", "Kalasin", "25Km",R.drawable.recentimage1));
        recentsDataList.add(new RecentsData("Chaotha2", "Kalasin", "28Km",R.drawable.recentimage2));
        recentsDataList.add(new RecentsData("Chaotha1", "Kalasin", "25Km",R.drawable.recentimage1));
        recentsDataList.add(new RecentsData("Chaotha2", "Kalasin", "28Km",R.drawable.recentimage2));
        recentsDataList.add(new RecentsData("Chaotha1", "Kalasin", "25Km",R.drawable.recentimage1));
        recentsDataList.add(new RecentsData("Chaotha2", "Kalasin", "28Km",R.drawable.recentimage2));

        setRecentRecycler(recentsDataList);

        List<TopPlacesData> topPlacesDataList = new ArrayList<>();
        topPlacesDataList.add(new TopPlacesData("Chaotha3","Kalasin","21",R.drawable.topplaces));
        topPlacesDataList.add(new TopPlacesData("Chaotha4","Kalasin","22",R.drawable.topplaces));
        topPlacesDataList.add(new TopPlacesData("Chaotha5","Kalasin","25",R.drawable.topplaces));
        topPlacesDataList.add(new TopPlacesData("Chaotha6","Kalasin","27",R.drawable.topplaces));
        topPlacesDataList.add(new TopPlacesData("Chaotha7","Kalasin","28",R.drawable.topplaces));

        setTopPlacesRecycler(topPlacesDataList);

    }
    private void setRecentRecycler(List<RecentsData> recentsDataList){

        recentRecycler = findViewById(R.id.recent_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL,false);
        recentRecycler.setLayoutManager(layoutManager);
        recentsAdapter = new RecentsAdapter(this, recentsDataList);
        recentRecycler.setAdapter(recentsAdapter);
    }
    private  void setTopPlacesRecycler(List<TopPlacesData> topPlacesDataList){

        topPlacesRecycler = findViewById(R.id.top_places_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        topPlacesRecycler.setLayoutManager(layoutManager);
        topPlacesAdapter = new TopPlacesAdapter(this, topPlacesDataList);
        topPlacesRecycler.setAdapter(topPlacesAdapter);
    }

}

