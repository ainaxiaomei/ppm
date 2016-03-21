package com.alibaba.ppm.process.mapper;

import java.util.List;

import com.alibaba.ppm.process.entity.TemplateNodeBean;
import com.alibaba.ppm.process.entity.TemplateNodeBeanKey;

public interface TemplateNodeBeanMapperExt extends TemplateNodeBeanMapper {
	public List<TemplateNodeBean> getNodesByTemplateId(int tempId);
}