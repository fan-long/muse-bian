package org.museframework.bian.knowledgeexchange.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateIndexingandPublicationRequest {
    @MetaField
    private String knowledgeexchangeid;

    @MetaField
    private String indexingandpublicationid;

    @MetaField(ref=true)
    private org.museframework.bian.knowledgeexchange.dto.bq.IndexingandPublication indexingandPublication;

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

    public void setIndexingandPublication(org.museframework.bian.knowledgeexchange.dto.bq.IndexingandPublication indexingandPublication) {
        this.indexingandPublication = indexingandPublication;
    }

    public org.museframework.bian.knowledgeexchange.dto.bq.IndexingandPublication getIndexingandPublication() {
        return indexingandPublication;
    }
}