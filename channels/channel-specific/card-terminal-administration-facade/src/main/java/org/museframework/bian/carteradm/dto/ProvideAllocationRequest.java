package org.museframework.bian.carteradm.dto;

public class ProvideAllocationRequest {
    private String cardterminaladministrationid;

    private String allocationid;

    private org.museframework.bian.carteradm.dto.bq.Allocation allocation;

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

    public void setAllocation(org.museframework.bian.carteradm.dto.bq.Allocation allocation) {
        this.allocation = allocation;
    }

    public org.museframework.bian.carteradm.dto.bq.Allocation getAllocation() {
        return allocation;
    }
}