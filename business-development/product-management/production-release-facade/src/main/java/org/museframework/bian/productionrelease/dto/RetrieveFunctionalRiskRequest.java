package org.museframework.bian.productionrelease.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveFunctionalRiskRequest {
    @MetaField
    private String productionreleaseid;

    @MetaField
    private String functionalriskid;

    public void setProductionreleaseid(String productionreleaseid) {
        this.productionreleaseid = productionreleaseid;
    }

    public String getProductionreleaseid() {
        return productionreleaseid;
    }

    public void setFunctionalriskid(String functionalriskid) {
        this.functionalriskid = functionalriskid;
    }

    public String getFunctionalriskid() {
        return functionalriskid;
    }
}