package org.museframework.bian.carterope.dto;

public class RequestAuthorizationResponse {
    private org.museframework.bian.carterope.dto.bq.Authorization authorization;

    public void setAuthorization(org.museframework.bian.carterope.dto.bq.Authorization authorization) {
        this.authorization = authorization;
    }

    public org.museframework.bian.carterope.dto.bq.Authorization getAuthorization() {
        return authorization;
    }
}