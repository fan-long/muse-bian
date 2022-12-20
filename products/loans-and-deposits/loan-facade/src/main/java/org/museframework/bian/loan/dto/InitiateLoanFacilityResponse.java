package org.museframework.bian.loan.dto;

public class InitiateLoanFacilityResponse {
    private org.museframework.bian.loan.dto.cr.LoanFacility loanFacility;

    public void setLoanFacility(org.museframework.bian.loan.dto.cr.LoanFacility loanFacility) {
        this.loanFacility = loanFacility;
    }

    public org.museframework.bian.loan.dto.cr.LoanFacility getLoanFacility() {
        return loanFacility;
    }
}