package org.museframework.bian.itstaandgui.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveITPoliciesandGuidelinesRequest {
    @MetaField
    private String itstandardsandguidelinesid;

    @MetaField
    private String itpoliciesandguidelinesid;

    public void setItstandardsandguidelinesid(String itstandardsandguidelinesid) {
        this.itstandardsandguidelinesid = itstandardsandguidelinesid;
    }

    public String getItstandardsandguidelinesid() {
        return itstandardsandguidelinesid;
    }

    public void setItpoliciesandguidelinesid(String itpoliciesandguidelinesid) {
        this.itpoliciesandguidelinesid = itpoliciesandguidelinesid;
    }

    public String getItpoliciesandguidelinesid() {
        return itpoliciesandguidelinesid;
    }
}