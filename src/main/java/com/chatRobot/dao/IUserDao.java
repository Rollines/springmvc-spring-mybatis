package com.chatRobot.dao;

import com.chatRobot.model.User;

/**
 * Created by junli on 2017/3/31.
 */
public interface IUserDao {
    User selectUser(long id);
}
