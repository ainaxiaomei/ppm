package com.alibaba.ppm.home.module.screen;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.alibaba.citrus.turbine.Context;
import com.alibaba.ppm.home.module.dal.daoobject.ProjectBean;
import com.alibaba.ppm.home.module.dal.mapper.ProjectBeanMapper;
import com.alibaba.ppm.home.module.dal.mapper.ProjectBeanMapperExt;

public class Homepage {
	 public void execute(Context context) throws Exception {
		 /**
		  * 没有加分页也没有结合spring的事务管理
		  */
		 InputStream ip =Resources.getResourceAsStream("/mybatis-config.xml");
	     SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(ip);
	     SqlSession session=factory.openSession();
	     ProjectBeanMapperExt mapper=session.getMapper(ProjectBeanMapperExt.class);
	     List<ProjectBean> projectList=mapper.selectAllProject();
	     context.put("projectList", projectList);
	    }
}
