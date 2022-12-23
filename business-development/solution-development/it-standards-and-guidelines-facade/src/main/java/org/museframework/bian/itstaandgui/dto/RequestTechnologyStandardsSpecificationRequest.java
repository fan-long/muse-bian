package org.museframework.bian.itstaandgui.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestTechnologyStandardsSpecificationRequest {
    @MetaField
    private String itstandardsandguidelinesid;

    @MetaField(ref=true)
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