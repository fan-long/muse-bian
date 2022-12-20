package org.museframework.bian.regulatoryreporting.dto;

public class CaptureAuthoringRequest {
    private String regulatoryreportingid;

    private String authoringid;

    private org.museframework.bian.regulatoryreporting.dto.bq.Authoring authoring;

    public void setRegulatoryreportingid(String regulatoryreportingid) {
        this.regulatoryreportingid = regulatoryreportingid;
    }

    public String getRegulatoryreportingid() {
        return regulatoryreportingid;
    }

    public void setAuthoringid(String authoringid) {
        this.authoringid = authoringid;
    }

    public String getAuthoringid() {
        return authoringid;
    }

    public void setAuthoring(org.museframework.bian.regulatoryreporting.dto.bq.Authoring authoring) {
        this.authoring = authoring;
    }

    public org.museframework.bian.regulatoryreporting.dto.bq.Authoring getAuthoring() {
        return authoring;
    }
}