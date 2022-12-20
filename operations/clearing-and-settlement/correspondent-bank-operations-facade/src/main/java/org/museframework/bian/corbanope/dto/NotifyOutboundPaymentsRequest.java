package org.museframework.bian.corbanope.dto;

public class NotifyOutboundPaymentsRequest {
    private String correspondentbankoperationsid;

    private String outboundpaymentsid;

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
}