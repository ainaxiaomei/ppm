package com.alibaba.ppm.workflow.node;

import java.lang.reflect.Method;

public class ChildNode implements Node {
	private String businessClass;
	private String method;
	private String pageUrl;
	private Node parent;
    
	public ChildNode(String businessClass, String method, String pageUrl) {
		super();
		this.businessClass = businessClass;
		this.method = method;
		this.pageUrl = pageUrl;
	}

	public String getBusinessClass() {
		return businessClass;
	}

	public void setBusinessClass(String businessClass) {
		this.businessClass = businessClass;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
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
