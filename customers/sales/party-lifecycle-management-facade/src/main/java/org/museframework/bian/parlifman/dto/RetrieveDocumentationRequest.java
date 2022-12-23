package org.museframework.bian.parlifman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveDocumentationRequest {
    @MetaField
    private String partylifecyclemanagementid;

    @MetaField
    private String documentationid;

    public void setPartylifecyclemanagementid(String partylifecyclemanagementid) {
        this.partylifecyclemanagementid = partylifecyclemanagementid;
    }

    public String getPartylifecyclemanagementid() {
        return partylifecyclemanagementid;
    }

    public void setDocumentationid(String documentationid) {
        this.documentationid = documentationid;
    }

    public String getDocumentationid() {
        return documentationid;
    }
}