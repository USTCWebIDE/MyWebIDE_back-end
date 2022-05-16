package com.atguitu.gulimall.ideproject.ResponseVo;

import com.atguitu.gulimall.ideproject.entity.FileTableEntity;
import lombok.Data;

import java.util.List;
@Data
public class ProjectContent {
   private  FileTableEntity fileColumn;
   private  List<ProjectContent> children;

    public ProjectContent(FileTableEntity fileColumn) {
        this.fileColumn = fileColumn;
    }

    public ProjectContent(FileTableEntity fileColumn, List<ProjectContent> children) {
        this.fileColumn = fileColumn;
        this.children = children;
    }
}
