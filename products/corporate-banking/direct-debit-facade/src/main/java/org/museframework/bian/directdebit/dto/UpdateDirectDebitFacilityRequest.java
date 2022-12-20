package org.museframework.bian.directdebit.dto;

public class UpdateDirectDebitFacilityRequest {
    private String directdebitid;

    private org.museframework.bian.directdebit.dto.cr.DirectDebitFacility directDebitFacility;

    public void setDirectdebitid(String directdebitid) {
        this.directdebitid = directdebitid;
    }

    public String getDirectdebitid() {
        return directdebitid;
    }

    public void setDirectDebitFacility(org.museframework.bian.directdebit.dto.cr.DirectDebitFacility directDebitFacility) {
        this.directDebitFacility = directDebitFacility;
    }

    public org.museframework.bian.directdebit.dto.cr.DirectDebitFacility getDirectDebitFacility() {
        return directDebitFacility;
    }
}