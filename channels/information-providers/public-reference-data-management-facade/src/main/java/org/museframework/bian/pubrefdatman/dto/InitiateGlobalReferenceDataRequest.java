package org.museframework.bian.pubrefdatman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateGlobalReferenceDataRequest {
    @MetaField
    private String publicreferencedatamanagementid;

    @MetaField
    private String globalreferencedataid;

    @MetaField(ref=true)
    private org.museframework.bian.pubrefdatman.dto.bq.GlobalReferenceData globalReferenceData;

    public void setPublicreferencedatamanagementid(String publicreferencedatamanagementid) {
        this.publicreferencedatamanagementid = publicreferencedatamanagementid;
    }

    public String getPublicreferencedatamanagementid() {
        return publicreferencedatamanagementid;
    }

    public void setGlobalreferencedataid(String globalreferencedataid) {
        this.globalreferencedataid = globalreferencedataid;
    }

    public String getGlobalreferencedataid() {
        return globalreferencedataid;
    }

    public void setGlobalReferenceData(org.museframework.bian.pubrefdatman.dto.bq.GlobalReferenceData globalReferenceData) {
        this.globalReferenceData = globalReferenceData;
    }

    public org.museframework.bian.pubrefdatman.dto.bq.GlobalReferenceData getGlobalReferenceData() {
        return globalReferenceData;
    }
}