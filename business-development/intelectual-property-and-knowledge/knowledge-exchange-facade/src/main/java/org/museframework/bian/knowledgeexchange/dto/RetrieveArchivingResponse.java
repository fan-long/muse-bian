package org.museframework.bian.knowledgeexchange.dto;

public class RetrieveArchivingResponse {
    private org.museframework.bian.knowledgeexchange.dto.bq.Archiving archiving;

    public void setArchiving(org.museframework.bian.knowledgeexchange.dto.bq.Archiving archiving) {
        this.archiving = archiving;
    }

    public org.museframework.bian.knowledgeexchange.dto.bq.Archiving getArchiving() {
        return archiving;
    }
}