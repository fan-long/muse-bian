package org.museframework.bian.proinvdis.dto;

public class InitiateMailingResponse {
    private org.museframework.bian.proinvdis.dto.bq.Mailing mailing;

    public void setMailing(org.museframework.bian.proinvdis.dto.bq.Mailing mailing) {
        this.mailing = mailing;
    }

    public org.museframework.bian.proinvdis.dto.bq.Mailing getMailing() {
        return mailing;
    }
}