package com.rpg.controller;

import com.rpg.service.HotspotService;
import com.rpg.utils.result.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/hotspot")
public class HotspotController extends BaseController{

    @Autowired
    private HotspotService hotspotService;

    @RequestMapping(value = "getAllHotspot", method = RequestMethod.POST)
    @ResponseBody
    public ResultData<?> getAllHotspot() {
        return ResultData.ok(hotspotService.getAllHotspot(), "success");
    }
}
