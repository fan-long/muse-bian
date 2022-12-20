package org.museframework.bian.itstaandgui.dto;

public class RequestITPoliciesandGuidelinesRequest {
    private String itstandardsandguidelinesid;

    private String itpoliciesandguidelinesid;

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