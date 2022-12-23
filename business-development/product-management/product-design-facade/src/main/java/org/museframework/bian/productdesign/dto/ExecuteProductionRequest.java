package org.museframework.bian.productdesign.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExecuteProductionRequest {
    @MetaField
    private String productdesignid;

    @MetaField
    private String productionid;

    @MetaField(ref=true)
    private org.museframework.bian.productdesign.dto.bq.Production production;

    public void setProductdesignid(String productdesignid) {
        this.productdesignid = productdesignid;
    }

    public String getProductdesignid() {
        return productdesignid;
    }

    public void setProductionid(String productionid) {
        this.productionid = productionid;
    }

    public String getProductionid() {
        return productionid;
    }

    public void setProduction(org.museframework.bian.productdesign.dto.bq.Production production) {
        this.production = production;
    }

    public org.museframework.bian.productdesign.dto.bq.Production getProduction() {
        return production;
    }
}