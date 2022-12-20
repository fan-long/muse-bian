package org.museframework.bian.mortgageloan.dto;

public class ExchangeMortgageLoanFacilityResponse {
    private org.museframework.bian.mortgageloan.dto.cr.MortgageLoanFacility mortgageLoanFacility;

    public void setMortgageLoanFacility(org.museframework.bian.mortgageloan.dto.cr.MortgageLoanFacility mortgageLoanFacility) {
        this.mortgageLoanFacility = mortgageLoanFacility;
    }

    public org.museframework.bian.mortgageloan.dto.cr.MortgageLoanFacility getMortgageLoanFacility() {
        return mortgageLoanFacility;
    }
}