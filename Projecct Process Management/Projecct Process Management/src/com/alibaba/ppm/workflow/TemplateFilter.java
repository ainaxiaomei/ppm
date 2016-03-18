package com.alibaba.ppm.workflow;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;



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
		tempId = getTemplateIdFromRquest(request);
		if("".equals(tempId)&&tempId!=null){
			//没有templateId,读取配置文件获取templateId并跳转到该模板的第一个节点
		}else{
			//获取当前页面的nodeId
			String nodeId="";
			nodeId = getNodeIdFromRequest(request);
			if("".equals(nodeId)||nodeId==null){
				//nodeId为空有异常
				log.debug("node id is null");
				throw new ServletException("node id is null");
			}else{
				//调用node配置的业务处理类
				
				//调用流程控制到一个节点
			}
		}
		chain.doFilter(request, response);
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
