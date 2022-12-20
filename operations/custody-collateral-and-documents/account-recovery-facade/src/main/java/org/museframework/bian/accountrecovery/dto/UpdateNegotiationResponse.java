package org.museframework.bian.accountrecovery.dto;

public class UpdateNegotiationResponse {
    private org.museframework.bian.accountrecovery.dto.bq.Negotiation negotiation;

    public void setNegotiation(org.museframework.bian.accountrecovery.dto.bq.Negotiation negotiation) {
        this.negotiation = negotiation;
    }

    public org.museframework.bian.accountrecovery.dto.bq.Negotiation getNegotiation() {
        return negotiation;
    }
}