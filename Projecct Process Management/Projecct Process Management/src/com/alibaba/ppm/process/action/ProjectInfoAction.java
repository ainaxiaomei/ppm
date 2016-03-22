package com.alibaba.ppm.process.action;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServlet;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.ppm.process.mapper.ProjectBeanMapperExt;

@Controller
public class ProjectInfoAction {
	@RequestMapping("/projectInfo")
	public String getAllProjectS(Model model,ServletRequest request){
		//查询所有的项目信息
		SqlSessionFactory sessionFactory=(SqlSessionFactory) request.getAttribute("sessionFactory");
		SqlSession session=sessionFactory.openSession();
		ProjectBeanMapperExt projectMapper=session.getMapper(ProjectBeanMapperExt.class);
		return "projectInfo";
	}
}
