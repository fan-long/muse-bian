package org.museframework.bian.concenope.dto;

public class RequestPeakLoadRequest {
    private String contactcenteroperationsid;

    private String peakloadid;

    private org.museframework.bian.concenope.dto.bq.PeakLoad peakLoad;

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

    public void setPeakLoad(org.museframework.bian.concenope.dto.bq.PeakLoad peakLoad) {
        this.peakLoad = peakLoad;
    }

    public org.museframework.bian.concenope.dto.bq.PeakLoad getPeakLoad() {
        return peakLoad;
    }
}