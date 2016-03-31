package com.alibaba.ppm.home.module.dal.mapper;

import java.util.List;

import com.alibaba.ppm.home.module.dal.daoobject.ProjectBean;

public interface ProjectBeanMapperExt extends ProjectBeanMapper{
	List<ProjectBean> selectAllProject();
   
}