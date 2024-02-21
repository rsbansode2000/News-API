package com.rohit.news_api.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class News {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private int clicks;
    @Column(name = "newsHeading")
    private String newsHeading;
    private String timing;
    private String writer;
    @Column(name = "fullNews")
    private String fullNews;
    private String image;

    public int getId() {
        return id;
    }

    public String getFullNews() {
        return fullNews;
    }

    public void setFullNews(String fullNews) {
        this.fullNews = fullNews;
    }

    public News() {
    }

    public News(int clicks, String newsHeading, String timing, String writer, String image, String fullNews) {
        this.clicks = clicks;
        this.newsHeading = newsHeading;
        this.timing = timing;
        this.writer = writer;
        this.image = image;
        this.fullNews = fullNews;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getClicks() {
        return clicks;
    }

    public void setClicks(int clicks) {
        this.clicks = clicks;
    }

    public String getNewsHeading() {
        return newsHeading;
    }

    public void setNewsHeading(String newsHeading) {
        this.newsHeading = newsHeading;
    }

    public String getTiming() {
        return timing;
    }

    public void setTiming(String timing) {
        this.timing = timing;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

}
