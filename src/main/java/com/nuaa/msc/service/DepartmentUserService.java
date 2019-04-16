package com.nuaa.msc.service;

import com.nuaa.msc.bean.Dao.InsertDepartmentUserDao;
import com.nuaa.msc.bean.DepartmentUser;

import java.util.List;

public interface DepartmentUserService {

    Object listAll(int page, int size);

    int insert(InsertDepartmentUserDao insertDepartmentUserDao);

    int remove(Integer departmentUserId);

    int update(DepartmentUser departmentUser);

    Object listAllDepartmentUserBydepartmentId(Integer departmentId);
}