package org.museframework.bian.knowledgeexchange.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveArchivingRequest {
    @MetaField
    private String knowledgeexchangeid;

    @MetaField
    private String archivingid;

    public void setKnowledgeexchangeid(String knowledgeexchangeid) {
        this.knowledgeexchangeid = knowledgeexchangeid;
    }

    public String getKnowledgeexchangeid() {
        return knowledgeexchangeid;
    }

    public void setArchivingid(String archivingid) {
        this.archivingid = archivingid;
    }

    public String getArchivingid() {
        return archivingid;
    }
}