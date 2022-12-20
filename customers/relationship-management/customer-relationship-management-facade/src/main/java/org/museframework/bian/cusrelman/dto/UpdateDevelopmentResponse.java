package org.museframework.bian.cusrelman.dto;

public class UpdateDevelopmentResponse {
    private org.museframework.bian.cusrelman.dto.bq.Development development;

    public void setDevelopment(org.museframework.bian.cusrelman.dto.bq.Development development) {
        this.development = development;
    }

    public org.museframework.bian.cusrelman.dto.bq.Development getDevelopment() {
        return development;
    }
}