package org.museframework.bian.termdeposit.dto;

public class UpdateTermDepositFacilityResponse {
    private org.museframework.bian.termdeposit.dto.cr.TermDepositFacility termDepositFacility;

    public void setTermDepositFacility(org.museframework.bian.termdeposit.dto.cr.TermDepositFacility termDepositFacility) {
        this.termDepositFacility = termDepositFacility;
    }

    public org.museframework.bian.termdeposit.dto.cr.TermDepositFacility getTermDepositFacility() {
        return termDepositFacility;
    }
}