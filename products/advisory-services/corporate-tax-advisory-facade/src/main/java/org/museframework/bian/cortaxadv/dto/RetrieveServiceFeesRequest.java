package org.museframework.bian.cortaxadv.dto;

public class RetrieveServiceFeesRequest {
    private String corporatetaxadvisoryid;

    private String servicefeesid;

    public void setCorporatetaxadvisoryid(String corporatetaxadvisoryid) {
        this.corporatetaxadvisoryid = corporatetaxadvisoryid;
    }

    public String getCorporatetaxadvisoryid() {
        return corporatetaxadvisoryid;
    }

    public void setServicefeesid(String servicefeesid) {
        this.servicefeesid = servicefeesid;
    }

    public String getServicefeesid() {
        return servicefeesid;
    }
}