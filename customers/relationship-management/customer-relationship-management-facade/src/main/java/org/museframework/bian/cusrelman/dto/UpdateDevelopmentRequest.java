package org.museframework.bian.cusrelman.dto;

public class UpdateDevelopmentRequest {
    private String customerrelationshipmanagementid;

    private String developmentid;

    private org.museframework.bian.cusrelman.dto.bq.Development development;

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

    public void setDevelopment(org.museframework.bian.cusrelman.dto.bq.Development development) {
        this.development = development;
    }

    public org.museframework.bian.cusrelman.dto.bq.Development getDevelopment() {
        return development;
    }
}