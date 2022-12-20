/*The product features/services available with a financical facility*/
package org.museframework.bian.conadvser.dto.bq;

public class FinancialPlanning {
    /*Reference to the financial planning advisory service (used to access guidance materials)*/
    private org.museframework.bian.classes.Object productandServiceReference;

    /*Summary recommendations arising from the advice that is added to the consolidated record*/
    private String financialPlanningAdviceResult;

    public void setProductandServiceReference(org.museframework.bian.classes.Object productandServiceReference) {
        this.productandServiceReference = productandServiceReference;
    }

    public org.museframework.bian.classes.Object getProductandServiceReference() {
        return productandServiceReference;
    }

    public void setFinancialPlanningAdviceResult(String financialPlanningAdviceResult) {
        this.financialPlanningAdviceResult = financialPlanningAdviceResult;
    }

    public String getFinancialPlanningAdviceResult() {
        return financialPlanningAdviceResult;
    }
}