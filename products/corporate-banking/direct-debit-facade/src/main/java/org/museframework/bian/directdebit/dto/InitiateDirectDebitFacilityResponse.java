package org.museframework.bian.directdebit.dto;

public class InitiateDirectDebitFacilityResponse {
    private org.museframework.bian.directdebit.dto.cr.DirectDebitFacility directDebitFacility;

    public void setDirectDebitFacility(org.museframework.bian.directdebit.dto.cr.DirectDebitFacility directDebitFacility) {
        this.directDebitFacility = directDebitFacility;
    }

    public org.museframework.bian.directdebit.dto.cr.DirectDebitFacility getDirectDebitFacility() {
        return directDebitFacility;
    }
}