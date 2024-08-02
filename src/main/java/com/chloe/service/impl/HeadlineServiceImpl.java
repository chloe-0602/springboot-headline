package com.chloe.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chloe.model.Headline;
import com.chloe.service.HeadlineService;
import com.chloe.mapper.HeadlineMapper;
import org.springframework.stereotype.Service;

/**
* @author herry
* @description 针对表【news_headline】的数据库操作Service实现
* @createDate 2024-08-02 14:32:21
*/
@Service
public class HeadlineServiceImpl extends ServiceImpl<HeadlineMapper, Headline>
    implements HeadlineService{

}




