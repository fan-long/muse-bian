package org.museframework.bian.loan.dto;

public class UpdateLoanFacilityRequest {
    private String loanid;

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