package org.museframework.bian.customerposition.dto;

public class CaptureCollateralRequest {
    private String customerpositionid;

    private String collateralid;

    private org.museframework.bian.customerposition.dto.bq.Collateral collateral;

    public void setCustomerpositionid(String customerpositionid) {
        this.customerpositionid = customerpositionid;
    }

    public String getCustomerpositionid() {
        return customerpositionid;
    }

    public void setCollateralid(String collateralid) {
        this.collateralid = collateralid;
    }

    public String getCollateralid() {
        return collateralid;
    }

    public void setCollateral(org.museframework.bian.customerposition.dto.bq.Collateral collateral) {
        this.collateral = collateral;
    }

    public org.museframework.bian.customerposition.dto.bq.Collateral getCollateral() {
        return collateral;
    }
}