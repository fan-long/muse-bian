package org.museframework.bian.carteradm.dto;

public class RetrieveCardPOSDeviceAllocationResponse {
    private org.museframework.bian.carteradm.dto.cr.CardPOSDeviceAllocation cardPOSDeviceAllocation;

    public void setCardPOSDeviceAllocation(org.museframework.bian.carteradm.dto.cr.CardPOSDeviceAllocation cardPOSDeviceAllocation) {
        this.cardPOSDeviceAllocation = cardPOSDeviceAllocation;
    }

    public org.museframework.bian.carteradm.dto.cr.CardPOSDeviceAllocation getCardPOSDeviceAllocation() {
        return cardPOSDeviceAllocation;
    }
}