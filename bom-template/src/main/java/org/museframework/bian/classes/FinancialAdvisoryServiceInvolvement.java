/*A role that is played by a party in a financial advisory service agreement/arrangement like:
- The customer receiving the financial advice
- The bank branch associated with the customer account/relationship for booking purposes
- Business unit and or employee reference to the source of the financial advice*/
package org.museframework.bian.classes;

public class FinancialAdvisoryServiceInvolvement {
    /**/
    private org.museframework.bian.enumerations.Financialadvisoryserviceinvolvementtypevalues financialAdvisoryServiceInvolvementType;

    public void setFinancialAdvisoryServiceInvolvementType(org.museframework.bian.enumerations.Financialadvisoryserviceinvolvementtypevalues financialAdvisoryServiceInvolvementType) {
        this.financialAdvisoryServiceInvolvementType = financialAdvisoryServiceInvolvementType;
    }

    public org.museframework.bian.enumerations.Financialadvisoryserviceinvolvementtypevalues getFinancialAdvisoryServiceInvolvementType() {
        return financialAdvisoryServiceInvolvementType;
    }
}