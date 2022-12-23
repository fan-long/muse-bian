package org.museframework.bian.proserage.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ExchangeServiceProviderAgreementResponse {
    @MetaField(ref=true)
    private org.museframework.bian.proserage.dto.cr.ServiceProviderAgreement serviceProviderAgreement;

    public void setServiceProviderAgreement(org.museframework.bian.proserage.dto.cr.ServiceProviderAgreement serviceProviderAgreement) {
        this.serviceProviderAgreement = serviceProviderAgreement;
    }

    public org.museframework.bian.proserage.dto.cr.ServiceProviderAgreement getServiceProviderAgreement() {
        return serviceProviderAgreement;
    }
}