package com.alibaba.ppm.process.mapper;

import com.alibaba.ppm.process.entity.TemplateConfigBean;
import com.alibaba.ppm.process.entity.TemplateConfigBeanKey;

public interface TemplateConfigBeanMapper {
    int deleteByPrimaryKey(TemplateConfigBeanKey key);

    int insert(TemplateConfigBean record);

    int insertSelective(TemplateConfigBean record);

    TemplateConfigBean selectByPrimaryKey(TemplateConfigBeanKey key);

    int updateByPrimaryKeySelective(TemplateConfigBean record);

    int updateByPrimaryKey(TemplateConfigBean record);
}