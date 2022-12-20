package org.museframework.bian.mortgageloan.dto;

public class ControlMortgageLoanFacilityRequest {
    private String mortgageloanid;

    private org.museframework.bian.mortgageloan.dto.cr.MortgageLoanFacility mortgageLoanFacility;

    public void setMortgageloanid(String mortgageloanid) {
        this.mortgageloanid = mortgageloanid;
    }

    public String getMortgageloanid() {
        return mortgageloanid;
    }

    public void setMortgageLoanFacility(org.museframework.bian.mortgageloan.dto.cr.MortgageLoanFacility mortgageLoanFacility) {
        this.mortgageLoanFacility = mortgageLoanFacility;
    }

    public org.museframework.bian.mortgageloan.dto.cr.MortgageLoanFacility getMortgageLoanFacility() {
        return mortgageLoanFacility;
    }
}