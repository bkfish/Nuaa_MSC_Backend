package com.nuaa.msc.mapper;

import com.nuaa.msc.bean.Article;
import com.nuaa.msc.bean.Dao.InsertArticleDao;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ArticleMapper {
    @Select({
            "select * from article"
    })
    @Results({
            @Result(column = "user_id",property = "userId")
    })
    List<Article> listAll();

    @Insert({
            "insert into article(`title`,`time`,`summary`,`user_id`,`auther`,`content`,`cover`,`extension`)" +
                    "values(#{title},#{time},#{summary},#{userId},#{auther},#{content},#{cover},#{extension})"
    })
    int insert(InsertArticleDao insertArticleDao);

    @Update({
            "update department set title=#{title},time=#{time},summary=#{summary},user_id=#{userId},auther=#{auther},content=#{content},cover=#{cover},extension=#{extension} where id=#{id} "
    })
    int update(Article article);

    @Delete({
            "delete from article where id=#{articleId}"
    })
    int remove(Integer articleId);


}
