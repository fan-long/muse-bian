package org.museframework.bian.cortruser.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateTrustTaxandExpenseFulfillmentResponse {
    @MetaField(ref=true)
    private org.museframework.bian.cortruser.dto.bq.TrustTaxandExpenseFulfillment trustTaxandExpenseFulfillment;

    public void setTrustTaxandExpenseFulfillment(org.museframework.bian.cortruser.dto.bq.TrustTaxandExpenseFulfillment trustTaxandExpenseFulfillment) {
        this.trustTaxandExpenseFulfillment = trustTaxandExpenseFulfillment;
    }

    public org.museframework.bian.cortruser.dto.bq.TrustTaxandExpenseFulfillment getTrustTaxandExpenseFulfillment() {
        return trustTaxandExpenseFulfillment;
    }
}