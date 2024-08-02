package com.chloe.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.chloe.model.Headline;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chloe.model.vo.PortalVo;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

/**
* @author herry
* @description 针对表【news_headline】的数据库操作Mapper
* @createDate 2024-08-02 14:32:21
* @Entity com.chloe.model.Headline
*/
public interface HeadlineMapper extends BaseMapper<Headline> {

    //自定义分页查询方法
    IPage<Map> selectPageMap(IPage<Headline> page,
                             @Param("portalVo") PortalVo portalVo);
}




