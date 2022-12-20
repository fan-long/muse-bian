package org.museframework.bian.productdeployment.dto;

public class RetrieveServicingResponse {
    private org.museframework.bian.productdeployment.dto.bq.Servicing servicing;

    public void setServicing(org.museframework.bian.productdeployment.dto.bq.Servicing servicing) {
        this.servicing = servicing;
    }

    public org.museframework.bian.productdeployment.dto.bq.Servicing getServicing() {
        return servicing;
    }
}