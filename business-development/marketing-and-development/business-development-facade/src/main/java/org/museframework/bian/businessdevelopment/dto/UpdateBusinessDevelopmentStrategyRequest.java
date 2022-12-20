package org.museframework.bian.businessdevelopment.dto;

public class UpdateBusinessDevelopmentStrategyRequest {
    private String businessdevelopmentid;

    private org.museframework.bian.businessdevelopment.dto.cr.BusinessDevelopmentStrategy businessDevelopmentStrategy;

    public void setBusinessdevelopmentid(String businessdevelopmentid) {
        this.businessdevelopmentid = businessdevelopmentid;
    }

    public String getBusinessdevelopmentid() {
        return businessdevelopmentid;
    }

    public void setBusinessDevelopmentStrategy(org.museframework.bian.businessdevelopment.dto.cr.BusinessDevelopmentStrategy businessDevelopmentStrategy) {
        this.businessDevelopmentStrategy = businessDevelopmentStrategy;
    }

    public org.museframework.bian.businessdevelopment.dto.cr.BusinessDevelopmentStrategy getBusinessDevelopmentStrategy() {
        return businessDevelopmentStrategy;
    }
}