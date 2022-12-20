package org.museframework.bian.itstaandgui.dto;

public class UpdateDevelopmentToolingandEnvironmentRequest {
    private String itstandardsandguidelinesid;

    private String developmenttoolingandenvironmentid;

    private org.museframework.bian.itstaandgui.dto.bq.DevelopmentToolingandEnvironment developmentToolingandEnvironment;

    public void setItstandardsandguidelinesid(String itstandardsandguidelinesid) {
        this.itstandardsandguidelinesid = itstandardsandguidelinesid;
    }

    public String getItstandardsandguidelinesid() {
        return itstandardsandguidelinesid;
    }

    public void setDevelopmenttoolingandenvironmentid(String developmenttoolingandenvironmentid) {
        this.developmenttoolingandenvironmentid = developmenttoolingandenvironmentid;
    }

    public String getDevelopmenttoolingandenvironmentid() {
        return developmenttoolingandenvironmentid;
    }

    public void setDevelopmentToolingandEnvironment(org.museframework.bian.itstaandgui.dto.bq.DevelopmentToolingandEnvironment developmentToolingandEnvironment) {
        this.developmentToolingandEnvironment = developmentToolingandEnvironment;
    }

    public org.museframework.bian.itstaandgui.dto.bq.DevelopmentToolingandEnvironment getDevelopmentToolingandEnvironment() {
        return developmentToolingandEnvironment;
    }
}