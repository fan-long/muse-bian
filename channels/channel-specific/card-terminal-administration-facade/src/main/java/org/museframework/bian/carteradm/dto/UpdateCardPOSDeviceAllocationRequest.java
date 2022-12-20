package org.museframework.bian.carteradm.dto;

public class UpdateCardPOSDeviceAllocationRequest {
    private String cardterminaladministrationid;

    private org.museframework.bian.carteradm.dto.cr.CardPOSDeviceAllocation cardPOSDeviceAllocation;

    public void setCardterminaladministrationid(String cardterminaladministrationid) {
        this.cardterminaladministrationid = cardterminaladministrationid;
    }

    public String getCardterminaladministrationid() {
        return cardterminaladministrationid;
    }

    public void setCardPOSDeviceAllocation(org.museframework.bian.carteradm.dto.cr.CardPOSDeviceAllocation cardPOSDeviceAllocation) {
        this.cardPOSDeviceAllocation = cardPOSDeviceAllocation;
    }

    public org.museframework.bian.carteradm.dto.cr.CardPOSDeviceAllocation getCardPOSDeviceAllocation() {
        return cardPOSDeviceAllocation;
    }
}