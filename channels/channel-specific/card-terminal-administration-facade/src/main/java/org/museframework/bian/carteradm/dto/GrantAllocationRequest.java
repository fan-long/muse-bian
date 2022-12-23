package org.museframework.bian.carteradm.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class GrantAllocationRequest {
    @MetaField
    private String cardterminaladministrationid;

    @MetaField
    private String allocationid;

    @MetaField(ref=true)
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