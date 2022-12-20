/*The product features/services available with a financical facility*/
package org.museframework.bian.custaxhan.dto.bq;

public class Analysis extends org.museframework.bian.classes.Analysis {
    /*Work documentation, forms and schedules produced and referenced to develop the customer tax position/statement that is used for reporting*/
    private String customerTaxHandlingAnalysisWorkProducts;

    public void setCustomerTaxHandlingAnalysisWorkProducts(String customerTaxHandlingAnalysisWorkProducts) {
        this.customerTaxHandlingAnalysisWorkProducts = customerTaxHandlingAnalysisWorkProducts;
    }

    public String getCustomerTaxHandlingAnalysisWorkProducts() {
        return customerTaxHandlingAnalysisWorkProducts;
    }
}