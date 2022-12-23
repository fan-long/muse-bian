package org.museframework.bian.fraudmodel.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExecuteProductionRequest {
    @MetaField
    private String fraudmodelid;

    @MetaField
    private String productionid;

    @MetaField(ref=true)
    private org.museframework.bian.fraudmodel.dto.bq.Production production;

    public void setFraudmodelid(String fraudmodelid) {
        this.fraudmodelid = fraudmodelid;
    }

    public String getFraudmodelid() {
        return fraudmodelid;
    }

    public void setProductionid(String productionid) {
        this.productionid = productionid;
    }

    public String getProductionid() {
        return productionid;
    }

    public void setProduction(org.museframework.bian.fraudmodel.dto.bq.Production production) {
        this.production = production;
    }

    public org.museframework.bian.fraudmodel.dto.bq.Production getProduction() {
        return production;
    }
}