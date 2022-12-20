package org.museframework.bian.customerposition.dto;

public class CaptureCreditResponse {
    private org.museframework.bian.customerposition.dto.bq.Credit credit;

    public void setCredit(org.museframework.bian.customerposition.dto.bq.Credit credit) {
        this.credit = credit;
    }

    public org.museframework.bian.customerposition.dto.bq.Credit getCredit() {
        return credit;
    }
}