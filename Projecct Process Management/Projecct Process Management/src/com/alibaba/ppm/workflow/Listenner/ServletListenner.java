package com.alibaba.ppm.workflow.Listenner;

import java.io.InputStream;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebListener;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.alibaba.ppm.process.entity.TemplateConfigBean;
import com.alibaba.ppm.process.mapper.TemplateConfigBeanMapperExt;

/**
 * Application Lifecycle Listener implementation class ServletListenner
 *
 */
@WebListener
public class ServletListenner implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public ServletListenner() {
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce)  { 
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  {
    	try {
			doinit(sce.getServletContext());
		} catch (Exception e) {
			e.printStackTrace();
		}
    	
    }
    public void doinit(ServletContext servletContext) throws Exception{
    	//读取配置文件
    	InputStream inputStream=Resources.getResourceAsStream("com/alibaba/ppm/common/config/mybatis-config.xml");
		SqlSessionFactory sessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
		servletContext.setAttribute("sessionFactory", sessionFactory);
    }
	
}
