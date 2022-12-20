package org.museframework.bian.cusrelman.dto;

public class RetrieveDevelopmentRequest {
    private String customerrelationshipmanagementid;

    private String developmentid;

    public void setCustomerrelationshipmanagementid(String customerrelationshipmanagementid) {
        this.customerrelationshipmanagementid = customerrelationshipmanagementid;
    }

    public String getCustomerrelationshipmanagementid() {
        return customerrelationshipmanagementid;
    }

    public void setDevelopmentid(String developmentid) {
        this.developmentid = developmentid;
    }

    public String getDevelopmentid() {
        return developmentid;
    }
}