package org.museframework.bian.carteradm.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveAllocationRequest {
    @MetaField
    private String cardterminaladministrationid;

    @MetaField
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