package com.nuaa.msc.service.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.nuaa.msc.bean.Article;
import com.nuaa.msc.bean.Dao.InsertArticleDao;
import com.nuaa.msc.mapper.ArticleMapper;
import com.nuaa.msc.service.ArticleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Resource
    private ArticleMapper articleMapper;

    @Override
    public Object listAll(int page, int size) {
        PageHelper.startPage(page, size);
        List<Article> articleList = articleMapper.listAll();
        PageInfo<Article> pageInfo = new PageInfo<>(articleList);
        return pageInfo;
    }

    @Override
    public int insert(InsertArticleDao insertArticleDao) {
        return articleMapper.insert(insertArticleDao);
    }


    @Override
    public int remove(Integer articleId) {
        return articleMapper.remove(articleId);
    }

    @Override
    public int update(Article article) {
        return articleMapper.update(article);
    }
}
