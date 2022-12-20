package org.museframework.bian.termdeposit.dto;

public class UpdateTermDepositFacilityRequest {
    private String termdepositid;

    private org.museframework.bian.termdeposit.dto.cr.TermDepositFacility termDepositFacility;

    public void setTermdepositid(String termdepositid) {
        this.termdepositid = termdepositid;
    }

    public String getTermdepositid() {
        return termdepositid;
    }

    public void setTermDepositFacility(org.museframework.bian.termdeposit.dto.cr.TermDepositFacility termDepositFacility) {
        this.termDepositFacility = termDepositFacility;
    }

    public org.museframework.bian.termdeposit.dto.cr.TermDepositFacility getTermDepositFacility() {
        return termDepositFacility;
    }
}