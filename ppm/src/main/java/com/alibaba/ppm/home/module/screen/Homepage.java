package com.alibaba.ppm.home.module.screen;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.citrus.turbine.Context;
import com.alibaba.ppm.home.module.dal.daoobject.ProjectBean;
import com.alibaba.ppm.home.module.dal.mapper.ProjectBeanMapper;
import com.alibaba.ppm.home.module.dal.mapper.ProjectBeanMapperExt;

public class Homepage {
	@Autowired
	private ProjectBeanMapperExt mapper;
	 public void execute(Context context) throws Exception {
	     List<ProjectBean> projectList=mapper.selectAllProject();
	     context.put("projectList", projectList);
	    }
}
