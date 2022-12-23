package org.museframework.bian.trustservices.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ExchangeTrustCourtAdministrationFulfillmentResponse {
    @MetaField(ref=true)
    private org.museframework.bian.trustservices.dto.bq.TrustCourtAdministrationFulfillment trustCourtAdministrationFulfillment;

    public void setTrustCourtAdministrationFulfillment(org.museframework.bian.trustservices.dto.bq.TrustCourtAdministrationFulfillment trustCourtAdministrationFulfillment) {
        this.trustCourtAdministrationFulfillment = trustCourtAdministrationFulfillment;
    }

    public org.museframework.bian.trustservices.dto.bq.TrustCourtAdministrationFulfillment getTrustCourtAdministrationFulfillment() {
        return trustCourtAdministrationFulfillment;
    }
}