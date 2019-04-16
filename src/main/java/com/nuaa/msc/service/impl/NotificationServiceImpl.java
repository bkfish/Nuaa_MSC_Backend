package com.nuaa.msc.service.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.nuaa.msc.bean.Notification;
import com.nuaa.msc.bean.Dao.InsertNotificationDao;
import com.nuaa.msc.mapper.NotificationMapper;
import com.nuaa.msc.service.NotificationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class NotificationServiceImpl implements NotificationService {

    @Resource
    private NotificationMapper notificationMapper;

    @Override
    public Object listAll(int page, int size) {
        PageHelper.startPage(page, size);
        List<Notification> notificationList = notificationMapper.listAll();
        PageInfo<Notification> pageInfo = new PageInfo<>(notificationList);
        return pageInfo;
    }

    @Override
    public int insert(InsertNotificationDao insertNotificationDao) {
        return notificationMapper.insert(insertNotificationDao);
    }


    @Override
    public int remove(Integer notificationId) {
        return notificationMapper.remove(notificationId);
    }

    @Override
    public int update(Notification notification) {
        return notificationMapper.update(notification);
    }
}
