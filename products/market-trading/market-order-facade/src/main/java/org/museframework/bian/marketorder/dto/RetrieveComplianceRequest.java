package org.museframework.bian.marketorder.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveComplianceRequest {
    @MetaField
    private String marketorderid;

    @MetaField
    private String complianceid;

    public void setMarketorderid(String marketorderid) {
        this.marketorderid = marketorderid;
    }

    public String getMarketorderid() {
        return marketorderid;
    }

    public void setComplianceid(String complianceid) {
        this.complianceid = complianceid;
    }

    public String getComplianceid() {
        return complianceid;
    }
}