package org.museframework.bian.collections.dto;

public class RetrieveCollateralLiquidationRequest {
    private String collectionsid;

    private String collateralliquidationid;

    public void setCollectionsid(String collectionsid) {
        this.collectionsid = collectionsid;
    }

    public String getCollectionsid() {
        return collectionsid;
    }

    public void setCollateralliquidationid(String collateralliquidationid) {
        this.collateralliquidationid = collateralliquidationid;
    }

    public String getCollateralliquidationid() {
        return collateralliquidationid;
    }
}