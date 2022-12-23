/*The configuration and execution of Employee Payroll Details Maintenance Fulfillment arrangement within the Employee Payroll Details Maintenance Fulfillment*/
package org.museframework.bian.corpayser.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class CorporatePayrollServicesOutcome {
    /**/
    @MetaField(ref=true)
    private org.museframework.bian.classes.FinancialFacility corporatePayrollServicesFinancialFacility;

    /**/
    @MetaField
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