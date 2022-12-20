package org.museframework.bian.proinvdis.dto;

public class RetrieveOversightRequest {
    private String productinventorydistributionid;

    private String oversightid;

    public void setProductinventorydistributionid(String productinventorydistributionid) {
        this.productinventorydistributionid = productinventorydistributionid;
    }

    public String getProductinventorydistributionid() {
        return productinventorydistributionid;
    }

    public void setOversightid(String oversightid) {
        this.oversightid = oversightid;
    }

    public String getOversightid() {
        return oversightid;
    }
}