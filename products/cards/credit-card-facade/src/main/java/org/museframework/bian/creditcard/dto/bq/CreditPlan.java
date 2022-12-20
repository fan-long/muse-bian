/**/
package org.museframework.bian.creditcard.dto.bq;

public class CreditPlan {
    /*The type of credit plan (e.g. cash, credit, charge, balance transfer, promotions, securitized, etc.)*/
    private String creditPlanType;

    /*The range of terms applied to the pan (e.g. minimum payment, payment grace period, interest rate reference, installment plans, …)*/
    private String creditPlanTerms;

    /*Reference to the account where the credit plan is linked*/
    private org.museframework.bian.classes.Object creditPlanAccountReference;

    public void setCreditPlanType(String creditPlanType) {
        this.creditPlanType = creditPlanType;
    }

    public String getCreditPlanType() {
        return creditPlanType;
    }

    public void setCreditPlanTerms(String creditPlanTerms) {
        this.creditPlanTerms = creditPlanTerms;
    }

    public String getCreditPlanTerms() {
        return creditPlanTerms;
    }

    public void setCreditPlanAccountReference(org.museframework.bian.classes.Object creditPlanAccountReference) {
        this.creditPlanAccountReference = creditPlanAccountReference;
    }

    public org.museframework.bian.classes.Object getCreditPlanAccountReference() {
        return creditPlanAccountReference;
    }
}