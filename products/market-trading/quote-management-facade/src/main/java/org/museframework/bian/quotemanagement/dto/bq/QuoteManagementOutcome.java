/*A course of action for doing Market Quote Request Workstep in the context of executing the Market Quote Request Workstep*/
package org.museframework.bian.quotemanagement.dto.bq;

public class QuoteManagementOutcome {
    /**/
    private String quoteManagementWorkProduct;

    /**/
    private org.museframework.bian.classes.Procedure quoteManagementProcedure;

    public void setQuoteManagementWorkProduct(String quoteManagementWorkProduct) {
        this.quoteManagementWorkProduct = quoteManagementWorkProduct;
    }

    public String getQuoteManagementWorkProduct() {
        return quoteManagementWorkProduct;
    }

    public void setQuoteManagementProcedure(org.museframework.bian.classes.Procedure quoteManagementProcedure) {
        this.quoteManagementProcedure = quoteManagementProcedure;
    }

    public org.museframework.bian.classes.Procedure getQuoteManagementProcedure() {
        return quoteManagementProcedure;
    }
}