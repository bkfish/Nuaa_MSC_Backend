package com.nuaa.msc.mapper;


import com.nuaa.msc.bean.Dao.InsertNotificationDao;
import com.nuaa.msc.bean.Notification;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface NotificationMapper {
    @Select({
            "select * from notification"
    })
    @Results({
            @Result(column = "user_id",property = "userId"),
            @Result(column = "start_time",property = "startTime"),
            @Result(column = "end_time",property = "endTime"),
    })
    List<Notification> listAll();

    @Insert({
            "insert into notification(`location`,`participants`,`start_time`,`end_time`,`title`,`time`,`summary`,`user_id`,`auther`,`content`,`cover`,`extension`)" +
                    "values(#{location},#{participants},#{startTime},#{endTime},#{title},#{time},#{summary},#{userId},#{auther},#{content},#{cover},#{extension})"
    })
    int insert(InsertNotificationDao insertNotificationDao);

    @Update({
            "update notification set location=#{location},participants=#{participants},start_time=#{startTime},end_time=#{endTime},title=#{title},time=#{time},summary=#{summary},user_id=#{userId},auther=#{auther},content=#{content},cover=#{cover},extension=#{extension} where id=#{id} "
    })
    int update(Notification notification);

    @Delete({
            "delete from notification where id=#{notificationId}"
    })
    int remove(Integer notificationId);

    @Select("select * from notification where id = #{id}")
    Notification findNotificationById(Integer id);


}

