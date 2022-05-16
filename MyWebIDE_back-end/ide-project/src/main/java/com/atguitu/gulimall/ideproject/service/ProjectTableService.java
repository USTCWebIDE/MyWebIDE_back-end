package com.atguitu.gulimall.ideproject.service;

import com.atguigu.common.utils.PageUtils;
import com.baomidou.mybatisplus.extension.service.IService;

import com.atguitu.gulimall.ideproject.entity.ProjectTableEntity;

import java.util.List;
import java.util.Map;

/**
 * 
 *
 * @author ybf
 * @email ${email}
 * @date 2021-10-09 12:33:56
 */
public interface ProjectTableService extends IService<ProjectTableEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<ProjectTableEntity> selectAllProjectByUserId(Integer userId);

    void updateLastEiditTime(Integer id);

    Integer getRecentEiditProjectByUserId(Integer id);

    List<ProjectTableEntity> getRecentTemplateByUid(Integer id);

    String createNewProject(ProjectTableEntity projectTable);

    List<ProjectTableEntity> findProjectByUid(Integer userId);

    void removeByProjectEntity(ProjectTableEntity projectTableEntity);

    void runProjectById(Integer projectId);
    void testProject();
}

