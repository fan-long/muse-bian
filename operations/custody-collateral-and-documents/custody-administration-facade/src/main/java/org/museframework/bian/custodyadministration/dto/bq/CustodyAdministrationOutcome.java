/*Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility  within Custody Administration. 
Example: Perform the scheduled (e.g. statements, standing orders) and ad-hoc/requested (e.g. balance inquiries, fund transfers) fulfillment tasks for a customer current account facility.*/
package org.museframework.bian.custodyadministration.dto.bq;

public class CustodyAdministrationOutcome {
    /**/
    private String custodyAdministrationFinancialFacility;

    /**/
    private String custodyAdministrationWorkProduct;

    public void setCustodyAdministrationFinancialFacility(String custodyAdministrationFinancialFacility) {
        this.custodyAdministrationFinancialFacility = custodyAdministrationFinancialFacility;
    }

    public String getCustodyAdministrationFinancialFacility() {
        return custodyAdministrationFinancialFacility;
    }

    public void setCustodyAdministrationWorkProduct(String custodyAdministrationWorkProduct) {
        this.custodyAdministrationWorkProduct = custodyAdministrationWorkProduct;
    }

    public String getCustodyAdministrationWorkProduct() {
        return custodyAdministrationWorkProduct;
    }
}