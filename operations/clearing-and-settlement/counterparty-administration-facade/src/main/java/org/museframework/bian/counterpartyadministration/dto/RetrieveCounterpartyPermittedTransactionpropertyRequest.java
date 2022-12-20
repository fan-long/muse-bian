package org.museframework.bian.counterpartyadministration.dto;

public class RetrieveCounterpartyPermittedTransactionpropertyRequest {
    private String counterpartyadministrationid;

    private String counterpartypermittedtransactionpropertyid;

    public void setCounterpartyadministrationid(String counterpartyadministrationid) {
        this.counterpartyadministrationid = counterpartyadministrationid;
    }

    public String getCounterpartyadministrationid() {
        return counterpartyadministrationid;
    }

    public void setCounterpartypermittedtransactionpropertyid(String counterpartypermittedtransactionpropertyid) {
        this.counterpartypermittedtransactionpropertyid = counterpartypermittedtransactionpropertyid;
    }

    public String getCounterpartypermittedtransactionpropertyid() {
        return counterpartypermittedtransactionpropertyid;
    }
}