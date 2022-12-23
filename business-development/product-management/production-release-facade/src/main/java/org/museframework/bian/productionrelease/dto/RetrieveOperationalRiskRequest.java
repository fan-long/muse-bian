package org.museframework.bian.productionrelease.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveOperationalRiskRequest {
    @MetaField
    private String productionreleaseid;

    @MetaField
    private String operationalriskid;

    public void setProductionreleaseid(String productionreleaseid) {
        this.productionreleaseid = productionreleaseid;
    }

    public String getProductionreleaseid() {
        return productionreleaseid;
    }

    public void setOperationalriskid(String operationalriskid) {
        this.operationalriskid = operationalriskid;
    }

    public String getOperationalriskid() {
        return operationalriskid;
    }
}