package com.bdqn.controller;

import cn.itrip.dao.itripAreaDic.ItripAreaDicMapper;
import cn.itrip.dao.itripLabelDic.ItripLabelDicMapper;
import cn.itrip.pojo.ItripAreaDic;
import cn.itrip.pojo.ItripLabelDic;
import itrip.common.Dto;
import itrip.common.DtoUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
public class bizController{

    @Resource
    ItripAreaDicMapper dao;
    @RequestMapping("/api/hotel/queryhotcity/{type}")
    @ResponseBody
    public Dto getCitty(@PathVariable("type")int t) throws Exception {
        Map map=new HashMap();
        map.put("aa",t);
        List<ItripAreaDic> dic=dao.getischina(map);
        System.out.println(t);
        return DtoUtil.returnDataSuccess(dic);
    }

    @Resource
    ItripLabelDicMapper dao1;

    @RequestMapping("api/hotel/queryhotelfeature")
    @ResponseBody
    public Dto getCittytese() throws Exception {
        List<ItripLabelDic> list=dao1.fisttop();
        return DtoUtil.returnDataSuccess(list);
    }



}
