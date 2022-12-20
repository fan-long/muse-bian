/*An advisory service that supports 
1) consumer customers by providing financial advice and recommendations for product selection, investments, tax optimization etc.
2) institutional and corporate customers by providing a broad range of fee or commission based specialized financing advisory services (both tactical and strategic in nature).*/
package org.museframework.bian.classes;

public class FinancialAdvisoryService {
    /**/
    private org.museframework.bian.enumerations.Financialadvisoryservicetypevalues financialAdvisoryServiceType;

    public void setFinancialAdvisoryServiceType(org.museframework.bian.enumerations.Financialadvisoryservicetypevalues financialAdvisoryServiceType) {
        this.financialAdvisoryServiceType = financialAdvisoryServiceType;
    }

    public org.museframework.bian.enumerations.Financialadvisoryservicetypevalues getFinancialAdvisoryServiceType() {
        return financialAdvisoryServiceType;
    }
}