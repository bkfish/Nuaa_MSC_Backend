package com.nuaa.msc.controller;


import com.nuaa.msc.bean.Dao.InsertNotificationDao;
import com.nuaa.msc.bean.Notification;
import com.nuaa.msc.service.NotificationService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Api(description = "通知管理")
@RestController
@RequestMapping("/notification")
public class NotificationController {

    @Resource
    private NotificationService notificationService;

    @GetMapping("/listAll")
    @ApiOperation(value = "查询全部")
    public Object listAll(@RequestParam(value = "page", defaultValue = "1") int page,
                          @RequestParam(value = "size", defaultValue = "10") int size) {
        return notificationService.listAll(page, size);
    }

    @ApiOperation(value = "时间格式 pattern = \"yyyy-MM-dd HH:mm:ss\"")
    @PostMapping("/insert")
    public int insert(@RequestBody InsertNotificationDao insertNotificationDao) {
        return notificationService.insert(insertNotificationDao);
    }

    @DeleteMapping("/removeById")
    @ApiOperation(value = "根据id删除通知")
    public int remove(Integer notificationId) {
        return notificationService.remove(notificationId);
    }

    @PostMapping("/update")
    @ApiOperation(value = "修改通知")
    public int update(@RequestBody Notification notification) {
        return notificationService.update(notification);
    }
}