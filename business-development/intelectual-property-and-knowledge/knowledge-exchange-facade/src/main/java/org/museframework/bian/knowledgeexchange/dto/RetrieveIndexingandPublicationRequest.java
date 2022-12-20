package org.museframework.bian.knowledgeexchange.dto;

public class RetrieveIndexingandPublicationRequest {
    private String knowledgeexchangeid;

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