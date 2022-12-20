package org.museframework.bian.custodyadministration.dto;

public class UpdateSafeKeepingRequest {
    private String custodyadministrationid;

    private String safekeepingid;

    private org.museframework.bian.custodyadministration.dto.bq.SafeKeeping safeKeeping;

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

    public void setSafeKeeping(org.museframework.bian.custodyadministration.dto.bq.SafeKeeping safeKeeping) {
        this.safeKeeping = safeKeeping;
    }

    public org.museframework.bian.custodyadministration.dto.bq.SafeKeeping getSafeKeeping() {
        return safeKeeping;
    }
}