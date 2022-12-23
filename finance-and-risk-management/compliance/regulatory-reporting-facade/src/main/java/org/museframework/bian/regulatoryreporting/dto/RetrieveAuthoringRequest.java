package org.museframework.bian.regulatoryreporting.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveAuthoringRequest {
    @MetaField
    private String regulatoryreportingid;

    @MetaField
    private String authoringid;

    public void setRegulatoryreportingid(String regulatoryreportingid) {
        this.regulatoryreportingid = regulatoryreportingid;
    }

    public String getRegulatoryreportingid() {
        return regulatoryreportingid;
    }

    public void setAuthoringid(String authoringid) {
        this.authoringid = authoringid;
    }

    public String getAuthoringid() {
        return authoringid;
    }
}