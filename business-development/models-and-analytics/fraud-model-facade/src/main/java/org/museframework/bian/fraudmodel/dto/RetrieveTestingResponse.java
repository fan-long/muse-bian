package org.museframework.bian.fraudmodel.dto;

public class RetrieveTestingResponse {
    private org.museframework.bian.fraudmodel.dto.bq.Testing testing;

    public void setTesting(org.museframework.bian.fraudmodel.dto.bq.Testing testing) {
        this.testing = testing;
    }

    public org.museframework.bian.fraudmodel.dto.bq.Testing getTesting() {
        return testing;
    }
}