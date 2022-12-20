package org.museframework.bian.syndicatedloan.dto;

public class ExecuteSyndicatedLoanFacilityResponse {
    private org.museframework.bian.syndicatedloan.dto.cr.SyndicatedLoanFacility syndicatedLoanFacility;

    public void setSyndicatedLoanFacility(org.museframework.bian.syndicatedloan.dto.cr.SyndicatedLoanFacility syndicatedLoanFacility) {
        this.syndicatedLoanFacility = syndicatedLoanFacility;
    }

    public org.museframework.bian.syndicatedloan.dto.cr.SyndicatedLoanFacility getSyndicatedLoanFacility() {
        return syndicatedLoanFacility;
    }
}