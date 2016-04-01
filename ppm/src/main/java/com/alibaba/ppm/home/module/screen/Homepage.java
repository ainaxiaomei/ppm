package com.alibaba.ppm.home.module.screen;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.citrus.turbine.Context;
import com.alibaba.ppm.home.module.dal.bo.ProjectBo;
import com.alibaba.ppm.home.module.dal.daoobject.ProjectBean;

public class Homepage {
	@Autowired
	private ProjectBo projectBo;
	 public void execute(Context context) throws Exception {
		 List<ProjectBean> projectList =projectBo.getAllProject();
	     context.put("projectList", projectList);
	    }
}
