package org.museframework.bian.regulatoryreporting.dto;

public class CaptureEnquiriesRequest {
    private String regulatoryreportingid;

    private String enquiriesid;

    private org.museframework.bian.regulatoryreporting.dto.bq.Enquiries enquiries;

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

    public void setEnquiries(org.museframework.bian.regulatoryreporting.dto.bq.Enquiries enquiries) {
        this.enquiries = enquiries;
    }

    public org.museframework.bian.regulatoryreporting.dto.bq.Enquiries getEnquiries() {
        return enquiries;
    }
}