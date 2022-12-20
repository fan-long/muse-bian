package org.museframework.bian.businessdevelopment.dto;

public class CaptureInitiativeRequest {
    private String businessdevelopmentid;

    private String initiativeid;

    private org.museframework.bian.businessdevelopment.dto.bq.Initiative initiative;

    public void setBusinessdevelopmentid(String businessdevelopmentid) {
        this.businessdevelopmentid = businessdevelopmentid;
    }

    public String getBusinessdevelopmentid() {
        return businessdevelopmentid;
    }

    public void setInitiativeid(String initiativeid) {
        this.initiativeid = initiativeid;
    }

    public String getInitiativeid() {
        return initiativeid;
    }

    public void setInitiative(org.museframework.bian.businessdevelopment.dto.bq.Initiative initiative) {
        this.initiative = initiative;
    }

    public org.museframework.bian.businessdevelopment.dto.bq.Initiative getInitiative() {
        return initiative;
    }
}