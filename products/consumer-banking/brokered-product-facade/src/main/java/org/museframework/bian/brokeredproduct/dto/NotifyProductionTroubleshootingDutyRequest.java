package org.museframework.bian.brokeredproduct.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class NotifyProductionTroubleshootingDutyRequest {
    @MetaField
    private String brokeredproductid;

    @MetaField
    private String productiontroubleshootingdutyid;

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
}