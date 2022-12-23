package org.museframework.bian.carteradm.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ProvideCardPOSDeviceAllocationResponse {
    @MetaField(ref=true)
    private org.museframework.bian.carteradm.dto.cr.CardPOSDeviceAllocation cardPOSDeviceAllocation;

    public void setCardPOSDeviceAllocation(org.museframework.bian.carteradm.dto.cr.CardPOSDeviceAllocation cardPOSDeviceAllocation) {
        this.cardPOSDeviceAllocation = cardPOSDeviceAllocation;
    }

    public org.museframework.bian.carteradm.dto.cr.CardPOSDeviceAllocation getCardPOSDeviceAllocation() {
        return cardPOSDeviceAllocation;
    }
}