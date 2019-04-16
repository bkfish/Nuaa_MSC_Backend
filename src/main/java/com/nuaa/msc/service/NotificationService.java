package com.nuaa.msc.service;

import com.nuaa.msc.bean.Dao.InsertNotificationDao;
import com.nuaa.msc.bean.Notification;

public interface NotificationService {

    Object listAll(int page, int size);

    int insert(InsertNotificationDao insertNotificationDao);

    int remove(Integer notificationId);

    int update(Notification notification);
}
