package com.nuaa.msc.service.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.nuaa.msc.bean.Department;
import com.nuaa.msc.bean.Dao.InsertDepartmentDao;
import com.nuaa.msc.mapper.DepartmentMapper;
import com.nuaa.msc.service.DepartmentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Resource
    private DepartmentMapper departmentMapper;

    @Override
    public Object listAll(int page, int size) {
        PageHelper.startPage(page, size);
        List<Department> departmentList = departmentMapper.listAll();
        PageInfo<Department> pageInfo = new PageInfo<>(departmentList);
        return pageInfo;
    }

    @Override
    public int insert(InsertDepartmentDao insertDepartmentDao) {
        return departmentMapper.insert(insertDepartmentDao);
    }


    @Override
    public int remove(Integer departmentId) {
        return departmentMapper.remove(departmentId);
    }

    @Override
    public int update(Department department) {
        return departmentMapper.update(department);
    }
}
