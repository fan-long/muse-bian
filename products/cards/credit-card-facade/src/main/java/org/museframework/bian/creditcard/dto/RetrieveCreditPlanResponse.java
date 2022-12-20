package org.museframework.bian.creditcard.dto;

public class RetrieveCreditPlanResponse {
    private org.museframework.bian.creditcard.dto.bq.CreditPlan creditPlan;

    public void setCreditPlan(org.museframework.bian.creditcard.dto.bq.CreditPlan creditPlan) {
        this.creditPlan = creditPlan;
    }

    public org.museframework.bian.creditcard.dto.bq.CreditPlan getCreditPlan() {
        return creditPlan;
    }
}