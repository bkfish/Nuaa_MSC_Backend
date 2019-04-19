package com.nuaa.msc.mapper;

import com.nuaa.msc.bean.Dao.GetAllDepartmentUserDao;
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

    @Select({
            "select r1.id,r1.department_id,r1.user_id,r1.role,d1.name as department_name,u1.real_name from department_user r1 left join department d1 on r1.department_id=d1.id left join user u1 on r1.user_id=u1.id"
    })
    @Results({
            @Result(column = "department_id",property = "departmentId"),
            @Result(column = "user_id",property = "userId"),
            @Result(column = "department_name",property = "departmentName"),
            @Result(column = "real_name",property = "realName")
    })
    List<GetAllDepartmentUserDao>getAllDepartmentUser();


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
