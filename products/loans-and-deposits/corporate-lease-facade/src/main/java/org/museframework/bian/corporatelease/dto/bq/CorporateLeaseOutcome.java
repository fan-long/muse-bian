/*Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility  within Corporate Lease. 
Example: Perform the scheduled (e.g. statements, standing orders) and ad-hoc/requested (e.g. balance inquiries, fund transfers) fulfillment tasks for a customer current account facility.*/
package org.museframework.bian.corporatelease.dto.bq;

public class CorporateLeaseOutcome {
    /**/
    private String corporateLeaseFinancialFacility;

    /**/
    private String corporateLeaseWorkProduct;

    public void setCorporateLeaseFinancialFacility(String corporateLeaseFinancialFacility) {
        this.corporateLeaseFinancialFacility = corporateLeaseFinancialFacility;
    }

    public String getCorporateLeaseFinancialFacility() {
        return corporateLeaseFinancialFacility;
    }

    public void setCorporateLeaseWorkProduct(String corporateLeaseWorkProduct) {
        this.corporateLeaseWorkProduct = corporateLeaseWorkProduct;
    }

    public String getCorporateLeaseWorkProduct() {
        return corporateLeaseWorkProduct;
    }
}