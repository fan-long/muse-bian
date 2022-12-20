package org.museframework.bian.regulatoryreporting.dto;

public class RetrieveEnquiriesRequest {
    private String regulatoryreportingid;

    private String enquiriesid;

    public void setRegulatoryreportingid(String regulatoryreportingid) {
        this.regulatoryreportingid = regulatoryreportingid;
    }

    public String getRegulatoryreportingid() {
        return regulatoryreportingid;
    }

    public void setEnquiriesid(String enquiriesid) {
        this.enquiriesid = enquiriesid;
    }

    public String getEnquiriesid() {
        return enquiriesid;
    }
}