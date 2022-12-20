package org.museframework.bian.parrefdatdir.dto;

public class UpdateDemographicsResponse {
    private org.museframework.bian.parrefdatdir.dto.bq.Demographics demographics;

    public void setDemographics(org.museframework.bian.parrefdatdir.dto.bq.Demographics demographics) {
        this.demographics = demographics;
    }

    public org.museframework.bian.parrefdatdir.dto.bq.Demographics getDemographics() {
        return demographics;
    }
}