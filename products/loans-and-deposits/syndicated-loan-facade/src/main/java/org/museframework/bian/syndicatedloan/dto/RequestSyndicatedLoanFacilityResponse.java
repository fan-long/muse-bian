package org.museframework.bian.syndicatedloan.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RequestSyndicatedLoanFacilityResponse {
    @MetaField(ref=true)
    private org.museframework.bian.syndicatedloan.dto.cr.SyndicatedLoanFacility syndicatedLoanFacility;

    public void setSyndicatedLoanFacility(org.museframework.bian.syndicatedloan.dto.cr.SyndicatedLoanFacility syndicatedLoanFacility) {
        this.syndicatedLoanFacility = syndicatedLoanFacility;
    }

    public org.museframework.bian.syndicatedloan.dto.cr.SyndicatedLoanFacility getSyndicatedLoanFacility() {
        return syndicatedLoanFacility;
    }
}