package com.alibaba.ppm.workflow;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import com.alibaba.ppm.process.entity.TemplateConfigBean;
import com.alibaba.ppm.process.entity.TemplateNodeBean;
import com.alibaba.ppm.process.entity.TemplateNodeBeanKey;
import com.alibaba.ppm.process.mapper.TemplateConfigBeanMapperExt;
import com.alibaba.ppm.process.mapper.TemplateNodeBeanMapperExt;



/**
 * 节点模板核心过滤器主要功能
 * 1.拦截所有模板请求，一个模板提交后自动转到下一个模板
 * 2.调用表单处理类，处理表单
 */
public class TemplateFilter implements Filter {
	private static final Log log = LogFactory.getLog(TemplateFilter.class);
	private String templateIdName;
	private String nodeIdName;

	public void destroy() {
		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		/**
		 * 1.获取templateId
		 * 2.获取nodeId
		 * 3.业务处理流程控制
		 */
		String tempId="";
		String nodeId="";
		//获取当前页面的tempId和nodeId
		tempId = getTemplateIdFromRquest(request);
		nodeId = getNodeIdFromRequest(request);
		if("".equals(tempId)||tempId==null){
			//没有templateId,读取配置文件获取templateId并跳转到该模板的第一个节点
			InputStream inputStream=Resources.getResourceAsStream("com/alibaba/ppm/common/config/mybatis-config.xml");
			SqlSession session=new SqlSessionFactoryBuilder().build(inputStream).openSession();
			TemplateConfigBeanMapperExt tempConfigMapper=session.getMapper(TemplateConfigBeanMapperExt.class);
			List<TemplateConfigBean> tempConfigBeanList=tempConfigMapper.selectAll();
			if(tempConfigBeanList==null||tempConfigBeanList.size()<=0){
				throw new ServletException("No Template Configuration Found!");
			}
			//此配置只应该有一条记录
			int tempalteId=tempConfigBeanList.get(0).getTemplateId();
			int startNode=tempConfigBeanList.get(0).getStartNode();
			if(tempalteId<=0||startNode<=0){
				throw new ServletException("Config Error!");
			}
			//查找起始节点对应的页面
			TemplateNodeBeanMapperExt tempNodeMapper=session.getMapper(TemplateNodeBeanMapperExt.class);
			TemplateNodeBean nodeBean=tempNodeMapper.selectByPrimaryKey(new TemplateNodeBeanKey(tempalteId,startNode) {
			});
			if(nodeBean==null||nodeBean.getPagrUrl()==null||"".equals(nodeBean.getPagrUrl())){
				throw new ServletException("Config Error!");
			}
			String url= nodeBean.getPagrUrl();
			request.getRequestDispatcher(url).forward(request, response);
			
			
		}else{
			if("".equals(nodeId)||nodeId==null){
				//nodeId为空有异常
				log.debug("node id is null");
				throw new ServletException("Template Node  Is Missing");
			}else{
				//调用node配置的业务处理类
				//获取node的业务处理类
				InputStream inputStream=Resources.getResourceAsStream("com/alibaba/ppm/common/config/mybatis-config.xml");
				SqlSession session=new SqlSessionFactoryBuilder().build(inputStream).openSession();
				TemplateNodeBeanMapperExt tempNodeMapper=session.getMapper(TemplateNodeBeanMapperExt.class);
				TemplateNodeBean nodeBean=tempNodeMapper.selectByPrimaryKey(new TemplateNodeBeanKey(Integer.valueOf(tempId),Integer.valueOf(nodeId)) {
				});
				if(nodeBean==null||nodeBean.getClassName()==null||"".equals(nodeBean.getClassName())){
					throw new ServletException("Config Error!");
				}
				String calssName=nodeBean.getClassName();
				String methodName=nodeBean.getMethodName();
				try {
					Method method=Class.forName(calssName).getMethod(methodName, HttpServletRequest.class,HttpServletResponse.class);
					method.invoke(Class.forName(calssName).newInstance(), request,response);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				catch (NoSuchMethodException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SecurityException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InstantiationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//调用下一个节点的页面
				int nextNodeId=nodeBean.getNextNode();
				TemplateNodeBean nextNodeBean=tempNodeMapper.selectByPrimaryKey(new TemplateNodeBeanKey(Integer.valueOf(tempId),Integer.valueOf(nextNodeId)) {
				});
				if(nextNodeBean==null||nextNodeBean.getClassName()==null||"".equals(nextNodeBean.getClassName())){
					throw new ServletException("Config Error!");
				}
				String url= nextNodeBean.getPagrUrl();
				request.getRequestDispatcher(url).forward(request, response);
			}
		}
	}

	private String getNodeIdFromRequest(ServletRequest request) {
		String nodeId;
		if("".equals(this.nodeIdName)&&nodeIdName!=null){
			nodeId=request.getParameter(nodeIdName);
		}else{
			nodeId=request.getParameter("nodeId");
		}
		return nodeId;
	}

	private String getTemplateIdFromRquest(ServletRequest request) {
		String tempId;
		if("".equals(this.templateIdName)&&templateIdName!=null){
			tempId=request.getParameter(templateIdName);
		}else{
			tempId=request.getParameter("templateId");
		}
		return tempId;
	}

	public void init(FilterConfig fConfig) throws ServletException {
		//获取配置参数，即templateId和nodeId的名称
		this.templateIdName=fConfig.getInitParameter("templateIdName");
		this.nodeIdName=fConfig.getInitParameter("nodeIdName");
	}

}
