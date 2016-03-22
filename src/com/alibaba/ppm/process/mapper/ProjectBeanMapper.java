package com.alibaba.ppm.process.mapper;

import com.alibaba.ppm.process.entity.ProjectBean;

public interface ProjectBeanMapper {
    int deleteByPrimaryKey(Integer projectId);

    int insert(ProjectBean record);

    int insertSelective(ProjectBean record);

    ProjectBean selectByPrimaryKey(Integer projectId);

    int updateByPrimaryKeySelective(ProjectBean record);

    int updateByPrimaryKey(ProjectBean record);
}