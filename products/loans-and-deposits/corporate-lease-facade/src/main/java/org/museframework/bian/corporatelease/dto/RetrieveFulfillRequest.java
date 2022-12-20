package org.museframework.bian.corporatelease.dto;

public class RetrieveFulfillRequest {
    private String corporateleaseid;

    private String fulfillid;

    public void setCorporateleaseid(String corporateleaseid) {
        this.corporateleaseid = corporateleaseid;
    }

    public String getCorporateleaseid() {
        return corporateleaseid;
    }

    public void setFulfillid(String fulfillid) {
        this.fulfillid = fulfillid;
    }

    public String getFulfillid() {
        return fulfillid;
    }
}