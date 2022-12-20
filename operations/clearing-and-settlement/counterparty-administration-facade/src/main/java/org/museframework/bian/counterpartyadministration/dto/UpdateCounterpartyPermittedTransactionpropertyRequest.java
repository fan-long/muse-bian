package org.museframework.bian.counterpartyadministration.dto;

public class UpdateCounterpartyPermittedTransactionpropertyRequest {
    private String counterpartyadministrationid;

    private String counterpartypermittedtransactionpropertyid;

    private org.museframework.bian.counterpartyadministration.dto.bq.CounterpartyPermittedTransactionproperty counterpartyPermittedTransactionproperty;

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

    public void setCounterpartyPermittedTransactionproperty(org.museframework.bian.counterpartyadministration.dto.bq.CounterpartyPermittedTransactionproperty counterpartyPermittedTransactionproperty) {
        this.counterpartyPermittedTransactionproperty = counterpartyPermittedTransactionproperty;
    }

    public org.museframework.bian.counterpartyadministration.dto.bq.CounterpartyPermittedTransactionproperty getCounterpartyPermittedTransactionproperty() {
        return counterpartyPermittedTransactionproperty;
    }
}