/*The configuration and execution of Employee Payroll Details Maintenance Fulfillment arrangement within the Employee Payroll Details Maintenance Fulfillment*/
package org.museframework.bian.corpayser.dto.bq;

public class CorporatePayrollServicesOutcome {
    /**/
    private org.museframework.bian.classes.FinancialFacility corporatePayrollServicesFinancialFacility;

    /**/
    private String corporatePayrollServicesWorkProduct;

    public void setCorporatePayrollServicesFinancialFacility(org.museframework.bian.classes.FinancialFacility corporatePayrollServicesFinancialFacility) {
        this.corporatePayrollServicesFinancialFacility = corporatePayrollServicesFinancialFacility;
    }

    public org.museframework.bian.classes.FinancialFacility getCorporatePayrollServicesFinancialFacility() {
        return corporatePayrollServicesFinancialFacility;
    }

    public void setCorporatePayrollServicesWorkProduct(String corporatePayrollServicesWorkProduct) {
        this.corporatePayrollServicesWorkProduct = corporatePayrollServicesWorkProduct;
    }

    public String getCorporatePayrollServicesWorkProduct() {
        return corporatePayrollServicesWorkProduct;
    }
}