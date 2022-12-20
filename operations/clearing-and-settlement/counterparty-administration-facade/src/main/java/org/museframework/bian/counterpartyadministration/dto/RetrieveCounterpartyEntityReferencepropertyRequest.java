package org.museframework.bian.counterpartyadministration.dto;

public class RetrieveCounterpartyEntityReferencepropertyRequest {
    private String counterpartyadministrationid;

    private String counterpartyentityreferencepropertyid;

    public void setCounterpartyadministrationid(String counterpartyadministrationid) {
        this.counterpartyadministrationid = counterpartyadministrationid;
    }

    public String getCounterpartyadministrationid() {
        return counterpartyadministrationid;
    }

    public void setCounterpartyentityreferencepropertyid(String counterpartyentityreferencepropertyid) {
        this.counterpartyentityreferencepropertyid = counterpartyentityreferencepropertyid;
    }

    public String getCounterpartyentityreferencepropertyid() {
        return counterpartyentityreferencepropertyid;
    }
}