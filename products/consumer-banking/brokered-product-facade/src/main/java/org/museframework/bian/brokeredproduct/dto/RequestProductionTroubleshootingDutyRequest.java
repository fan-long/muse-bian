package org.museframework.bian.brokeredproduct.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestProductionTroubleshootingDutyRequest {
    @MetaField
    private String brokeredproductid;

    @MetaField
    private String productiontroubleshootingdutyid;

    @MetaField(ref=true)
    private org.museframework.bian.brokeredproduct.dto.bq.ProductionTroubleshootingDuty productionTroubleshootingDuty;

    public void setBrokeredproductid(String brokeredproductid) {
        this.brokeredproductid = brokeredproductid;
    }

    public String getBrokeredproductid() {
        return brokeredproductid;
    }

    public void setProductiontroubleshootingdutyid(String productiontroubleshootingdutyid) {
        this.productiontroubleshootingdutyid = productiontroubleshootingdutyid;
    }

    public String getProductiontroubleshootingdutyid() {
        return productiontroubleshootingdutyid;
    }

    public void setProductionTroubleshootingDuty(org.museframework.bian.brokeredproduct.dto.bq.ProductionTroubleshootingDuty productionTroubleshootingDuty) {
        this.productionTroubleshootingDuty = productionTroubleshootingDuty;
    }

    public org.museframework.bian.brokeredproduct.dto.bq.ProductionTroubleshootingDuty getProductionTroubleshootingDuty() {
        return productionTroubleshootingDuty;
    }
}