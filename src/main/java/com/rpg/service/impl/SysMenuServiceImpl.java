package com.rpg.service.impl;

import com.rpg.dao.MenuBean;
import com.rpg.entity.RpgMenu;
import com.rpg.mapper.SysMenuMapper;
import com.rpg.service.SysMenuService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysMenuServiceImpl implements SysMenuService {

    @Autowired
    private SysMenuMapper sysMenuMapper;
    @Override
    public List<MenuBean> getAllMenuLists() {
        return sysMenuMapper.getAllMenuLists();
    }
}
