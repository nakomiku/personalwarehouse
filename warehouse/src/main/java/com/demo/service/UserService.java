package com.demo.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.demo.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

public interface UserService extends IService<User> {
    IPage pageC(IPage<User> page);

    IPage pageCC(IPage<User> page, Wrapper wrapper);
}
