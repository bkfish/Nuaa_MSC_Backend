package com.nuaa.msc.controller;


import com.nuaa.msc.bean.Department;
import com.nuaa.msc.bean.Dao.InsertDepartmentDao;
import com.nuaa.msc.service.DepartmentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Api(description = "部门管理")
@RestController
@RequestMapping("/department")
public class DepartmentController {

    @Resource
    private DepartmentService departmentService;

    @GetMapping("/listAll")
    @ApiOperation(value = "查询全部")
    public Object listAll(@RequestParam(value = "page", defaultValue = "1") int page,
                          @RequestParam(value = "size", defaultValue = "10") int size) {
        return departmentService.listAll(page, size);
    }

    @ApiOperation(value = "时间格式 pattern = \"yyyy-MM-dd HH:mm:ss\"")
    @PostMapping("/insert")
    public int insert(@RequestBody InsertDepartmentDao insertDepartmentDao) {
        return departmentService.insert(insertDepartmentDao);
    }

    @DeleteMapping("/removeById")
    @ApiOperation(value = "根据id删除部门")
    public int remove(Integer departmentId) {
        return departmentService.remove(departmentId);
    }

    @PostMapping("/update")
    @ApiOperation(value = "修改部门")
    public int update(@RequestBody Department department) {
        return departmentService.update(department);
    }

}
