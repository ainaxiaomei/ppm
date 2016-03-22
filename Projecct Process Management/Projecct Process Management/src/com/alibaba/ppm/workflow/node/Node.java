package com.alibaba.ppm.workflow.node;

public interface Node {
	public String getPageUrl();
	public boolean isParent();
	public boolean isDone();
	public String getClassName();
	public String getMethodName();
	}
