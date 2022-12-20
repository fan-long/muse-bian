package org.museframework.bian.customerposition.dto;

public class RetrieveCollateralRequest {
    private String customerpositionid;

    private String collateralid;

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
}