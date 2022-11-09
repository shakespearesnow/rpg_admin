package com.rpg.service.impl;

import com.rpg.bo.LoginUser;
import com.rpg.constants.common.CacheConstants;
import com.rpg.service.RedisService;
import com.rpg.service.TokenService;
import com.rpg.utils.IdUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.security.util.SecurityConstants;

import java.util.HashMap;
import java.util.Map;

@Service
public class TokenServiceImpl implements TokenService {

    @Autowired
    private RedisService redisService;

    protected static final long MILLIS_SECOND = 1000;

    protected static final long MILLIS_MINUTE = 60 * MILLIS_SECOND;

    private final static long expireTime = CacheConstants.EXPIRATION;

    private final static String ACCESS_TOKEN = CacheConstants.LOGIN_TOKEN_KEY;

    private final static Long MILLIS_MINUTE_TEN = CacheConstants.REFRESH_TIME * MILLIS_MINUTE;


    /**
     * 创建令牌
     */
    public Map<String, Object> createToken(LoginUser loginUser)
    {
//        String token = IdUtils.fastUUID();
//        Long userId = loginUser.getSysUser().getUserId();
//        String userName = loginUser.getSysUser().getUserName();
//        loginUser.setToken(token);
//        loginUser.setUserid(userId);
//        loginUser.setUsername(userName);
//        loginUser.setIpaddr(IpUtils.getIpAddr(ServletUtils.getRequest()));
//        refreshToken(loginUser);
//
//        // Jwt存储信息
//        Map<String, Object> claimsMap = new HashMap<String, Object>();
//        claimsMap.put(SecurityConstants.USER_KEY, token);
//        claimsMap.put(SecurityConstants.DETAILS_USER_ID, userId);
//        claimsMap.put(SecurityConstants.DETAILS_USERNAME, userName);

        // 接口返回信息
        Map<String, Object> rspMap = new HashMap<String, Object>();
//        rspMap.put("access_token", JwtUtils.createToken(claimsMap));
        rspMap.put("expires_in", expireTime);
        return rspMap;
    }

}
