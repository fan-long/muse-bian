/*A course of action for doing Asset Valuation Workstep in the context of executing the Asset Valuation Workstep*/
package org.museframework.bian.fininsval.dto.bq;

public class FinancialInstrumentValuationOutcome {
    /**/
    private String financialInstrumentValuationWorkProduct;

    /**/
    private org.museframework.bian.classes.Procedure financialInstrumentValuationProcedure;

    public void setFinancialInstrumentValuationWorkProduct(String financialInstrumentValuationWorkProduct) {
        this.financialInstrumentValuationWorkProduct = financialInstrumentValuationWorkProduct;
    }

    public String getFinancialInstrumentValuationWorkProduct() {
        return financialInstrumentValuationWorkProduct;
    }

    public void setFinancialInstrumentValuationProcedure(org.museframework.bian.classes.Procedure financialInstrumentValuationProcedure) {
        this.financialInstrumentValuationProcedure = financialInstrumentValuationProcedure;
    }

    public org.museframework.bian.classes.Procedure getFinancialInstrumentValuationProcedure() {
        return financialInstrumentValuationProcedure;
    }
}