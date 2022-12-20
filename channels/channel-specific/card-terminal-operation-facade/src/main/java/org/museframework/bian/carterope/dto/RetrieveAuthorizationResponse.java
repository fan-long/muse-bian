package org.museframework.bian.carterope.dto;

public class RetrieveAuthorizationResponse {
    private org.museframework.bian.carterope.dto.bq.Authorization authorization;

    public void setAuthorization(org.museframework.bian.carterope.dto.bq.Authorization authorization) {
        this.authorization = authorization;
    }

    public org.museframework.bian.carterope.dto.bq.Authorization getAuthorization() {
        return authorization;
    }
}