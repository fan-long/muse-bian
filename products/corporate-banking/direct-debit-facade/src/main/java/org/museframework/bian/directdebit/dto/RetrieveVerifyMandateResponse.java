package org.museframework.bian.directdebit.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveVerifyMandateResponse {
    @MetaField(ref=true)
    private org.museframework.bian.directdebit.dto.bq.VerifyMandate verifyMandate;

    public void setVerifyMandate(org.museframework.bian.directdebit.dto.bq.VerifyMandate verifyMandate) {
        this.verifyMandate = verifyMandate;
    }

    public org.museframework.bian.directdebit.dto.bq.VerifyMandate getVerifyMandate() {
        return verifyMandate;
    }
}