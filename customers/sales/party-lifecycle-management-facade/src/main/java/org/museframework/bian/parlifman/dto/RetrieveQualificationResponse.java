package org.museframework.bian.parlifman.dto;

public class RetrieveQualificationResponse {
    private org.museframework.bian.parlifman.dto.bq.Qualification qualification;

    public void setQualification(org.museframework.bian.parlifman.dto.bq.Qualification qualification) {
        this.qualification = qualification;
    }

    public org.museframework.bian.parlifman.dto.bq.Qualification getQualification() {
        return qualification;
    }
}