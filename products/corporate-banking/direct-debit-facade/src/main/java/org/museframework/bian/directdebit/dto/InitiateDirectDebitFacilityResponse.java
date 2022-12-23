package org.museframework.bian.directdebit.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class InitiateDirectDebitFacilityResponse {
    @MetaField(ref=true)
    private org.museframework.bian.directdebit.dto.cr.DirectDebitFacility directDebitFacility;

    public void setDirectDebitFacility(org.museframework.bian.directdebit.dto.cr.DirectDebitFacility directDebitFacility) {
        this.directDebitFacility = directDebitFacility;
    }

    public org.museframework.bian.directdebit.dto.cr.DirectDebitFacility getDirectDebitFacility() {
        return directDebitFacility;
    }
}