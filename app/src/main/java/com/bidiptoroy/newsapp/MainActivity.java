package com.bidiptoroy.newsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView newsRecyclerView;
    NewsAdapter newsAdapter;
    RecyclerView.LayoutManager layoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<News> list = new ArrayList<>();
        News news1 = new News("News1","url1","imgURL1","Author1","Date1");
        News news2 = new News("News2","url1","imgURL1","Author2","Date3");
        News news3 = new News("News2","url1","imgURL1","Author3","Date3");
        list.add(news1);
        list.add(news2);
        list.add(news3);


        newsRecyclerView = findViewById(R.id.newsRecyclerView);
        layoutManager = new LinearLayoutManager(this);
        newsRecyclerView.setLayoutManager(layoutManager);
        newsAdapter = new NewsAdapter(this,list);
        newsRecyclerView.setAdapter(newsAdapter);

    }
}