package com.alibaba.ppm.home.module.dal.mapper;

import java.util.List;

import javax.annotation.Resource;

import com.alibaba.ppm.home.module.dal.daoobject.ProjectBean;
@Resource
public interface ProjectBeanMapperExt extends ProjectBeanMapper{
	List<ProjectBean> selectAllProject();
   
}