package com.alibaba.ppm.process.mapper;

import java.util.List;

import com.alibaba.ppm.process.entity.TemplateConfigBean;

public interface TemplateConfigBeanMapperExt extends TemplateConfigBeanMapper {
	List<TemplateConfigBean> selectAll();
}
