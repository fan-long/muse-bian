package org.museframework.bian.corbanope.dto;

public class RetrieveInboundPaymentsRequest {
    private String correspondentbankoperationsid;

    private String inboundpaymentsid;

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
}