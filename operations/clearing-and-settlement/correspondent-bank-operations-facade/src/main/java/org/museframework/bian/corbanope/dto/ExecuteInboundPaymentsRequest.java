package org.museframework.bian.corbanope.dto;

public class ExecuteInboundPaymentsRequest {
    private String correspondentbankoperationsid;

    private String inboundpaymentsid;

    private org.museframework.bian.corbanope.dto.bq.InboundPayments inboundPayments;

    public void setCorrespondentbankoperationsid(String correspondentbankoperationsid) {
        this.correspondentbankoperationsid = correspondentbankoperationsid;
    }

    public String getCorrespondentbankoperationsid() {
        return correspondentbankoperationsid;
    }

    public void setInboundpaymentsid(String inboundpaymentsid) {
        this.inboundpaymentsid = inboundpaymentsid;
    }

    public String getInboundpaymentsid() {
        return inboundpaymentsid;
    }

    public void setInboundPayments(org.museframework.bian.corbanope.dto.bq.InboundPayments inboundPayments) {
        this.inboundPayments = inboundPayments;
    }

    public org.museframework.bian.corbanope.dto.bq.InboundPayments getInboundPayments() {
        return inboundPayments;
    }
}