package org.museframework.bian.carteradm.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateCardPOSDeviceAllocationRequest {
    @MetaField
    private String cardterminaladministrationid;

    @MetaField(ref=true)
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