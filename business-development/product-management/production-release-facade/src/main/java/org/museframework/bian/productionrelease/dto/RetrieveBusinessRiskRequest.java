package org.museframework.bian.productionrelease.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveBusinessRiskRequest {
    @MetaField
    private String productionreleaseid;

    @MetaField
    private String businessriskid;

    public void setProductionreleaseid(String productionreleaseid) {
        this.productionreleaseid = productionreleaseid;
    }

    public String getProductionreleaseid() {
        return productionreleaseid;
    }

    public void setBusinessriskid(String businessriskid) {
        this.businessriskid = businessriskid;
    }

    public String getBusinessriskid() {
        return businessriskid;
    }
}