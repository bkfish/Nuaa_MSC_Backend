package com.nuaa.msc.service.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.nuaa.msc.bean.DepartmentUser;
import com.nuaa.msc.bean.Dao.InsertDepartmentUserDao;
import com.nuaa.msc.mapper.DepartmentUserMapper;
import com.nuaa.msc.service.DepartmentUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DepartmentUserServiceImpl implements DepartmentUserService {

    @Resource
    private DepartmentUserMapper departmentUserMapper;

    @Override
    public Object listAll(int page, int size) {
        PageHelper.startPage(page, size);
        List<DepartmentUser> departmentUserList = departmentUserMapper.listAll();
        PageInfo<DepartmentUser> pageInfo = new PageInfo<>(departmentUserList);
        return pageInfo;
    }

    @Override
    public int insert(InsertDepartmentUserDao insertDepartmentUserDao) {
        return departmentUserMapper.insert(insertDepartmentUserDao);
    }


    @Override
    public int remove(Integer departmentUserId) {
        return departmentUserMapper.remove(departmentUserId);
    }

    @Override
    public int update(DepartmentUser departmentUser) {
        return departmentUserMapper.update(departmentUser);
    }

    @Override
    public Object listAllDepartmentUserBydepartmentId(Integer departmentId) {
        return departmentUserMapper.listAllDepartmentUserBydepartmentId(departmentId);
    }

}

