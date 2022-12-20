package org.museframework.bian.servicingorder.dto;

public class RetrieveServicingOrderProcedureResponse {
    private org.museframework.bian.servicingorder.dto.cr.ServicingOrderProcedure servicingOrderProcedure;

    public void setServicingOrderProcedure(org.museframework.bian.servicingorder.dto.cr.ServicingOrderProcedure servicingOrderProcedure) {
        this.servicingOrderProcedure = servicingOrderProcedure;
    }

    public org.museframework.bian.servicingorder.dto.cr.ServicingOrderProcedure getServicingOrderProcedure() {
        return servicingOrderProcedure;
    }
}