package org.museframework.bian.knowledgeexchange.dto;

public class UpdateIndexingandPublicationRequest {
    private String knowledgeexchangeid;

    private String indexingandpublicationid;

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