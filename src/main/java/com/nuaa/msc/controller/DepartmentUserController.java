package com.nuaa.msc.controller;


import com.nuaa.msc.bean.Dao.InsertDepartmentUserDao;
import com.nuaa.msc.bean.DepartmentUser;
import com.nuaa.msc.service.DepartmentUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Api(description = "部门-人员关系表管理")
@RestController
@RequestMapping("/departmentUser")
public class DepartmentUserController {

    @Resource
    private DepartmentUserService departmentUserService;

    @GetMapping("/listAll")
    @ApiOperation(value = "查询全部")
    public Object listAll(@RequestParam(value = "page", defaultValue = "1") int page,
                          @RequestParam(value = "size", defaultValue = "10") int size) {
        return departmentUserService.listAll(page, size);
    }

    @GetMapping("/getAllDepartmentUserDao")
    @ApiOperation(value = "查询全部")
    public Object getAllDepartmentUserDao(@RequestParam(value = "page", defaultValue = "1") int page,
                          @RequestParam(value = "size", defaultValue = "10") int size) {
        return departmentUserService.getAllDepartmentUserDao(page, size);
    }

    @ApiOperation(value = "添加部门-人员关系表")
    @PostMapping("/insert")
    public int insert(@RequestBody InsertDepartmentUserDao insertDepartmentUserDao) {
        return departmentUserService.insert(insertDepartmentUserDao);
    }

    @DeleteMapping("/removeById")
    @ApiOperation(value = "根据id删除部门-人员关系表")
    public int remove(Integer departmentUserId) {
        return departmentUserService.remove(departmentUserId);
    }

    @PostMapping("/update")
    @ApiOperation(value = "修改部门-人员关系表")
    public int update(@RequestBody DepartmentUser departmentUser) {
        return departmentUserService.update(departmentUser);
    }

    @ApiOperation(value = "通过部门ID获得本部门下所有人id和职位")
    @PostMapping("/listAllDepartmentUserBydepartmentId")
    public Object listAllDepartmentUserBydepartmentId(Integer departmentId) {
        return departmentUserService.listAllDepartmentUserBydepartmentId(departmentId);
    }
}