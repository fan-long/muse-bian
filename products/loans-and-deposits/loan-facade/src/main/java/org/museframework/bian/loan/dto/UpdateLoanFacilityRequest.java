package org.museframework.bian.loan.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateLoanFacilityRequest {
    @MetaField
    private String loanid;

    @MetaField(ref=true)
    private org.museframework.bian.loan.dto.cr.LoanFacility loanFacility;

    public void setLoanid(String loanid) {
        this.loanid = loanid;
    }

    public String getLoanid() {
        return loanid;
    }

    public void setLoanFacility(org.museframework.bian.loan.dto.cr.LoanFacility loanFacility) {
        this.loanFacility = loanFacility;
    }

    public org.museframework.bian.loan.dto.cr.LoanFacility getLoanFacility() {
        return loanFacility;
    }
}