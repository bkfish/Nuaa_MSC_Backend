package com.nuaa.msc.mapper;

import com.nuaa.msc.bean.Dao.InsertUserDao;
import com.nuaa.msc.bean.Dao.LoginDao;
import com.nuaa.msc.bean.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select({
            "select * from user"
    })
    @Results({
            @Result(column = "real_name",property = "realName"),
            @Result(column = "nick_name",property = "nickName"),
            @Result(column = "home_page",property = "homePage"),
            @Result(column = "student_num",property = "studentNum"),
    })
    List<User> listAll();


    @Insert({
            "insert into user(`username`, `real_name`,`nick_name`,`home_page`,`gender`, " +
                    "`student_num`,`extension`,`password`,`birthday`) values(#{username}, #{realName}," +
                    "#{nickName},#{homePage},#{gender}, #{studentNum},#{extension}," +
                    "#{password},#{birthday})"
    })
    int insert(InsertUserDao insertUserDao);

    @Delete({
            "delete from user where id = #{userId}"
    })
    int remove(Integer userId);

    @Update({
            "update user set username = #{username},password=#{password}, real_name = #{password},nick_name=#{nickName},home_page=#{homePage}," +
                    "gender=#{gender},student_num=#{studentNum},extension=#{extension},birthday=#{birthday} where id = #{id}"
    })
    int update(User user);

    @Select({
            "select username from user where username=#{username} and password=#{password}"
    })
    String login(LoginDao loginDao);

    @Select("select * from user where id = #{id}")
    User findUserById(Integer id);

}
