package org.museframework.bian.notionalpooling.dto;

public class UpdateNotionalPoolingFacilityRequest {
    private String notionalpoolingid;

    private org.museframework.bian.notionalpooling.dto.cr.NotionalPoolingFacility notionalPoolingFacility;

    public void setNotionalpoolingid(String notionalpoolingid) {
        this.notionalpoolingid = notionalpoolingid;
    }

    public String getNotionalpoolingid() {
        return notionalpoolingid;
    }

    public void setNotionalPoolingFacility(org.museframework.bian.notionalpooling.dto.cr.NotionalPoolingFacility notionalPoolingFacility) {
        this.notionalPoolingFacility = notionalPoolingFacility;
    }

    public org.museframework.bian.notionalpooling.dto.cr.NotionalPoolingFacility getNotionalPoolingFacility() {
        return notionalPoolingFacility;
    }
}