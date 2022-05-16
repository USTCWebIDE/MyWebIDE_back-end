package com.atguitu.gulimall.ideproject.service.impl;

import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.Query;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.atguitu.gulimall.ideproject.dao.UserTableDao;
import com.atguitu.gulimall.ideproject.entity.UserTableEntity;
import com.atguitu.gulimall.ideproject.service.UserTableService;


@Service("userTableService")
public class UserTableServiceImpl extends ServiceImpl<UserTableDao, UserTableEntity> implements UserTableService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<UserTableEntity> page = this.page(
                new Query<UserTableEntity>().getPage(params),
                new QueryWrapper<UserTableEntity>()
        );

        return new PageUtils(page);
    }

}