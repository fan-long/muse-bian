package org.museframework.bian.itstaandgui.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class CaptureDevelopmentToolingandEnvironmentRequest {
    @MetaField
    private String itstandardsandguidelinesid;

    @MetaField
    private String developmenttoolingandenvironmentid;

    @MetaField(ref=true)
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