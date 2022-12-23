package org.museframework.bian.brokeredproduct.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveServiceLevelAgreementOversightDutyRequest {
    @MetaField
    private String brokeredproductid;

    @MetaField
    private String servicelevelagreementoversightdutyid;

    public void setBrokeredproductid(String brokeredproductid) {
        this.brokeredproductid = brokeredproductid;
    }

    public String getBrokeredproductid() {
        return brokeredproductid;
    }

    public void setServicelevelagreementoversightdutyid(String servicelevelagreementoversightdutyid) {
        this.servicelevelagreementoversightdutyid = servicelevelagreementoversightdutyid;
    }

    public String getServicelevelagreementoversightdutyid() {
        return servicelevelagreementoversightdutyid;
    }
}