package com.alibaba.ppm.workflow.node;

import java.lang.reflect.Method;

public class ChildNode implements Node {
	private String businessClass;
	private String methodName;
	private String pageUrl;
	private Node parent;
	private boolean Done=false;
    
	public ChildNode(String businessClass, String method, String pageUrl) {
		super();
		this.businessClass = businessClass;
		this.methodName = method;
		this.pageUrl = pageUrl;
	}

	public String getBusinessClass() {
		return businessClass;
	}

	public void setMethod(String method) {
		this.methodName = method;
	}
	public void setPageUrl(String pageUrl) {
		this.pageUrl = pageUrl;
	}


	public void setParent(Node parent) {
		this.parent = parent;
	}

	@Override
	public String getPageUrl() {
		return this.pageUrl;
	}

	@Override
	public boolean isParent() {
		return false;
	}

	@Override
	public boolean isDone() {
		return Done;
	}

	public void setDone(boolean done) {
		Done = done;
	}

	@Override
	public String getClassName() {
		return this.businessClass;
	}

	@Override
	public String getMethodName() {
		// TODO Auto-generated method stub
		return this.methodName;
	}



}
