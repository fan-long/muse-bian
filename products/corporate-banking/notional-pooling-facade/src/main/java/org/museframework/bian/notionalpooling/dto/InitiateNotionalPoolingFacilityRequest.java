package org.museframework.bian.notionalpooling.dto;

public class InitiateNotionalPoolingFacilityRequest {
    private org.museframework.bian.notionalpooling.dto.cr.NotionalPoolingFacility notionalPoolingFacility;

    public void setNotionalPoolingFacility(org.museframework.bian.notionalpooling.dto.cr.NotionalPoolingFacility notionalPoolingFacility) {
        this.notionalPoolingFacility = notionalPoolingFacility;
    }

    public org.museframework.bian.notionalpooling.dto.cr.NotionalPoolingFacility getNotionalPoolingFacility() {
        return notionalPoolingFacility;
    }
}