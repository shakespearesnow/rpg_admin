package com.rpg.controller;

import com.rpg.service.SysMenuService;
import com.rpg.utils.result.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SysMenuController extends BaseController{

    @Autowired
    private SysMenuService sysMenuService;


    @ResponseBody
    @RequestMapping("/getAllMenuLists")
    public ResultData<?> getAllMenuLists(){
        return ResultData.ok(sysMenuService.getAllMenuLists());
    }

}
