package org.museframework.bian.proinvdis.dto;

public class InitiateOversightRequest {
    private String productinventorydistributionid;

    private String oversightid;

    private org.museframework.bian.proinvdis.dto.bq.Oversight oversight;

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

    public void setOversight(org.museframework.bian.proinvdis.dto.bq.Oversight oversight) {
        this.oversight = oversight;
    }

    public org.museframework.bian.proinvdis.dto.bq.Oversight getOversight() {
        return oversight;
    }
}