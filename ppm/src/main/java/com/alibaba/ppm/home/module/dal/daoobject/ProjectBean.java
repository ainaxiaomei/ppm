package com.alibaba.ppm.home.module.dal.daoobject;

import java.util.Date;

public class ProjectBean {
    private Integer projectId;

    private String templateId;

    private String qa;

    private String projectType;

    private String pd;

    private String workTarget;

    private String productLine;

    private String technicalManager;

    private String projectManager;

    private Integer workLoad;

    private String relatedSystem;

    private String docUrl;

    private String aone;

    private String frd;

    private String projectName;

    private String creator;

    private String modifier;

    private String isDeleted;

    private String ext1;

    private String ext2;

    private String ext3;

    private String ext4;

    private String ext5;

    private Date kickoffTime;

    private Date publicationDate;

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId == null ? null : templateId.trim();
    }

    public String getQa() {
        return qa;
    }

    public void setQa(String qa) {
        this.qa = qa == null ? null : qa.trim();
    }

    public String getProjectType() {
        return projectType;
    }

    public void setProjectType(String projectType) {
        this.projectType = projectType == null ? null : projectType.trim();
    }

    public String getPd() {
        return pd;
    }

    public void setPd(String pd) {
        this.pd = pd == null ? null : pd.trim();
    }

    public String getWorkTarget() {
        return workTarget;
    }

    public void setWorkTarget(String workTarget) {
        this.workTarget = workTarget == null ? null : workTarget.trim();
    }

    public String getProductLine() {
        return productLine;
    }

    public void setProductLine(String productLine) {
        this.productLine = productLine == null ? null : productLine.trim();
    }

    public String getTechnicalManager() {
        return technicalManager;
    }

    public void setTechnicalManager(String technicalManager) {
        this.technicalManager = technicalManager == null ? null : technicalManager.trim();
    }

    public String getProjectManager() {
        return projectManager;
    }

    public void setProjectManager(String projectManager) {
        this.projectManager = projectManager == null ? null : projectManager.trim();
    }

    public Integer getWorkLoad() {
        return workLoad;
    }

    public void setWorkLoad(Integer workLoad) {
        this.workLoad = workLoad;
    }

    public String getRelatedSystem() {
        return relatedSystem;
    }

    public void setRelatedSystem(String relatedSystem) {
        this.relatedSystem = relatedSystem == null ? null : relatedSystem.trim();
    }

    public String getDocUrl() {
        return docUrl;
    }

    public void setDocUrl(String docUrl) {
        this.docUrl = docUrl == null ? null : docUrl.trim();
    }

    public String getAone() {
        return aone;
    }

    public void setAone(String aone) {
        this.aone = aone == null ? null : aone.trim();
    }

    public String getFrd() {
        return frd;
    }

    public void setFrd(String frd) {
        this.frd = frd == null ? null : frd.trim();
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName == null ? null : projectName.trim();
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier == null ? null : modifier.trim();
    }

    public String getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted == null ? null : isDeleted.trim();
    }

    public String getExt1() {
        return ext1;
    }

    public void setExt1(String ext1) {
        this.ext1 = ext1 == null ? null : ext1.trim();
    }

    public String getExt2() {
        return ext2;
    }

    public void setExt2(String ext2) {
        this.ext2 = ext2 == null ? null : ext2.trim();
    }

    public String getExt3() {
        return ext3;
    }

    public void setExt3(String ext3) {
        this.ext3 = ext3 == null ? null : ext3.trim();
    }

    public String getExt4() {
        return ext4;
    }

    public void setExt4(String ext4) {
        this.ext4 = ext4 == null ? null : ext4.trim();
    }

    public String getExt5() {
        return ext5;
    }

    public void setExt5(String ext5) {
        this.ext5 = ext5 == null ? null : ext5.trim();
    }

    public Date getKickoffTime() {
        return kickoffTime;
    }

    public void setKickoffTime(Date kickoffTime) {
        this.kickoffTime = kickoffTime;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }
}