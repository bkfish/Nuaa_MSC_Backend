package com.nuaa.msc.mapper;


import com.nuaa.msc.bean.Dao.InsertDepartmentDao;
import com.nuaa.msc.bean.Department;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface DepartmentMapper {
    @Select({
            "select * from department"
    })
    List<Department> listAll(String filter);

    @Insert({
            "insert into department(`name`,`extension`)values(#{name},#{extension})"
    })
    int insert(InsertDepartmentDao insertDepartmentDao);

    @Update({
            "update department set name=#{name},extension=#{extension} where id=#{id} "
    })
    int update(Department department);

    @Delete({
            "delete from department where id=#{departmentId}"
    })
    int remove(Integer departmentId);


}
