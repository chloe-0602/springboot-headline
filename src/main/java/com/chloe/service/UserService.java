package com.chloe.service;

import com.chloe.common.result.Result;
import com.chloe.model.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author herry
* @description 针对表【news_user】的数据库操作Service
* @createDate 2024-08-02 14:32:22
*/
public interface UserService extends IService<User> {

    Result login(User user);

    Result getUserInfo(String token);

    Result checkUserName(String username);

    Result regist(User user);
}
