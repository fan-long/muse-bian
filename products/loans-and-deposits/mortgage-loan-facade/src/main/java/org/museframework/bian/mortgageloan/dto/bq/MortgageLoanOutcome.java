/**/
package org.museframework.bian.mortgageloan.dto.bq;

public class MortgageLoanOutcome {
    /**/
    private String mortgageLoanFinancialFacility;

    /**/
    private String mortgageLoanWorkProduct;

    public void setMortgageLoanFinancialFacility(String mortgageLoanFinancialFacility) {
        this.mortgageLoanFinancialFacility = mortgageLoanFinancialFacility;
    }

    public String getMortgageLoanFinancialFacility() {
        return mortgageLoanFinancialFacility;
    }

    public void setMortgageLoanWorkProduct(String mortgageLoanWorkProduct) {
        this.mortgageLoanWorkProduct = mortgageLoanWorkProduct;
    }

    public String getMortgageLoanWorkProduct() {
        return mortgageLoanWorkProduct;
    }
}