package com.alibaba.ppm.workflow.node;

public class NodeKey implements Key {
	private String nodeId;
    private String tempId;
    
	public NodeKey(String nodeId, String tempId) {
		super();
		this.nodeId = nodeId;
		this.tempId = tempId;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

}
