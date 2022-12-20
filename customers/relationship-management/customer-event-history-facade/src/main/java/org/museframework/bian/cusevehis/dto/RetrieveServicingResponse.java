package org.museframework.bian.cusevehis.dto;

public class RetrieveServicingResponse {
    private org.museframework.bian.cusevehis.dto.bq.Servicing servicing;

    public void setServicing(org.museframework.bian.cusevehis.dto.bq.Servicing servicing) {
        this.servicing = servicing;
    }

    public org.museframework.bian.cusevehis.dto.bq.Servicing getServicing() {
        return servicing;
    }
}