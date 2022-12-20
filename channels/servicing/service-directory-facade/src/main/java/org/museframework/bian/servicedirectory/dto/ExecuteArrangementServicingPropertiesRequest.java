package org.museframework.bian.servicedirectory.dto;

public class ExecuteArrangementServicingPropertiesRequest {
    private String servicedirectoryid;

    private String arrangementservicingpropertiesid;

    private org.museframework.bian.servicedirectory.dto.bq.ArrangementServicingProperties arrangementServicingProperties;

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

    public void setArrangementServicingProperties(org.museframework.bian.servicedirectory.dto.bq.ArrangementServicingProperties arrangementServicingProperties) {
        this.arrangementServicingProperties = arrangementServicingProperties;
    }

    public org.museframework.bian.servicedirectory.dto.bq.ArrangementServicingProperties getArrangementServicingProperties() {
        return arrangementServicingProperties;
    }
}