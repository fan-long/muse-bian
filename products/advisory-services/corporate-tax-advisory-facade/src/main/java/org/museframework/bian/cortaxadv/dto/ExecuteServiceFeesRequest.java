package org.museframework.bian.cortaxadv.dto;

public class ExecuteServiceFeesRequest {
    private String corporatetaxadvisoryid;

    private String servicefeesid;

    private org.museframework.bian.cortaxadv.dto.bq.ServiceFees serviceFees;

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

    public void setServiceFees(org.museframework.bian.cortaxadv.dto.bq.ServiceFees serviceFees) {
        this.serviceFees = serviceFees;
    }

    public org.museframework.bian.cortaxadv.dto.bq.ServiceFees getServiceFees() {
        return serviceFees;
    }
}