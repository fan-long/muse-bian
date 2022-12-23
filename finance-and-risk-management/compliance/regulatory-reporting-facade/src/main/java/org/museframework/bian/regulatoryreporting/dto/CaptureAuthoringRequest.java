package org.museframework.bian.regulatoryreporting.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class CaptureAuthoringRequest {
    @MetaField
    private String regulatoryreportingid;

    @MetaField
    private String authoringid;

    @MetaField(ref=true)
    private org.museframework.bian.regulatoryreporting.dto.bq.Authoring authoring;

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

    public void setAuthoring(org.museframework.bian.regulatoryreporting.dto.bq.Authoring authoring) {
        this.authoring = authoring;
    }

    public org.museframework.bian.regulatoryreporting.dto.bq.Authoring getAuthoring() {
        return authoring;
    }
}