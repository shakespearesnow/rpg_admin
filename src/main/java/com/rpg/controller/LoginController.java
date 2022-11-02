package com.rpg.controller;

import com.rpg.bo.LoginParam;
import com.rpg.bo.LoginUser;
import com.rpg.service.SysLoginService;
import com.rpg.utils.result.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController extends BaseController {


//    @Autowired
//    private TokenService tokenService;

    @Autowired
    private SysLoginService sysLoginService;


    @ResponseBody
    @RequestMapping("/login")
    public ResultData<?> login(@RequestBody LoginParam param){
//        LoginUser userInfo = sysLoginService.login(param);
//
//        return ResultData.ok(tokenService.createToken(userInfo));
        return ResultData.ok();
    }
}
