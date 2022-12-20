package org.museframework.bian.syndicatedloan.dto;

public class RequestSyndicatedLoanFacilityRequest {
    private String syndicatedloanid;

    private org.museframework.bian.syndicatedloan.dto.cr.SyndicatedLoanFacility syndicatedLoanFacility;

    public void setSyndicatedloanid(String syndicatedloanid) {
        this.syndicatedloanid = syndicatedloanid;
    }

    public String getSyndicatedloanid() {
        return syndicatedloanid;
    }

    public void setSyndicatedLoanFacility(org.museframework.bian.syndicatedloan.dto.cr.SyndicatedLoanFacility syndicatedLoanFacility) {
        this.syndicatedLoanFacility = syndicatedLoanFacility;
    }

    public org.museframework.bian.syndicatedloan.dto.cr.SyndicatedLoanFacility getSyndicatedLoanFacility() {
        return syndicatedLoanFacility;
    }
}