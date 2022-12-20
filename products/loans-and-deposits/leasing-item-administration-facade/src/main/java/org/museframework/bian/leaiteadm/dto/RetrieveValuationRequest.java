package org.museframework.bian.leaiteadm.dto;

public class RetrieveValuationRequest {
    private String leasingitemadministrationid;

    private String valuationid;

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
}