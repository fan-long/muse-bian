/*The configuration and execution of Project Finance SPV Fulfillment arrangement within the Project Finance SPV Fulfillment*/
package org.museframework.bian.projectfinance.dto.bq;

public class ProjectFinanceOutcome {
    /**/
    private org.museframework.bian.classes.FinancialFacility projectFinanceFinancialFacility;

    /**/
    private String projectFinanceWorkProduct;

    public void setProjectFinanceFinancialFacility(org.museframework.bian.classes.FinancialFacility projectFinanceFinancialFacility) {
        this.projectFinanceFinancialFacility = projectFinanceFinancialFacility;
    }

    public org.museframework.bian.classes.FinancialFacility getProjectFinanceFinancialFacility() {
        return projectFinanceFinancialFacility;
    }

    public void setProjectFinanceWorkProduct(String projectFinanceWorkProduct) {
        this.projectFinanceWorkProduct = projectFinanceWorkProduct;
    }

    public String getProjectFinanceWorkProduct() {
        return projectFinanceWorkProduct;
    }
}