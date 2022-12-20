package org.museframework.bian.regulatoryreporting.dto;

public class UpdateEnquiriesResponse {
    private org.museframework.bian.regulatoryreporting.dto.bq.Enquiries enquiries;

    public void setEnquiries(org.museframework.bian.regulatoryreporting.dto.bq.Enquiries enquiries) {
        this.enquiries = enquiries;
    }

    public org.museframework.bian.regulatoryreporting.dto.bq.Enquiries getEnquiries() {
        return enquiries;
    }
}