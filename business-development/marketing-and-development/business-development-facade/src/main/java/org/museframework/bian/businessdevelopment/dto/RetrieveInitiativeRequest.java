package org.museframework.bian.businessdevelopment.dto;

public class RetrieveInitiativeRequest {
    private String businessdevelopmentid;

    private String initiativeid;

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
}