package com.alibaba.ppm.process.mapper;

import com.alibaba.ppm.process.entity.TemplateConfigBean;

public interface TemplateConfigBeanMapper {
    int deleteByPrimaryKey(Integer configId);

    int insert(TemplateConfigBean record);

    int insertSelective(TemplateConfigBean record);

    TemplateConfigBean selectByPrimaryKey(Integer configId);

    int updateByPrimaryKeySelective(TemplateConfigBean record);

    int updateByPrimaryKey(TemplateConfigBean record);
}