package org.museframework.bian.productionrelease.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveProductionRiskRequest {
    @MetaField
    private String productionreleaseid;

    @MetaField
    private String productionriskid;

    public void setProductionreleaseid(String productionreleaseid) {
        this.productionreleaseid = productionreleaseid;
    }

    public String getProductionreleaseid() {
        return productionreleaseid;
    }

    public void setProductionriskid(String productionriskid) {
        this.productionriskid = productionriskid;
    }

    public String getProductionriskid() {
        return productionriskid;
    }
}