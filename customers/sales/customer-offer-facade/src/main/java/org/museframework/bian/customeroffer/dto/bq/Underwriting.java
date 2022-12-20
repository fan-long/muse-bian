/*Handles the booking of the asset or liability to the appropriate unit*/
package org.museframework.bian.customeroffer.dto.bq;

public class Underwriting extends org.museframework.bian.classes.Underwriting {
    /*A statement of income over a required duration in a suitable format*/
    private String customerIncomeStatement;

    /*The provided debt statements may combine bank and non-bank managed debt details*/
    private String customerDebtStatement;

    /*The provided asset statement may combine bank and known non-bank managed assets*/
    private String customerAssetStatement;

    /*The outcome of the underwriting assessment*/
    private org.museframework.bian.classes.Object underwritingAssessmentReference;

    public void setCustomerIncomeStatement(String customerIncomeStatement) {
        this.customerIncomeStatement = customerIncomeStatement;
    }

    public String getCustomerIncomeStatement() {
        return customerIncomeStatement;
    }

    public void setCustomerDebtStatement(String customerDebtStatement) {
        this.customerDebtStatement = customerDebtStatement;
    }

    public String getCustomerDebtStatement() {
        return customerDebtStatement;
    }

    public void setCustomerAssetStatement(String customerAssetStatement) {
        this.customerAssetStatement = customerAssetStatement;
    }

    public String getCustomerAssetStatement() {
        return customerAssetStatement;
    }

    public void setUnderwritingAssessmentReference(org.museframework.bian.classes.Object underwritingAssessmentReference) {
        this.underwritingAssessmentReference = underwritingAssessmentReference;
    }

    public org.museframework.bian.classes.Object getUnderwritingAssessmentReference() {
        return underwritingAssessmentReference;
    }
}