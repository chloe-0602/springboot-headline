package com.chloe.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chloe.model.User;
import com.chloe.service.UserService;
import com.chloe.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author herry
* @description 针对表【news_user】的数据库操作Service实现
* @createDate 2024-08-02 14:32:22
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




