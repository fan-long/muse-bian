package org.museframework.bian.directdebit.dto;

public class ExecuteVerifyMandateResponse {
    private org.museframework.bian.directdebit.dto.bq.VerifyMandate verifyMandate;

    public void setVerifyMandate(org.museframework.bian.directdebit.dto.bq.VerifyMandate verifyMandate) {
        this.verifyMandate = verifyMandate;
    }

    public org.museframework.bian.directdebit.dto.bq.VerifyMandate getVerifyMandate() {
        return verifyMandate;
    }
}