package com.atguitu.gulimall.ideproject.service.impl;

import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.Query;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.atguitu.gulimall.ideproject.dao.TemplateFileTableDao;
import com.atguitu.gulimall.ideproject.entity.TemplateFileTableEntity;
import com.atguitu.gulimall.ideproject.service.TemplateFileTableService;


@Service("templateFileTableService")
public class TemplateFileTableServiceImpl extends ServiceImpl<TemplateFileTableDao, TemplateFileTableEntity> implements TemplateFileTableService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TemplateFileTableEntity> page = this.page(
                new Query<TemplateFileTableEntity>().getPage(params),
                new QueryWrapper<TemplateFileTableEntity>()
        );

        return new PageUtils(page);
    }

}