package com.nuaa.msc.service;

import com.nuaa.msc.bean.Article;
import com.nuaa.msc.bean.Dao.InsertArticleDao;

public interface ArticleService {

    Object listAll(int page, int size);

    int insert(InsertArticleDao insertArticleDao);

    int remove(Integer articleId);

    int update(Article article);
}