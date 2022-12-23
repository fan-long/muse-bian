package org.museframework.bian.probroagr.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateBrokerAgreementResponse {
    @MetaField(ref=true)
    private org.museframework.bian.probroagr.dto.cr.BrokerAgreement brokerAgreement;

    public void setBrokerAgreement(org.museframework.bian.probroagr.dto.cr.BrokerAgreement brokerAgreement) {
        this.brokerAgreement = brokerAgreement;
    }

    public org.museframework.bian.probroagr.dto.cr.BrokerAgreement getBrokerAgreement() {
        return brokerAgreement;
    }
}