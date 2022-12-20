/*Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility within Investment Portfolio Management. */
package org.museframework.bian.invporman.dto.cr;

public class ManagedInvestmentPortfolioFacility {
    /*Interpretation of the investment portfolio policies as they impact securities selection and investment decisioning*/
    private String investmentPortfolioTradingPolicies;

    /*The type of policy applied to the portfolio (e.g. risk appetite, allowed sectors/instrument types, timeframes)*/
    private String investmentPortfolioPolicyType;

    /*A narrative explaining the interpretation of the portfolio policies as they govern trading decisions*/
    private String investmentPortfolioPolicyDescription;

    /*Specific trading constraints (e.g. stocks or sectors that are out of bounds and acceptable risk levels)*/
    private String investmentPortfolioPolicyLimitsandConstraints;

    /*Reference to the investment portfolio record of all holdings*/
    private org.museframework.bian.classes.Object investmentPortfolioInstanceReference;

    /*Maintains the current security holdings*/
    private String investmentPortfolioHoldings;

    /*The type of security held in the portfolio*/
    private String investmentPortfolioSecurityType;

    /*Record of past and projected and current holding for the security*/
    private String investmentPortfolioSecurityHolding;

    public void setInvestmentPortfolioTradingPolicies(String investmentPortfolioTradingPolicies) {
        this.investmentPortfolioTradingPolicies = investmentPortfolioTradingPolicies;
    }

    public String getInvestmentPortfolioTradingPolicies() {
        return investmentPortfolioTradingPolicies;
    }

    public void setInvestmentPortfolioPolicyType(String investmentPortfolioPolicyType) {
        this.investmentPortfolioPolicyType = investmentPortfolioPolicyType;
    }

    public String getInvestmentPortfolioPolicyType() {
        return investmentPortfolioPolicyType;
    }

    public void setInvestmentPortfolioPolicyDescription(String investmentPortfolioPolicyDescription) {
        this.investmentPortfolioPolicyDescription = investmentPortfolioPolicyDescription;
    }

    public String getInvestmentPortfolioPolicyDescription() {
        return investmentPortfolioPolicyDescription;
    }

    public void setInvestmentPortfolioPolicyLimitsandConstraints(String investmentPortfolioPolicyLimitsandConstraints) {
        this.investmentPortfolioPolicyLimitsandConstraints = investmentPortfolioPolicyLimitsandConstraints;
    }

    public String getInvestmentPortfolioPolicyLimitsandConstraints() {
        return investmentPortfolioPolicyLimitsandConstraints;
    }

    public void setInvestmentPortfolioInstanceReference(org.museframework.bian.classes.Object investmentPortfolioInstanceReference) {
        this.investmentPortfolioInstanceReference = investmentPortfolioInstanceReference;
    }

    public org.museframework.bian.classes.Object getInvestmentPortfolioInstanceReference() {
        return investmentPortfolioInstanceReference;
    }

    public void setInvestmentPortfolioHoldings(String investmentPortfolioHoldings) {
        this.investmentPortfolioHoldings = investmentPortfolioHoldings;
    }

    public String getInvestmentPortfolioHoldings() {
        return investmentPortfolioHoldings;
    }

    public void setInvestmentPortfolioSecurityType(String investmentPortfolioSecurityType) {
        this.investmentPortfolioSecurityType = investmentPortfolioSecurityType;
    }

    public String getInvestmentPortfolioSecurityType() {
        return investmentPortfolioSecurityType;
    }

    public void setInvestmentPortfolioSecurityHolding(String investmentPortfolioSecurityHolding) {
        this.investmentPortfolioSecurityHolding = investmentPortfolioSecurityHolding;
    }

    public String getInvestmentPortfolioSecurityHolding() {
        return investmentPortfolioSecurityHolding;
    }
}