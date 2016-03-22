package com.alibaba.ppm.workflow.node;

import java.lang.reflect.Method;
import java.util.List;

public class ParentNode implements Node {
    private Node nextNode;
    private List<Node> childNodes;
    private Class<?> businessClass;
    private Method method;
    private String pageUrl;
    private Node preNode;

	public ParentNode(Node nextNode, List<Node> childNodes, Class<?> businessClass, Method method, String pageUrl,
			Node preNode) {
		super();
		this.nextNode = nextNode;
		this.childNodes = childNodes;
		this.businessClass = businessClass;
		this.method = method;
		this.pageUrl = pageUrl;
		this.preNode = preNode;
	}
	
	public Node getPreNode() {
		return preNode;
	}

	public void setPreNode(Node preNode) {
		this.preNode = preNode;
	}

	public Node getNextNode() {
		return nextNode;
	}

	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}

	public List<Node> getChildNodes() {
		return childNodes;
	}

	public void setChildNodes(List<Node> childNodes) {
		this.childNodes = childNodes;
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

	@Override
	public String getpageUrl() {
		return this.pageUrl;
	}

	@Override
	public boolean isParent() {
		return true;
	}

	@Override
	public int isDone() {
		// TODO Auto-generated method stub
		return 0;
	}
    public void addChild(Node childNode){
    	this.childNodes.add(childNode);
    }
	
}
