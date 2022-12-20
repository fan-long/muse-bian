/*Financial statements are a collection of summary-level reports about an organization's financial results, financial position, and cash flows. They include the income statement, balance sheet, and statement of cash flows.
https://www.accountingtools.com/articles/financial-statements*/
package org.museframework.bian.classes;

public class FinancialStatement {
    /**/
    private org.museframework.bian.enumerations.Financialstatementtypevalues financialStatementType;

    public void setFinancialStatementType(org.museframework.bian.enumerations.Financialstatementtypevalues financialStatementType) {
        this.financialStatementType = financialStatementType;
    }

    public org.museframework.bian.enumerations.Financialstatementtypevalues getFinancialStatementType() {
        return financialStatementType;
    }
}