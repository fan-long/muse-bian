package org.museframework.bian.trustservices.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RequestTrustTaxandExpenseFulfillmentResponse {
    @MetaField(ref=true)
    private org.museframework.bian.trustservices.dto.bq.TrustTaxandExpenseFulfillment trustTaxandExpenseFulfillment;

    public void setTrustTaxandExpenseFulfillment(org.museframework.bian.trustservices.dto.bq.TrustTaxandExpenseFulfillment trustTaxandExpenseFulfillment) {
        this.trustTaxandExpenseFulfillment = trustTaxandExpenseFulfillment;
    }

    public org.museframework.bian.trustservices.dto.bq.TrustTaxandExpenseFulfillment getTrustTaxandExpenseFulfillment() {
        return trustTaxandExpenseFulfillment;
    }
}