/*A collection of terms (within some jurisdiction) that can be selected and configured to define a contract /agreement

Examples: Required disclosures*/
package org.museframework.bian.invporpla.dto.bq;

public class InvestmentTerms {
    /*The type of term (e.g. risk appetite, forbidden securities/sectors)*/
    private String investmentPortfolioAgreementTermType;

    /*Description of the term defining how it is to be interpreted, applicable for behavioral controls (e.g. limit of exposure to a segment property or level of risk)*/
    private String investmentPortfolioAgreementTermDescription;

    /*One or more specific constraint parameters that calibrate the term, applicable for position constraints (e.g. the specific percentage limit of holdings by value that can be applied to a type of security)*/
    private String investmentPortfolioAgreementTermConstraints;

    public void setInvestmentPortfolioAgreementTermType(String investmentPortfolioAgreementTermType) {
        this.investmentPortfolioAgreementTermType = investmentPortfolioAgreementTermType;
    }

    public String getInvestmentPortfolioAgreementTermType() {
        return investmentPortfolioAgreementTermType;
    }

    public void setInvestmentPortfolioAgreementTermDescription(String investmentPortfolioAgreementTermDescription) {
        this.investmentPortfolioAgreementTermDescription = investmentPortfolioAgreementTermDescription;
    }

    public String getInvestmentPortfolioAgreementTermDescription() {
        return investmentPortfolioAgreementTermDescription;
    }

    public void setInvestmentPortfolioAgreementTermConstraints(String investmentPortfolioAgreementTermConstraints) {
        this.investmentPortfolioAgreementTermConstraints = investmentPortfolioAgreementTermConstraints;
    }

    public String getInvestmentPortfolioAgreementTermConstraints() {
        return investmentPortfolioAgreementTermConstraints;
    }
}