package com.alibaba.ppm.workflow.node;

import java.lang.reflect.Method;

public class ChildNode implements Node {
	private Class<?> businessClass;
	private Method method;
	private String pageUrl;
	private Node parent;
    
	public ChildNode(Class<?> businessClass, Method method, String pageUrl, Node parent) {
		super();
		this.businessClass = businessClass;
		this.method = method;
		this.pageUrl = pageUrl;
		this.parent = parent;
	}

	public Class<?> getBusinessClass() {
		return businessClass;
	}

	public void setBusinessClass(Class<?> businessClass) {
		this.businessClass = businessClass;
	}

	public Method getMethod() {
		return method;
	}

	public void setMethod(Method method) {
		this.method = method;
	}
	public void setPageUrl(String pageUrl) {
		this.pageUrl = pageUrl;
	}

	public Node getParent() {
		return parent;
	}

	public void setParent(Node parent) {
		this.parent = parent;
	}

	@Override
	public String getpageUrl() {
		return this.pageUrl;
	}

	@Override
	public boolean isParent() {
		return false;
	}

	@Override
	public int isDone() {
		// TODO Auto-generated method stub
		return 0;
	}



}
