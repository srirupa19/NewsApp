package com.bidiptoroy.newsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.NewsViewHolder> {
    Context context;
    ArrayList<News> news;


    class NewsViewHolder extends RecyclerView.ViewHolder {
        View view;
        TextView txtTitle,txtDate;
        ImageView imgNews;
        LinearLayout llContent;

        public NewsViewHolder(View view) {
            super(view);
            this.view=view;
             txtTitle = view.findViewById(R.id.newsTitle);
             txtDate = view.findViewById(R.id.newsDate);
             imgNews = view.findViewById(R.id.imgNews);
             llContent = view.findViewById(R.id.newsContent);
        }

    }
    public NewsAdapter(Context context, ArrayList<News> news) {
        this.context = context;
        this.news = news;
    }


    public NewsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.news_details_single_row,parent,false);
        return new NewsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NewsViewHolder holder, int position) {
        News mNews = news.get(position);
        holder.txtTitle.setText(mNews.title);
        holder.txtDate.setText(mNews.date);
    }

    @Override
    public int getItemCount() {
        return news.size();
    }




}
