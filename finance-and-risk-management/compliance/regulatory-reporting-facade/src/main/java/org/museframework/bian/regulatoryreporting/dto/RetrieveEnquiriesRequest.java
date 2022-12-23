package org.museframework.bian.regulatoryreporting.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveEnquiriesRequest {
    @MetaField
    private String regulatoryreportingid;

    @MetaField
    private String enquiriesid;

    public void setRegulatoryreportingid(String regulatoryreportingid) {
        this.regulatoryreportingid = regulatoryreportingid;
    }

    public String getRegulatoryreportingid() {
        return regulatoryreportingid;
    }

    public void setEnquiriesid(String enquiriesid) {
        this.enquiriesid = enquiriesid;
    }

    public String getEnquiriesid() {
        return enquiriesid;
    }
}