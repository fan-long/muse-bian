package org.museframework.bian.cortruser.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ExecuteTrustEstate_InheritanceandIncomeTaxFulfillmentResponse {
    @MetaField(ref=true)
    private org.museframework.bian.cortruser.dto.bq.TrustEstate_InheritanceandIncomeTaxFulfillment trustEstate_InheritanceandIncomeTaxFulfillment;

    public void setTrustEstate_InheritanceandIncomeTaxFulfillment(org.museframework.bian.cortruser.dto.bq.TrustEstate_InheritanceandIncomeTaxFulfillment trustEstate_InheritanceandIncomeTaxFulfillment) {
        this.trustEstate_InheritanceandIncomeTaxFulfillment = trustEstate_InheritanceandIncomeTaxFulfillment;
    }

    public org.museframework.bian.cortruser.dto.bq.TrustEstate_InheritanceandIncomeTaxFulfillment getTrustEstate_InheritanceandIncomeTaxFulfillment() {
        return trustEstate_InheritanceandIncomeTaxFulfillment;
    }
}