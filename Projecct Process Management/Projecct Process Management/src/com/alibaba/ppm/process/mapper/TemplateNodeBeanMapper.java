package com.alibaba.ppm.process.mapper;

import com.alibaba.ppm.process.entity.TemplateNodeBean;
import com.alibaba.ppm.process.entity.TemplateNodeBeanKey;

public interface TemplateNodeBeanMapper {
    int deleteByPrimaryKey(TemplateNodeBeanKey key);

    int insert(TemplateNodeBean record);

    int insertSelective(TemplateNodeBean record);

    TemplateNodeBean selectByPrimaryKey(TemplateNodeBeanKey key);

    int updateByPrimaryKeySelective(TemplateNodeBean record);

    int updateByPrimaryKey(TemplateNodeBean record);
}