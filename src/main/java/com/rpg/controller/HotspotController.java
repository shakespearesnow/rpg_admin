package com.rpg.controller;

import com.rpg.utils.result.ResultData;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/hotspot")
public class HotspotController extends BaseController{


    @RequestMapping(value = "getAllHotspot", method = RequestMethod.POST)
    @ResponseBody
    public ResultData<?> getAllHotspot() {
       List<String> strings = new ArrayList<>();
       strings.add("卫星视角感受湿地保护成效");
       strings.add("呼和浩特：不准对单元门一锁了之");
       strings.add("落马厅官把金条藏鸡鸭鱼肚子放冰柜");
        return ResultData.ok(strings, "success");
    }
}
