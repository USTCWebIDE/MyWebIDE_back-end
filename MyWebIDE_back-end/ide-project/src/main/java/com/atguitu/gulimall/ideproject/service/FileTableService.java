package com.atguitu.gulimall.ideproject.service;

import com.atguigu.common.utils.PageUtils;
import com.atguitu.gulimall.ideproject.ResponseVo.ProjectContent;
import com.atguitu.gulimall.ideproject.ResponseVo.ProjectVo;
import com.atguitu.gulimall.ideproject.entity.ProjectTableEntity;
import com.baomidou.mybatisplus.extension.service.IService;
import com.atguitu.gulimall.ideproject.entity.FileTableEntity;

import java.util.Map;

/**
 * 
 *
 * @author ybf
 * @email ${email}
 * @date 2021-10-09 12:33:56
 */
public interface FileTableService extends IService<FileTableEntity> {

    PageUtils queryPage(Map<String, Object> params);

    ProjectVo getPageByProjectId(Integer id);

    void saveByFileId(FileTableEntity file);

    String addNewFile(ProjectContent projectContent);

    String addNewFileFolder(ProjectContent projectContent);

    String updateFileName(FileTableEntity fileTableEntity);

    String deleteFileFolder(FileTableEntity fileTableEntity);

    void deleteFileById(FileTableEntity fileTableEntity);

    void createFileByTemplate(ProjectTableEntity projectTableEntity);

    String createFileAndPackage(Integer projectId);
}

