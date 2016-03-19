package com.alibaba.ppm.process.entity;

public class TemplateNodeBeanKey {
    public TemplateNodeBeanKey(Integer templateId, Integer nodeId) {
		super();
		this.templateId = templateId;
		this.nodeId = nodeId;
	}
    
	public TemplateNodeBeanKey() {
	}

	private Integer templateId;

    private Integer nodeId;

    public Integer getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Integer templateId) {
        this.templateId = templateId;
    }

    public Integer getNodeId() {
        return nodeId;
    }

    public void setNodeId(Integer nodeId) {
        this.nodeId = nodeId;
    }
}