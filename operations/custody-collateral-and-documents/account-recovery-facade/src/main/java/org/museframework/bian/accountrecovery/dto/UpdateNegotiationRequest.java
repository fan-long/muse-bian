package org.museframework.bian.accountrecovery.dto;

public class UpdateNegotiationRequest {
    private String accountrecoveryid;

    private String negotiationid;

    private org.museframework.bian.accountrecovery.dto.bq.Negotiation negotiation;

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

    public void setNegotiation(org.museframework.bian.accountrecovery.dto.bq.Negotiation negotiation) {
        this.negotiation = negotiation;
    }

    public org.museframework.bian.accountrecovery.dto.bq.Negotiation getNegotiation() {
        return negotiation;
    }
}