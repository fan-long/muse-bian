package org.museframework.bian.carteradm.dto;

public class RetrieveAllocationRequest {
    private String cardterminaladministrationid;

    private String allocationid;

    public void setCardterminaladministrationid(String cardterminaladministrationid) {
        this.cardterminaladministrationid = cardterminaladministrationid;
    }

    public String getCardterminaladministrationid() {
        return cardterminaladministrationid;
    }

    public void setAllocationid(String allocationid) {
        this.allocationid = allocationid;
    }

    public String getAllocationid() {
        return allocationid;
    }
}