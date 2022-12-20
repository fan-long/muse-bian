package org.museframework.bian.rewpoiacc.dto;

public class UpdateExpirationResponse {
    private org.museframework.bian.rewpoiacc.dto.bq.Expiration expiration;

    public void setExpiration(org.museframework.bian.rewpoiacc.dto.bq.Expiration expiration) {
        this.expiration = expiration;
    }

    public org.museframework.bian.rewpoiacc.dto.bq.Expiration getExpiration() {
        return expiration;
    }
}