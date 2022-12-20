package org.museframework.bian.colassadm.dto;

public class RequestValuationRequest {
    private String collateralassetadministrationid;

    private String valuationid;

    private org.museframework.bian.colassadm.dto.bq.Valuation valuation;

    public void setCollateralassetadministrationid(String collateralassetadministrationid) {
        this.collateralassetadministrationid = collateralassetadministrationid;
    }

    public String getCollateralassetadministrationid() {
        return collateralassetadministrationid;
    }

    public void setValuationid(String valuationid) {
        this.valuationid = valuationid;
    }

    public String getValuationid() {
        return valuationid;
    }

    public void setValuation(org.museframework.bian.colassadm.dto.bq.Valuation valuation) {
        this.valuation = valuation;
    }

    public org.museframework.bian.colassadm.dto.bq.Valuation getValuation() {
        return valuation;
    }
}