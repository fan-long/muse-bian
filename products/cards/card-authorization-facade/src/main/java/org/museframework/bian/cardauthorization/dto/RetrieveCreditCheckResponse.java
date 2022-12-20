package org.museframework.bian.cardauthorization.dto;

public class RetrieveCreditCheckResponse {
    private org.museframework.bian.cardauthorization.dto.bq.CreditCheck creditCheck;

    public void setCreditCheck(org.museframework.bian.cardauthorization.dto.bq.CreditCheck creditCheck) {
        this.creditCheck = creditCheck;
    }

    public org.museframework.bian.cardauthorization.dto.bq.CreditCheck getCreditCheck() {
        return creditCheck;
    }
}