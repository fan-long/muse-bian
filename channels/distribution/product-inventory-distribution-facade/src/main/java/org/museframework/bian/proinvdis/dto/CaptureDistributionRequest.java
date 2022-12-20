package org.museframework.bian.proinvdis.dto;

public class CaptureDistributionRequest {
    private String productinventorydistributionid;

    private String distributionid;

    private org.museframework.bian.proinvdis.dto.bq.Distribution distribution;

    public void setProductinventorydistributionid(String productinventorydistributionid) {
        this.productinventorydistributionid = productinventorydistributionid;
    }

    public String getProductinventorydistributionid() {
        return productinventorydistributionid;
    }

    public void setDistributionid(String distributionid) {
        this.distributionid = distributionid;
    }

    public String getDistributionid() {
        return distributionid;
    }

    public void setDistribution(org.museframework.bian.proinvdis.dto.bq.Distribution distribution) {
        this.distribution = distribution;
    }

    public org.museframework.bian.proinvdis.dto.bq.Distribution getDistribution() {
        return distribution;
    }
}