package com.alibaba.ppm.home.module.dal.mapper;

import com.alibaba.ppm.home.module.dal.daoobject.ProjectBean;

public interface ProjectBeanMapper {
    int deleteByPrimaryKey(Integer projectId);

    int insert(ProjectBean record);

    int insertSelective(ProjectBean record);

    ProjectBean selectByPrimaryKey(Integer projectId);

    int updateByPrimaryKeySelective(ProjectBean record);

    int updateByPrimaryKey(ProjectBean record);
}