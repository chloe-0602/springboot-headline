package com.chloe.controller;

import com.chloe.common.result.Result;
import com.chloe.model.Type;
import com.chloe.model.vo.PortalVo;
import com.chloe.service.HeadlineService;
import com.chloe.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("portal")
@CrossOrigin
public class PortalController {
    @Autowired
    private TypeService typeService;
    @Autowired
    private HeadlineService headlineService;

    /**
     * 查询全部类别信息
     * @return
     */
    @GetMapping("findAllTypes")
    public Result findAllTypes(){
        //直接调用业务层,查询全部数据
        List<Type> list = typeService.list();
        return  Result.ok(list);
    }
    /**
     * 首页分页查询
     * @return
     */
    @PostMapping("findNewPage")
    public Result findNewPage(@RequestBody PortalVo portalVo){
        Result result = headlineService.findNewPage(portalVo);
        return result;
    }

    /**
     * 首页详情接口
     * @param hid
     * @return
     */
    @PostMapping("showHeadlineDetail")
    public Result showHeadlineDetail(Integer hid){
        Result result = headlineService.showHeadlineDetail(hid);
        return result;
    }

}
