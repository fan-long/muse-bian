package org.museframework.bian.servicingissue.dto;

public class InitiateServicingIssueProcedureRequest {
    private org.museframework.bian.servicingissue.dto.cr.ServicingIssueProcedure servicingIssueProcedure;

    public void setServicingIssueProcedure(org.museframework.bian.servicingissue.dto.cr.ServicingIssueProcedure servicingIssueProcedure) {
        this.servicingIssueProcedure = servicingIssueProcedure;
    }

    public org.museframework.bian.servicingissue.dto.cr.ServicingIssueProcedure getServicingIssueProcedure() {
        return servicingIssueProcedure;
    }
}