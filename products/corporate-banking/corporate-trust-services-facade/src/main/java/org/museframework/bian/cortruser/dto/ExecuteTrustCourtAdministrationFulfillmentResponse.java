package org.museframework.bian.cortruser.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ExecuteTrustCourtAdministrationFulfillmentResponse {
    @MetaField(ref=true)
    private org.museframework.bian.cortruser.dto.bq.TrustCourtAdministrationFulfillment trustCourtAdministrationFulfillment;

    public void setTrustCourtAdministrationFulfillment(org.museframework.bian.cortruser.dto.bq.TrustCourtAdministrationFulfillment trustCourtAdministrationFulfillment) {
        this.trustCourtAdministrationFulfillment = trustCourtAdministrationFulfillment;
    }

    public org.museframework.bian.cortruser.dto.bq.TrustCourtAdministrationFulfillment getTrustCourtAdministrationFulfillment() {
        return trustCourtAdministrationFulfillment;
    }
}