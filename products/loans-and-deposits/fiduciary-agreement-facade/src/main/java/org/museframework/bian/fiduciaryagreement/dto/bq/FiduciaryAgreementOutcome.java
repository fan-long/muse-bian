/*Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility  within Fiduciary Agreement. 
Example: Perform the scheduled (e.g. statements, standing orders) and ad-hoc/requested (e.g. balance inquiries, fund transfers) fulfillment tasks for a customer current account facility.*/
package org.museframework.bian.fiduciaryagreement.dto.bq;

public class FiduciaryAgreementOutcome {
    /**/
    private String fiduciaryAgreementFinancialFacility;

    /**/
    private String fiduciaryAgreementWorkProduct;

    public void setFiduciaryAgreementFinancialFacility(String fiduciaryAgreementFinancialFacility) {
        this.fiduciaryAgreementFinancialFacility = fiduciaryAgreementFinancialFacility;
    }

    public String getFiduciaryAgreementFinancialFacility() {
        return fiduciaryAgreementFinancialFacility;
    }

    public void setFiduciaryAgreementWorkProduct(String fiduciaryAgreementWorkProduct) {
        this.fiduciaryAgreementWorkProduct = fiduciaryAgreementWorkProduct;
    }

    public String getFiduciaryAgreementWorkProduct() {
        return fiduciaryAgreementWorkProduct;
    }
}