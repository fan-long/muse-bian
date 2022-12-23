package org.museframework.bian.cusaccent.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RequestCustomerAccessProfileAgreementResponse {
    @MetaField(ref=true)
    private org.museframework.bian.cusaccent.dto.cr.CustomerAccessProfileAgreement customerAccessProfileAgreement;

    public void setCustomerAccessProfileAgreement(org.museframework.bian.cusaccent.dto.cr.CustomerAccessProfileAgreement customerAccessProfileAgreement) {
        this.customerAccessProfileAgreement = customerAccessProfileAgreement;
    }

    public org.museframework.bian.cusaccent.dto.cr.CustomerAccessProfileAgreement getCustomerAccessProfileAgreement() {
        return customerAccessProfileAgreement;
    }
}