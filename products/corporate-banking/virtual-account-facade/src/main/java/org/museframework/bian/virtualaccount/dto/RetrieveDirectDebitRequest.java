package org.museframework.bian.virtualaccount.dto;

public class RetrieveDirectDebitRequest {
    private String virtualaccountid;

    private String directdebitid;

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
}