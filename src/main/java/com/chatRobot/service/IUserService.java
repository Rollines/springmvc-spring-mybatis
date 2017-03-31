package com.chatRobot.service;

import com.chatRobot.model.User;

/**
 * Created by junli on 2017/3/31.
 */
public interface IUserService {
    public User selectUser(long userId);
}
