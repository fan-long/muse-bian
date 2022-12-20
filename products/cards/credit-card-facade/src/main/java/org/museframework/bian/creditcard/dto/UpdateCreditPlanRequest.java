package org.museframework.bian.creditcard.dto;

public class UpdateCreditPlanRequest {
    private String creditcardid;

    private String creditplanid;

    private org.museframework.bian.creditcard.dto.bq.CreditPlan creditPlan;

    public void setCreditcardid(String creditcardid) {
        this.creditcardid = creditcardid;
    }

    public String getCreditcardid() {
        return creditcardid;
    }

    public void setCreditplanid(String creditplanid) {
        this.creditplanid = creditplanid;
    }

    public String getCreditplanid() {
        return creditplanid;
    }

    public void setCreditPlan(org.museframework.bian.creditcard.dto.bq.CreditPlan creditPlan) {
        this.creditPlan = creditPlan;
    }

    public org.museframework.bian.creditcard.dto.bq.CreditPlan getCreditPlan() {
        return creditPlan;
    }
}