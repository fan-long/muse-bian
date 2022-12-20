package org.museframework.bian.servicingorder.dto;

public class RequestServicingOrderProcedureRequest {
    private String servicingorderid;

    private org.museframework.bian.servicingorder.dto.cr.ServicingOrderProcedure servicingOrderProcedure;

    public void setServicingorderid(String servicingorderid) {
        this.servicingorderid = servicingorderid;
    }

    public String getServicingorderid() {
        return servicingorderid;
    }

    public void setServicingOrderProcedure(org.museframework.bian.servicingorder.dto.cr.ServicingOrderProcedure servicingOrderProcedure) {
        this.servicingOrderProcedure = servicingOrderProcedure;
    }

    public org.museframework.bian.servicingorder.dto.cr.ServicingOrderProcedure getServicingOrderProcedure() {
        return servicingOrderProcedure;
    }
}