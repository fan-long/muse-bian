package org.museframework.bian.accountrecovery.dto;

public class RetrieveNegotiationRequest {
    private String accountrecoveryid;

    private String negotiationid;

    public void setAccountrecoveryid(String accountrecoveryid) {
        this.accountrecoveryid = accountrecoveryid;
    }

    public String getAccountrecoveryid() {
        return accountrecoveryid;
    }

    public void setNegotiationid(String negotiationid) {
        this.negotiationid = negotiationid;
    }

    public String getNegotiationid() {
        return negotiationid;
    }
}