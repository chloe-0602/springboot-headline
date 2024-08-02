package com.chloe.service;

import com.chloe.common.result.Result;
import com.chloe.model.Headline;
import com.baomidou.mybatisplus.extension.service.IService;
import com.chloe.model.vo.PortalVo;

/**
* @author herry
* @description 针对表【news_headline】的数据库操作Service
* @createDate 2024-08-02 14:32:21
*/
public interface HeadlineService extends IService<Headline> {

    Result findNewPage(PortalVo portalVo);

    Result showHeadlineDetail(Integer hid);
}
