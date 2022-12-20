package org.museframework.bian.corporatelease.dto;

public class ExecuteFulfillRequest {
    private String corporateleaseid;

    private String fulfillid;

    private org.museframework.bian.corporatelease.dto.bq.Fulfill fulfill;

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

    public void setFulfill(org.museframework.bian.corporatelease.dto.bq.Fulfill fulfill) {
        this.fulfill = fulfill;
    }

    public org.museframework.bian.corporatelease.dto.bq.Fulfill getFulfill() {
        return fulfill;
    }
}