package com.rohit.news_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.rohit.news_api.entity.News;
import com.rohit.news_api.repo.NewsRepo;
import com.rohit.news_api.service.NewsService;

@RestController
public class NewsController {

    @Autowired
    NewsService newsService;
    @Autowired
    NewsRepo newsRepo;


    @GetMapping("/")
    public String test(){
        return "Test";
    }

    //saving the news
    // @GetMapping("/saveNews")
    // public String saveNews(){
    //     return newsService.saveNews();
    // }

    //getting all news
    @GetMapping("/news")
    public List<News> getAllNews(){
        return newsService.getAllNews();
        
    }

    //getting news by id
    @GetMapping("news/{id}")
    public News getNewsById(@PathVariable("id") int id){
        return newsService.getNewsById(id);
    }

    //getting latest news
    @GetMapping("/news/latest")
    public List<News> getLatestNews(){
        return newsService.getLatestNews();
    }
    
}
