package org.museframework.bian.pubrefdatman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveGlobalStandardSpecificationRequest {
    @MetaField
    private String publicreferencedatamanagementid;

    public void setPublicreferencedatamanagementid(String publicreferencedatamanagementid) {
        this.publicreferencedatamanagementid = publicreferencedatamanagementid;
    }

    public String getPublicreferencedatamanagementid() {
        return publicreferencedatamanagementid;
    }
}