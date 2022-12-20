package org.museframework.bian.custodyadministration.dto;

public class RetrieveSafeKeepingResponse {
    private org.museframework.bian.custodyadministration.dto.bq.SafeKeeping safeKeeping;

    public void setSafeKeeping(org.museframework.bian.custodyadministration.dto.bq.SafeKeeping safeKeeping) {
        this.safeKeeping = safeKeeping;
    }

    public org.museframework.bian.custodyadministration.dto.bq.SafeKeeping getSafeKeeping() {
        return safeKeeping;
    }
}