package org.museframework.bian.itstaandgui.dto;

public class CaptureTechnologyStandardsSpecificationRequest {
    private String itstandardsandguidelinesid;

    private org.museframework.bian.itstaandgui.dto.cr.TechnologyStandardsSpecification technologyStandardsSpecification;

    public void setItstandardsandguidelinesid(String itstandardsandguidelinesid) {
        this.itstandardsandguidelinesid = itstandardsandguidelinesid;
    }

    public String getItstandardsandguidelinesid() {
        return itstandardsandguidelinesid;
    }

    public void setTechnologyStandardsSpecification(org.museframework.bian.itstaandgui.dto.cr.TechnologyStandardsSpecification technologyStandardsSpecification) {
        this.technologyStandardsSpecification = technologyStandardsSpecification;
    }

    public org.museframework.bian.itstaandgui.dto.cr.TechnologyStandardsSpecification getTechnologyStandardsSpecification() {
        return technologyStandardsSpecification;
    }
}