package com.atguitu.gulimall.ideproject.service.impl;

import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.Query;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;


import com.atguitu.gulimall.ideproject.dao.TemplateTableDao;
import com.atguitu.gulimall.ideproject.entity.TemplateTableEntity;
import com.atguitu.gulimall.ideproject.service.TemplateTableService;


@Service("templateTableService")
public class TemplateTableServiceImpl extends ServiceImpl<TemplateTableDao, TemplateTableEntity> implements TemplateTableService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TemplateTableEntity> page = this.page(
                new Query<TemplateTableEntity>().getPage(params),
                new QueryWrapper<TemplateTableEntity>()
        );

        return new PageUtils(page);
    }

}