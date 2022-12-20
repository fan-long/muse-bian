package org.museframework.bian.cusevehis.dto;

public class CaptureServicingRequest {
    private String customereventhistoryid;

    private String servicingid;

    private org.museframework.bian.cusevehis.dto.bq.Servicing servicing;

    public void setCustomereventhistoryid(String customereventhistoryid) {
        this.customereventhistoryid = customereventhistoryid;
    }

    public String getCustomereventhistoryid() {
        return customereventhistoryid;
    }

    public void setServicingid(String servicingid) {
        this.servicingid = servicingid;
    }

    public String getServicingid() {
        return servicingid;
    }

    public void setServicing(org.museframework.bian.cusevehis.dto.bq.Servicing servicing) {
        this.servicing = servicing;
    }

    public org.museframework.bian.cusevehis.dto.bq.Servicing getServicing() {
        return servicing;
    }
}