package com.atguitu.gulimall.ideproject.service;

import com.atguigu.common.utils.PageUtils;
import com.baomidou.mybatisplus.extension.service.IService;

import com.atguitu.gulimall.ideproject.entity.UserTableEntity;

import java.util.Map;

/**
 * 
 *
 * @author ybf
 * @email ${email}
 * @date 2021-10-09 12:33:56
 */
public interface UserTableService extends IService<UserTableEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

