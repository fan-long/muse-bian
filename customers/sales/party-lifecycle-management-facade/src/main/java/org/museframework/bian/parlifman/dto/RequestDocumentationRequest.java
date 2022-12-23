package org.museframework.bian.parlifman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestDocumentationRequest {
    @MetaField
    private String partylifecyclemanagementid;

    @MetaField
    private String documentationid;

    @MetaField(ref=true)
    private org.museframework.bian.parlifman.dto.bq.Documentation documentation;

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

    public void setDocumentation(org.museframework.bian.parlifman.dto.bq.Documentation documentation) {
        this.documentation = documentation;
    }

    public org.museframework.bian.parlifman.dto.bq.Documentation getDocumentation() {
        return documentation;
    }
}