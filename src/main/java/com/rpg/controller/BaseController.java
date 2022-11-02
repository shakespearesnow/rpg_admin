package com.rpg.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;

/**
 * 控制器支持类
 */
public abstract class BaseController {

    public static final String STATUS_SUCCESS = "success";
    public static final String STATUS_FAIL = "fail";
    public static final String RESULT_DATA = "data";
    public static final String RESULT_MSG = "message";
    public static final String STATUS = "status";

    /**
     * 集团相关
     */
    public static final String GROUP_RESULT_CODE = "resultcode";
    public static final String GROUP_RESULT_MSG = "resultmsg";


    /**
     * 日志对象
     */
    protected Logger logger = Logger.getLogger(getClass());



}
