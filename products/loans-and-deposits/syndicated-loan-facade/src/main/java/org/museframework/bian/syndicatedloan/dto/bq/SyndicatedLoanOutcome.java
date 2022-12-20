/*Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility  within Syndicated Loan. 
Example: Perform the scheduled (e.g. statements, standing orders) and ad-hoc/requested (e.g. balance inquiries, fund transfers) fulfillment tasks for a customer current account facility.*/
package org.museframework.bian.syndicatedloan.dto.bq;

public class SyndicatedLoanOutcome {
    /**/
    private String syndicatedLoanFinancialFacility;

    /**/
    private String syndicatedLoanWorkProduct;

    public void setSyndicatedLoanFinancialFacility(String syndicatedLoanFinancialFacility) {
        this.syndicatedLoanFinancialFacility = syndicatedLoanFinancialFacility;
    }

    public String getSyndicatedLoanFinancialFacility() {
        return syndicatedLoanFinancialFacility;
    }

    public void setSyndicatedLoanWorkProduct(String syndicatedLoanWorkProduct) {
        this.syndicatedLoanWorkProduct = syndicatedLoanWorkProduct;
    }

    public String getSyndicatedLoanWorkProduct() {
        return syndicatedLoanWorkProduct;
    }
}