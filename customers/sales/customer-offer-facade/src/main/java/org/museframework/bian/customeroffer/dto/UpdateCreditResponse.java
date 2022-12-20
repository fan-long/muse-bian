package org.museframework.bian.customeroffer.dto;

public class UpdateCreditResponse {
    private org.museframework.bian.customeroffer.dto.bq.Credit credit;

    public void setCredit(org.museframework.bian.customeroffer.dto.bq.Credit credit) {
        this.credit = credit;
    }

    public org.museframework.bian.customeroffer.dto.bq.Credit getCredit() {
        return credit;
    }
}