package com.alibaba.ppm.workflow.node;

import java.util.ArrayList;
import java.util.List;

public class ParentNode implements Node {
    private Node nextNode=null;
    private List<Node> childNodes =new ArrayList<Node>();
    private String businessClass;
    private String methodName;
    private String pageUrl;
    private Node preNode=null;

	public ParentNode( String businessClass, String method, String pageUrl) {
		super();
		this.businessClass = businessClass;
		this.methodName = method;
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


	public void setBusinessClass(String businessClass) {
		this.businessClass = businessClass;
	}

	public void setMethod(String method) {
		this.methodName = method;
	}

	@Override
	public String getPageUrl() {
		return this.pageUrl;
	}

	@Override
	public boolean isParent() {
		return true;
	}

	@Override
	public boolean isDone() {
		return false;
	}
    public void addChild(ChildNode childNode){
    	this.childNodes.add(childNode);
    	childNode.setParent(this);
    }

	@Override
	public String getClassName() {
		return this.businessClass;
	}

	@Override
	public String getMethodName() {
		return this.methodName;
	}
	
}
