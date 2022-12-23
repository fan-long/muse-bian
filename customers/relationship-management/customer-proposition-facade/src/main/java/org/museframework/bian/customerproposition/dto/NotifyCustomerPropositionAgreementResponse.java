package org.museframework.bian.customerproposition.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class NotifyCustomerPropositionAgreementResponse {
    @MetaField(ref=true)
    private org.museframework.bian.customerproposition.dto.cr.CustomerPropositionAgreement customerPropositionAgreement;

    public void setCustomerPropositionAgreement(org.museframework.bian.customerproposition.dto.cr.CustomerPropositionAgreement customerPropositionAgreement) {
        this.customerPropositionAgreement = customerPropositionAgreement;
    }

    public org.museframework.bian.customerproposition.dto.cr.CustomerPropositionAgreement getCustomerPropositionAgreement() {
        return customerPropositionAgreement;
    }
}