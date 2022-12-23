package org.museframework.bian.corbanope.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestClearingandSettlementRequest {
    @MetaField
    private String correspondentbankoperationsid;

    @MetaField
    private String clearingandsettlementid;

    @MetaField(ref=true)
    private org.museframework.bian.corbanope.dto.bq.ClearingandSettlement clearingandSettlement;

    public void setCorrespondentbankoperationsid(String correspondentbankoperationsid) {
        this.correspondentbankoperationsid = correspondentbankoperationsid;
    }

    public String getCorrespondentbankoperationsid() {
        return correspondentbankoperationsid;
    }

    public void setClearingandsettlementid(String clearingandsettlementid) {
        this.clearingandsettlementid = clearingandsettlementid;
    }

    public String getClearingandsettlementid() {
        return clearingandsettlementid;
    }

    public void setClearingandSettlement(org.museframework.bian.corbanope.dto.bq.ClearingandSettlement clearingandSettlement) {
        this.clearingandSettlement = clearingandSettlement;
    }

    public org.museframework.bian.corbanope.dto.bq.ClearingandSettlement getClearingandSettlement() {
        return clearingandSettlement;
    }
}