package org.museframework.bian.merchandisingloan.dto;

public class RequestCollateralRequest {
    private String merchandisingloanid;

    private String collateralid;

    private org.museframework.bian.merchandisingloan.dto.bq.Collateral collateral;

    public void setMerchandisingloanid(String merchandisingloanid) {
        this.merchandisingloanid = merchandisingloanid;
    }

    public String getMerchandisingloanid() {
        return merchandisingloanid;
    }

    public void setCollateralid(String collateralid) {
        this.collateralid = collateralid;
    }

    public String getCollateralid() {
        return collateralid;
    }

    public void setCollateral(org.museframework.bian.merchandisingloan.dto.bq.Collateral collateral) {
        this.collateral = collateral;
    }

    public org.museframework.bian.merchandisingloan.dto.bq.Collateral getCollateral() {
        return collateral;
    }
}