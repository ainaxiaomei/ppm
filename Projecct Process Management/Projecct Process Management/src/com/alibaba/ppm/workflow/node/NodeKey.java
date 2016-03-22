package com.alibaba.ppm.workflow.node;

public class NodeKey implements Key {
	private int nodeId;
    private int tempId;
    
	public NodeKey(int nodeId, int tempId) {
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
