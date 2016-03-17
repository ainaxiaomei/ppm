package com.alibaba.ppm.workflow;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * 节点模板核心过滤器主要功能
 * 1.拦截所有模板请求，一个模板提交后自动转到下一个模板
 * 2.调用表单处理类，处理表单
 */
public class TemplateFilter implements Filter {
    public TemplateFilter() {
    }

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

		chain.doFilter(request, response);
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
