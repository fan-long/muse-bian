package org.museframework.bian.leaiteadm.dto;

public class UpdateValuationRequest {
    private String leasingitemadministrationid;

    private String valuationid;

    private org.museframework.bian.leaiteadm.dto.bq.Valuation valuation;

    public void setLeasingitemadministrationid(String leasingitemadministrationid) {
        this.leasingitemadministrationid = leasingitemadministrationid;
    }

    public String getLeasingitemadministrationid() {
        return leasingitemadministrationid;
    }

    public void setValuationid(String valuationid) {
        this.valuationid = valuationid;
    }

    public String getValuationid() {
        return valuationid;
    }

    public void setValuation(org.museframework.bian.leaiteadm.dto.bq.Valuation valuation) {
        this.valuation = valuation;
    }

    public org.museframework.bian.leaiteadm.dto.bq.Valuation getValuation() {
        return valuation;
    }
}