package com.atguitu.gulimall.ideproject.service;

import com.atguigu.common.utils.PageUtils;
import com.baomidou.mybatisplus.extension.service.IService;

import com.atguitu.gulimall.ideproject.entity.TemplateTableEntity;

import java.util.Map;

/**
 * 
 *
 * @author ybf
 * @email ${email}
 * @date 2021-10-14 10:24:32
 */
public interface TemplateTableService extends IService<TemplateTableEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

