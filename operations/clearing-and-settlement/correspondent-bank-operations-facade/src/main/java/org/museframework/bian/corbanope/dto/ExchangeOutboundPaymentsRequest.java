package org.museframework.bian.corbanope.dto;

public class ExchangeOutboundPaymentsRequest {
    private String correspondentbankoperationsid;

    private String outboundpaymentsid;

    private org.museframework.bian.corbanope.dto.bq.OutboundPayments outboundPayments;

    public void setCorrespondentbankoperationsid(String correspondentbankoperationsid) {
        this.correspondentbankoperationsid = correspondentbankoperationsid;
    }

    public String getCorrespondentbankoperationsid() {
        return correspondentbankoperationsid;
    }

    public void setOutboundpaymentsid(String outboundpaymentsid) {
        this.outboundpaymentsid = outboundpaymentsid;
    }

    public String getOutboundpaymentsid() {
        return outboundpaymentsid;
    }

    public void setOutboundPayments(org.museframework.bian.corbanope.dto.bq.OutboundPayments outboundPayments) {
        this.outboundPayments = outboundPayments;
    }

    public org.museframework.bian.corbanope.dto.bq.OutboundPayments getOutboundPayments() {
        return outboundPayments;
    }
}