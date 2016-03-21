package com.alibaba.ppm.workflow.node;

public interface Node {
	public String getpageUrl();
	public int isParent();
	public int isDone();
	public int isDelay();
}
