package com.demo.service.Impl;

import com.demo.entity.Menu;
import com.demo.mapper.MenuMapper;
import com.demo.service.MenuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements MenuService {

}
