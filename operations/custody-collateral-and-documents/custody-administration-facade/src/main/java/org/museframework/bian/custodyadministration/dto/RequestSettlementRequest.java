package org.museframework.bian.custodyadministration.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestSettlementRequest {
    @MetaField
    private String custodyadministrationid;

    @MetaField
    private String settlementid;

    @MetaField(ref=true)
    private org.museframework.bian.custodyadministration.dto.bq.Settlement settlement;

    public void setCustodyadministrationid(String custodyadministrationid) {
        this.custodyadministrationid = custodyadministrationid;
    }

    public String getCustodyadministrationid() {
        return custodyadministrationid;
    }

    public void setSettlementid(String settlementid) {
        this.settlementid = settlementid;
    }

    public String getSettlementid() {
        return settlementid;
    }

    public void setSettlement(org.museframework.bian.custodyadministration.dto.bq.Settlement settlement) {
        this.settlement = settlement;
    }

    public org.museframework.bian.custodyadministration.dto.bq.Settlement getSettlement() {
        return settlement;
    }
}