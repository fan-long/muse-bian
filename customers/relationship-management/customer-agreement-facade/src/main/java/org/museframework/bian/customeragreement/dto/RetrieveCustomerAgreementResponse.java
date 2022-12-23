package org.museframework.bian.customeragreement.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveCustomerAgreementResponse {
    @MetaField(ref=true)
    private org.museframework.bian.customeragreement.dto.cr.CustomerAgreement customerAgreement;

    public void setCustomerAgreement(org.museframework.bian.customeragreement.dto.cr.CustomerAgreement customerAgreement) {
        this.customerAgreement = customerAgreement;
    }

    public org.museframework.bian.customeragreement.dto.cr.CustomerAgreement getCustomerAgreement() {
        return customerAgreement;
    }
}