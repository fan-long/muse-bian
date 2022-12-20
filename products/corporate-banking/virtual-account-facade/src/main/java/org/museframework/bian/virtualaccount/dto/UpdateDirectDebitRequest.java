package org.museframework.bian.virtualaccount.dto;

public class UpdateDirectDebitRequest {
    private String virtualaccountid;

    private String directdebitid;

    private org.museframework.bian.virtualaccount.dto.bq.DirectDebit directDebit;

    public void setVirtualaccountid(String virtualaccountid) {
        this.virtualaccountid = virtualaccountid;
    }

    public String getVirtualaccountid() {
        return virtualaccountid;
    }

    public void setDirectdebitid(String directdebitid) {
        this.directdebitid = directdebitid;
    }

    public String getDirectdebitid() {
        return directdebitid;
    }

    public void setDirectDebit(org.museframework.bian.virtualaccount.dto.bq.DirectDebit directDebit) {
        this.directDebit = directDebit;
    }

    public org.museframework.bian.virtualaccount.dto.bq.DirectDebit getDirectDebit() {
        return directDebit;
    }
}