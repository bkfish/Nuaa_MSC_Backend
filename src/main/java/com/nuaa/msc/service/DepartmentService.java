package com.nuaa.msc.service;

import com.nuaa.msc.bean.Dao.InsertDepartmentDao;
import com.nuaa.msc.bean.Department;

public interface DepartmentService {

    Object listAll(int page, int size);

    int insert(InsertDepartmentDao insertDepartmentDao);

    int remove(Integer departmentId);

    int update(Department department);
}
