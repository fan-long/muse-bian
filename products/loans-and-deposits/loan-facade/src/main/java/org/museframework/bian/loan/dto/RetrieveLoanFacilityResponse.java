package org.museframework.bian.loan.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveLoanFacilityResponse {
    @MetaField(ref=true)
    private org.museframework.bian.loan.dto.cr.LoanFacility loanFacility;

    public void setLoanFacility(org.museframework.bian.loan.dto.cr.LoanFacility loanFacility) {
        this.loanFacility = loanFacility;
    }

    public org.museframework.bian.loan.dto.cr.LoanFacility getLoanFacility() {
        return loanFacility;
    }
}