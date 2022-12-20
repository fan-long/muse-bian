package org.museframework.bian.knowledgeexchange.dto;

public class RetrieveArchivingRequest {
    private String knowledgeexchangeid;

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