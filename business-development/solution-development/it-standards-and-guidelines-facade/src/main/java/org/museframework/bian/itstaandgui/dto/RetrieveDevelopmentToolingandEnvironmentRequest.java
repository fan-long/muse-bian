package org.museframework.bian.itstaandgui.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveDevelopmentToolingandEnvironmentRequest {
    @MetaField
    private String itstandardsandguidelinesid;

    @MetaField
    private String developmenttoolingandenvironmentid;

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
}