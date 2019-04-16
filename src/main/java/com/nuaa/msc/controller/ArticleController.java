package com.nuaa.msc.controller;


import com.alibaba.fastjson.JSONObject;
import com.nuaa.msc.bean.Dao.InsertArticleDao;
import com.nuaa.msc.bean.Dao.LoginDao;
import com.nuaa.msc.bean.Article;
import com.nuaa.msc.service.ArticleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Api(description = "发布文章管理")
@RestController
@RequestMapping("/article")
public class ArticleController {

    @Resource
    private ArticleService articleService;

    @GetMapping("/listAll")
    @ApiOperation(value = "查询全部")
    public Object listAll(@RequestParam(value = "page", defaultValue = "1") int page,
                          @RequestParam(value = "size", defaultValue = "10") int size) {
        return articleService.listAll(page, size);
    }

    @ApiOperation(value = "时间格式 pattern = \"yyyy-MM-dd HH:mm:ss\"")
    @PostMapping("/insert")
    public int insert(@RequestBody InsertArticleDao insertArticleDao) {
        return articleService.insert(insertArticleDao);
    }

    @DeleteMapping("/removeById")
    @ApiOperation(value = "根据id删除文章")
    public int remove(Integer articleId) {
        return articleService.remove(articleId);
    }

    @PostMapping("/update")
    @ApiOperation(value = "修改文章")
    public int update(@RequestBody Article article) {
        return articleService.update(article);
    }

}