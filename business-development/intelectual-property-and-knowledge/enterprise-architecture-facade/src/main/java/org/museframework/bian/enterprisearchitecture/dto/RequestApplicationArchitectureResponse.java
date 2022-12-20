package org.museframework.bian.enterprisearchitecture.dto;

public class RequestApplicationArchitectureResponse {
    private org.museframework.bian.enterprisearchitecture.dto.bq.ApplicationArchitecture applicationArchitecture;

    public void setApplicationArchitecture(org.museframework.bian.enterprisearchitecture.dto.bq.ApplicationArchitecture applicationArchitecture) {
        this.applicationArchitecture = applicationArchitecture;
    }

    public org.museframework.bian.enterprisearchitecture.dto.bq.ApplicationArchitecture getApplicationArchitecture() {
        return applicationArchitecture;
    }
}