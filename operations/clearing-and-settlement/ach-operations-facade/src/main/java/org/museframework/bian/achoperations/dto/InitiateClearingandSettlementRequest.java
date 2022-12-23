package org.museframework.bian.achoperations.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateClearingandSettlementRequest {
    @MetaField
    private String achoperationsid;

    @MetaField
    private String clearingandsettlementid;

    @MetaField(ref=true)
    private org.museframework.bian.achoperations.dto.bq.ClearingandSettlement clearingandSettlement;

    public void setAchoperationsid(String achoperationsid) {
        this.achoperationsid = achoperationsid;
    }

    public String getAchoperationsid() {
        return achoperationsid;
    }

    public void setClearingandsettlementid(String clearingandsettlementid) {
        this.clearingandsettlementid = clearingandsettlementid;
    }

    public String getClearingandsettlementid() {
        return clearingandsettlementid;
    }

    public void setClearingandSettlement(org.museframework.bian.achoperations.dto.bq.ClearingandSettlement clearingandSettlement) {
        this.clearingandSettlement = clearingandSettlement;
    }

    public org.museframework.bian.achoperations.dto.bq.ClearingandSettlement getClearingandSettlement() {
        return clearingandSettlement;
    }
}