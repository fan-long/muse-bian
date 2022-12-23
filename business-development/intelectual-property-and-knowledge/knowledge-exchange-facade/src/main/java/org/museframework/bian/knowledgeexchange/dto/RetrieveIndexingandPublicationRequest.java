package org.museframework.bian.knowledgeexchange.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveIndexingandPublicationRequest {
    @MetaField
    private String knowledgeexchangeid;

    @MetaField
    private String indexingandpublicationid;

    public void setKnowledgeexchangeid(String knowledgeexchangeid) {
        this.knowledgeexchangeid = knowledgeexchangeid;
    }

    public String getKnowledgeexchangeid() {
        return knowledgeexchangeid;
    }

    public void setIndexingandpublicationid(String indexingandpublicationid) {
        this.indexingandpublicationid = indexingandpublicationid;
    }

    public String getIndexingandpublicationid() {
        return indexingandpublicationid;
    }
}