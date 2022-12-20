package org.museframework.bian.servicedirectory.dto;

public class RetrieveArrangementServicingPropertiesRequest {
    private String servicedirectoryid;

    private String arrangementservicingpropertiesid;

    public void setServicedirectoryid(String servicedirectoryid) {
        this.servicedirectoryid = servicedirectoryid;
    }

    public String getServicedirectoryid() {
        return servicedirectoryid;
    }

    public void setArrangementservicingpropertiesid(String arrangementservicingpropertiesid) {
        this.arrangementservicingpropertiesid = arrangementservicingpropertiesid;
    }

    public String getArrangementservicingpropertiesid() {
        return arrangementservicingpropertiesid;
    }
}