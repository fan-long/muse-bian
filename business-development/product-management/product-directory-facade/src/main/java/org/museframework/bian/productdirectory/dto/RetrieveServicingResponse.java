package org.museframework.bian.productdirectory.dto;

public class RetrieveServicingResponse {
    private org.museframework.bian.productdirectory.dto.bq.Servicing servicing;

    public void setServicing(org.museframework.bian.productdirectory.dto.bq.Servicing servicing) {
        this.servicing = servicing;
    }

    public org.museframework.bian.productdirectory.dto.bq.Servicing getServicing() {
        return servicing;
    }
}