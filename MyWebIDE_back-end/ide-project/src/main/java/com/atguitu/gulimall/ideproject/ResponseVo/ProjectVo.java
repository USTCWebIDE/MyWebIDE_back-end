package com.atguitu.gulimall.ideproject.ResponseVo;

import com.atguitu.gulimall.ideproject.entity.FileTableEntity;
import lombok.Data;

import java.util.List;

@Data
public class ProjectVo {
    private List<ProjectContent> children;
    private Integer project_id;
}
