package com.atguitu.gulimall.ideproject.ResponseVo;

import com.atguitu.gulimall.ideproject.entity.FileTableEntity;
import lombok.Data;

import java.util.List;
@Data
public class PathToFolder {
    FileTableEntity fileTableEntity;
    List<Integer> path;

    public PathToFolder(List<Integer> path, FileTableEntity fileTableEntity) {
    }
}
