package com.alibaba.ppm.home.module.dal.bo.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.ppm.home.module.dal.bo.ProjectBo;
import com.alibaba.ppm.home.module.dal.daoobject.ProjectBean;
import com.alibaba.ppm.home.module.dal.mapper.ProjectBeanMapperExt;

public class ProjectBoImpl implements ProjectBo {
	@Autowired
	private ProjectBeanMapperExt projectBeanMapper;
	@Override
	public List<ProjectBean> getAllProject() {
		 List<ProjectBean> projectList=projectBeanMapper.selectAllProject();
		 return projectList;
	}
}
