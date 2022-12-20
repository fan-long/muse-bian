package org.museframework.bian.custodyadministration.dto;

public class RetrieveSafeKeepingRequest {
    private String custodyadministrationid;

    private String safekeepingid;

    public void setCustodyadministrationid(String custodyadministrationid) {
        this.custodyadministrationid = custodyadministrationid;
    }

    public String getCustodyadministrationid() {
        return custodyadministrationid;
    }

    public void setSafekeepingid(String safekeepingid) {
        this.safekeepingid = safekeepingid;
    }

    public String getSafekeepingid() {
        return safekeepingid;
    }
}