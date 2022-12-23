package org.museframework.bian.itstaandgui.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class CaptureITPoliciesandGuidelinesRequest {
    @MetaField
    private String itstandardsandguidelinesid;

    @MetaField
    private String itpoliciesandguidelinesid;

    @MetaField(ref=true)
    private org.museframework.bian.itstaandgui.dto.bq.ITPoliciesandGuidelines iTPoliciesandGuidelines;

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

    public void setiTPoliciesandGuidelines(org.museframework.bian.itstaandgui.dto.bq.ITPoliciesandGuidelines iTPoliciesandGuidelines) {
        this.iTPoliciesandGuidelines = iTPoliciesandGuidelines;
    }

    public org.museframework.bian.itstaandgui.dto.bq.ITPoliciesandGuidelines getiTPoliciesandGuidelines() {
        return iTPoliciesandGuidelines;
    }
}