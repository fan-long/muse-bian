/**/
package org.museframework.bian.creditcard.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class CreditPlan {
    /*The type of credit plan (e.g. cash, credit, charge, balance transfer, promotions, securitized, etc.)*/
    @MetaField(0)
    private String creditPlanType;

    /*The range of terms applied to the pan (e.g. minimum payment, payment grace period, interest rate reference, installment plans, …)*/
    @MetaField(0)
    private String creditPlanTerms;

    /*Reference to the account where the credit plan is linked*/
    @MetaField(ref=true)
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