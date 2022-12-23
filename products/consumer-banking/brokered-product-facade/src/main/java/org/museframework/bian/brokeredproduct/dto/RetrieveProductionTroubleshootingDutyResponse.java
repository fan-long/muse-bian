package org.museframework.bian.brokeredproduct.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveProductionTroubleshootingDutyResponse {
    @MetaField(ref=true)
    private org.museframework.bian.brokeredproduct.dto.bq.ProductionTroubleshootingDuty productionTroubleshootingDuty;

    public void setProductionTroubleshootingDuty(org.museframework.bian.brokeredproduct.dto.bq.ProductionTroubleshootingDuty productionTroubleshootingDuty) {
        this.productionTroubleshootingDuty = productionTroubleshootingDuty;
    }

    public org.museframework.bian.brokeredproduct.dto.bq.ProductionTroubleshootingDuty getProductionTroubleshootingDuty() {
        return productionTroubleshootingDuty;
    }
}