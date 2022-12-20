package org.museframework.bian.concenope.dto;

public class RetrievePeakLoadRequest {
    private String contactcenteroperationsid;

    private String peakloadid;

    public void setContactcenteroperationsid(String contactcenteroperationsid) {
        this.contactcenteroperationsid = contactcenteroperationsid;
    }

    public String getContactcenteroperationsid() {
        return contactcenteroperationsid;
    }

    public void setPeakloadid(String peakloadid) {
        this.peakloadid = peakloadid;
    }

    public String getPeakloadid() {
        return peakloadid;
    }
}