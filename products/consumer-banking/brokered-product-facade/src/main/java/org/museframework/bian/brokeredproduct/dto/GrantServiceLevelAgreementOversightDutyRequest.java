package org.museframework.bian.brokeredproduct.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class GrantServiceLevelAgreementOversightDutyRequest {
    @MetaField
    private String brokeredproductid;

    @MetaField
    private String servicelevelagreementoversightdutyid;

    @MetaField(ref=true)
    private org.museframework.bian.brokeredproduct.dto.bq.ServiceLevelAgreementOversightDuty serviceLevelAgreementOversightDuty;

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

    public void setServiceLevelAgreementOversightDuty(org.museframework.bian.brokeredproduct.dto.bq.ServiceLevelAgreementOversightDuty serviceLevelAgreementOversightDuty) {
        this.serviceLevelAgreementOversightDuty = serviceLevelAgreementOversightDuty;
    }

    public org.museframework.bian.brokeredproduct.dto.bq.ServiceLevelAgreementOversightDuty getServiceLevelAgreementOversightDuty() {
        return serviceLevelAgreementOversightDuty;
    }
}