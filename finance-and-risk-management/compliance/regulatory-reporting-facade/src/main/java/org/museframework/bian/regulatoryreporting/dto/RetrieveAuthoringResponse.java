package org.museframework.bian.regulatoryreporting.dto;

public class RetrieveAuthoringResponse {
    private org.museframework.bian.regulatoryreporting.dto.bq.Authoring authoring;

    public void setAuthoring(org.museframework.bian.regulatoryreporting.dto.bq.Authoring authoring) {
        this.authoring = authoring;
    }

    public org.museframework.bian.regulatoryreporting.dto.bq.Authoring getAuthoring() {
        return authoring;
    }
}