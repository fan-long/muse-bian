package org.museframework.bian.enterprisearchitecture.dto;

public class RequestBusinessArchitectureResponse {
    private org.museframework.bian.enterprisearchitecture.dto.bq.BusinessArchitecture businessArchitecture;

    public void setBusinessArchitecture(org.museframework.bian.enterprisearchitecture.dto.bq.BusinessArchitecture businessArchitecture) {
        this.businessArchitecture = businessArchitecture;
    }

    public org.museframework.bian.enterprisearchitecture.dto.bq.BusinessArchitecture getBusinessArchitecture() {
        return businessArchitecture;
    }
}