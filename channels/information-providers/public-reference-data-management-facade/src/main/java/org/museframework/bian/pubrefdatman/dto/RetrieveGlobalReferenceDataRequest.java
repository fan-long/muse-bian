package org.museframework.bian.pubrefdatman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveGlobalReferenceDataRequest {
    @MetaField
    private String publicreferencedatamanagementid;

    @MetaField
    private String globalreferencedataid;

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
}