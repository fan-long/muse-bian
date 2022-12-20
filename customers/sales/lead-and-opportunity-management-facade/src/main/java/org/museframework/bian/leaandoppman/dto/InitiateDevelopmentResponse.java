package org.museframework.bian.leaandoppman.dto;

public class InitiateDevelopmentResponse {
    private org.museframework.bian.leaandoppman.dto.bq.Development development;

    public void setDevelopment(org.museframework.bian.leaandoppman.dto.bq.Development development) {
        this.development = development;
    }

    public org.museframework.bian.leaandoppman.dto.bq.Development getDevelopment() {
        return development;
    }
}