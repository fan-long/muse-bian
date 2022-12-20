package org.museframework.bian.cardclearing.dto;

public class RetrieveAddressingResponse {
    private org.museframework.bian.cardclearing.dto.bq.Addressing addressing;

    public void setAddressing(org.museframework.bian.cardclearing.dto.bq.Addressing addressing) {
        this.addressing = addressing;
    }

    public org.museframework.bian.cardclearing.dto.bq.Addressing getAddressing() {
        return addressing;
    }
}