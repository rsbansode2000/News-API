package com.rohit.news_api.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rohit.news_api.entity.News;

@Repository
public interface NewsRepo extends JpaRepository<News, Integer> {
    //get news in order of time
    public abstract List<News> findAllByOrderByTimingDesc();
}
