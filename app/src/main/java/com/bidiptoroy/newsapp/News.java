package com.bidiptoroy.newsapp;

public class News {
    String title;
    String url;
    String imgUrl;
    String author;
    String date;

    public News(String title, String url, String imgUrl, String author, String date) {
        this.title = title;
        this.url = url;
        this.imgUrl = imgUrl;
        this.author = author;
        this.date = date;
    }
}
