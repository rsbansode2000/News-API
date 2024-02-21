package com.rohit.news_api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rohit.news_api.entity.News;
import com.rohit.news_api.repo.NewsRepo;

@Service
public class NewsService {

    

    @Autowired
    NewsRepo newsRepo;

    //Saving
    // public String saveNews(){
    //     News news = new News(clicks, newsHeading, timing, writer, image, fullNews);
    //     newsRepo.save(news);
    //     return "News Added";
    // }

    //Get All News
    public List<News> getAllNews(){
        List<News> news = newsRepo.findAll();
        return news;
    }

    //Get News By Id
    public News getNewsById(int id){
        return newsRepo.findById(id).get();
    }

    //Get latest news
    public List<News> getLatestNews(){
        return newsRepo.findAllByOrderByTimingDesc();
    }
    
}
