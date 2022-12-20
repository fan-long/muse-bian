package org.museframework.bian.counterpartyadministration.dto;

public class UpdateCounterpartyEntityReferencepropertyRequest {
    private String counterpartyadministrationid;

    private String counterpartyentityreferencepropertyid;

    private org.museframework.bian.counterpartyadministration.dto.bq.CounterpartyEntityReferenceproperty counterpartyEntityReferenceproperty;

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

    public void setCounterpartyEntityReferenceproperty(org.museframework.bian.counterpartyadministration.dto.bq.CounterpartyEntityReferenceproperty counterpartyEntityReferenceproperty) {
        this.counterpartyEntityReferenceproperty = counterpartyEntityReferenceproperty;
    }

    public org.museframework.bian.counterpartyadministration.dto.bq.CounterpartyEntityReferenceproperty getCounterpartyEntityReferenceproperty() {
        return counterpartyEntityReferenceproperty;
    }
}