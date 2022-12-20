package org.museframework.bian.servicingissue.dto;

public class RequestServicingIssueProcedureRequest {
    private String servicingissueid;

    private org.museframework.bian.servicingissue.dto.cr.ServicingIssueProcedure servicingIssueProcedure;

    public void setServicingissueid(String servicingissueid) {
        this.servicingissueid = servicingissueid;
    }

    public String getServicingissueid() {
        return servicingissueid;
    }

    public void setServicingIssueProcedure(org.museframework.bian.servicingissue.dto.cr.ServicingIssueProcedure servicingIssueProcedure) {
        this.servicingIssueProcedure = servicingIssueProcedure;
    }

    public org.museframework.bian.servicingissue.dto.cr.ServicingIssueProcedure getServicingIssueProcedure() {
        return servicingIssueProcedure;
    }
}