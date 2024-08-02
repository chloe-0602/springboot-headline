package com.chloe.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chloe.model.Type;
import com.chloe.service.TypeService;
import com.chloe.mapper.TypeMapper;
import org.springframework.stereotype.Service;

/**
* @author herry
* @description 针对表【news_type】的数据库操作Service实现
* @createDate 2024-08-02 14:32:21
*/
@Service
public class TypeServiceImpl extends ServiceImpl<TypeMapper, Type>
    implements TypeService{

}




