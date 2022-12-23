package org.museframework.bian.trustservices.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveTrustEstate_InheritanceandIncomeTaxFulfillmentResponse {
    @MetaField(ref=true)
    private org.museframework.bian.trustservices.dto.bq.TrustEstate_InheritanceandIncomeTaxFulfillment trustEstate_InheritanceandIncomeTaxFulfillment;

    public void setTrustEstate_InheritanceandIncomeTaxFulfillment(org.museframework.bian.trustservices.dto.bq.TrustEstate_InheritanceandIncomeTaxFulfillment trustEstate_InheritanceandIncomeTaxFulfillment) {
        this.trustEstate_InheritanceandIncomeTaxFulfillment = trustEstate_InheritanceandIncomeTaxFulfillment;
    }

    public org.museframework.bian.trustservices.dto.bq.TrustEstate_InheritanceandIncomeTaxFulfillment getTrustEstate_InheritanceandIncomeTaxFulfillment() {
        return trustEstate_InheritanceandIncomeTaxFulfillment;
    }
}