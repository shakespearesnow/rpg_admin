package com.rpg.mapper;


import com.rpg.dao.MenuBean;
import com.rpg.entity.RpgMenu;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.Mapping;

import java.util.List;

public interface SysMenuMapper {
    List<MenuBean> getAllMenuLists();

    List<RpgMenu> getAllMenu();
}
