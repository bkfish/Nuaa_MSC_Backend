package com.nuaa.msc.mapper;

import com.nuaa.msc.bean.Dao.InsertDepartmentUserDao;
import com.nuaa.msc.bean.DepartmentUser;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface DepartmentUserMapper {
    @Select({
            "select * from department_user"
    })
    @Results({
            @Result(column = "department_id",property = "departmentId"),
            @Result(column = "user_id",property = "userId")
    })
    List<DepartmentUser> listAll();
    @Insert({
            "insert into department_user(`department_id`, `user_id`,`role`, `extension`) values(#{departmentId}, #{userId},#{role}, #{extension})"
    })
    int insert(InsertDepartmentUserDao insertDepartmentUserDao);

    @Delete({
            "delete from department_user where id = #{departmentUserId}"
    })
    int remove(Integer departmentUserId);

    @Update({
            "update department_user set department_id = #{departmentId}, user_id = #{userId},role = #{role}, extension = #{extension   } where id = #{id}"
    })
    int update(DepartmentUser departmentUser);

    @Select({
            "select * from department_user where department_id=#{department_Id}"
    })
    @Results({
            @Result(column = "department_id",property = "departmentId"),
            @Result(column = "user_id",property = "userId")
    })
    List<DepartmentUser> listAllDepartmentUserBydepartmentId(Integer departmentId);

}
