package org.museframework.bian.businessdevelopment.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestInitiativeRequest {
    @MetaField
    private String businessdevelopmentid;

    @MetaField
    private String initiativeid;

    @MetaField(ref=true)
    private org.museframework.bian.businessdevelopment.dto.bq.Initiative initiative;

    public void setBusinessdevelopmentid(String businessdevelopmentid) {
        this.businessdevelopmentid = businessdevelopmentid;
    }

    public String getBusinessdevelopmentid() {
        return businessdevelopmentid;
    }

    public void setInitiativeid(String initiativeid) {
        this.initiativeid = initiativeid;
    }

    public String getInitiativeid() {
        return initiativeid;
    }

    public void setInitiative(org.museframework.bian.businessdevelopment.dto.bq.Initiative initiative) {
        this.initiative = initiative;
    }

    public org.museframework.bian.businessdevelopment.dto.bq.Initiative getInitiative() {
        return initiative;
    }
}