package org.museframework.bian.cusrelman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestDevelopmentRequest {
    @MetaField
    private String customerrelationshipmanagementid;

    @MetaField
    private String developmentid;

    @MetaField(ref=true)
    private org.museframework.bian.cusrelman.dto.bq.Development development;

    public void setCustomerrelationshipmanagementid(String customerrelationshipmanagementid) {
        this.customerrelationshipmanagementid = customerrelationshipmanagementid;
    }

    public String getCustomerrelationshipmanagementid() {
        return customerrelationshipmanagementid;
    }

    public void setDevelopmentid(String developmentid) {
        this.developmentid = developmentid;
    }

    public String getDevelopmentid() {
        return developmentid;
    }

    public void setDevelopment(org.museframework.bian.cusrelman.dto.bq.Development development) {
        this.development = development;
    }

    public org.museframework.bian.cusrelman.dto.bq.Development getDevelopment() {
        return development;
    }
}