/*Handles the booking of the asset or liability to the appropriate unit*/
package org.museframework.bian.customeroffer.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

//refer to BOClass org.museframework.bian.classes.Underwriting
@MetaDto
public class Underwriting {
    /*A statement of income over a required duration in a suitable format*/
    @MetaField(0)
    private String customerIncomeStatement;

    /*The provided debt statements may combine bank and non-bank managed debt details*/
    @MetaField(0)
    private String customerDebtStatement;

    /*The provided asset statement may combine bank and known non-bank managed assets*/
    @MetaField(0)
    private String customerAssetStatement;

    /*The outcome of the underwriting assessment*/
    @MetaField(ref=true)
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