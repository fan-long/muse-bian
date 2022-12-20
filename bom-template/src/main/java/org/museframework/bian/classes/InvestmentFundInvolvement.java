/*Specifies each role linked to an investment fund and played by a party in that context.
https://www.iso20022.org/standardsrepository/type/InvestmentFundPartyRole*/
package org.museframework.bian.classes;

public class InvestmentFundInvolvement {
    /**/
    private org.museframework.bian.enumerations.Investmentfundinvolvementtypevalues investmentFundInvolvementType;

    public void setInvestmentFundInvolvementType(org.museframework.bian.enumerations.Investmentfundinvolvementtypevalues investmentFundInvolvementType) {
        this.investmentFundInvolvementType = investmentFundInvolvementType;
    }

    public org.museframework.bian.enumerations.Investmentfundinvolvementtypevalues getInvestmentFundInvolvementType() {
        return investmentFundInvolvementType;
    }
}