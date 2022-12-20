package org.museframework.bian.regulatoryreporting.dto;

public class RetrieveAuthoringRequest {
    private String regulatoryreportingid;

    private String authoringid;

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
}