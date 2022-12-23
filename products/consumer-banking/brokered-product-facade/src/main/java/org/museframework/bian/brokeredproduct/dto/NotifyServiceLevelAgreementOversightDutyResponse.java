package org.museframework.bian.brokeredproduct.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class NotifyServiceLevelAgreementOversightDutyResponse {
    @MetaField(ref=true)
    private org.museframework.bian.brokeredproduct.dto.bq.ServiceLevelAgreementOversightDuty serviceLevelAgreementOversightDuty;

    public void setServiceLevelAgreementOversightDuty(org.museframework.bian.brokeredproduct.dto.bq.ServiceLevelAgreementOversightDuty serviceLevelAgreementOversightDuty) {
        this.serviceLevelAgreementOversightDuty = serviceLevelAgreementOversightDuty;
    }

    public org.museframework.bian.brokeredproduct.dto.bq.ServiceLevelAgreementOversightDuty getServiceLevelAgreementOversightDuty() {
        return serviceLevelAgreementOversightDuty;
    }
}