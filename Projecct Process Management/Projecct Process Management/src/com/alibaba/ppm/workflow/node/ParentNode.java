package com.alibaba.ppm.workflow.node;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class ParentNode implements Node {
    private Node nextNode=null;
    private List<Node> childNodes =new ArrayList<Node>();
    private String businessClass;
    private String method;
    private String pageUrl;
    private Node preNode=null;

	public ParentNode( String businessClass, String method, String pageUrl) {
		super();
		this.businessClass = businessClass;
		this.method = method;
		this.pageUrl = pageUrl;
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

	public void setNextNode(ParentNode nextNode) {
		this.nextNode = nextNode;
		nextNode.setPreNode(this);
	}

	public List<Node> getChildNodes() {
		return childNodes;
	}

	public void setChildNodes(List<Node> childNodes) {
		this.childNodes = childNodes;
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
    public void addChild(ChildNode childNode){
    	this.childNodes.add(childNode);
    	childNode.setParent(this);
    }
	
}
