/*An evaluation of the investment profile including performance analysis, sensitivity analysis, valuation and etc. 

The process of studying an investment portfolio to determine its appropriateness for a given investor's needs, preferences, and resources.
http://www.newbore-wealth.com/investment-portfolio-analysis/

*/
package org.museframework.bian.classes;

public class InvestmentPortfolioAnalysis {
    /**/
    private org.museframework.bian.enumerations.Investmentportfolioanalysistypevalues investmentPortfolioAnalysisType;

    public void setInvestmentPortfolioAnalysisType(org.museframework.bian.enumerations.Investmentportfolioanalysistypevalues investmentPortfolioAnalysisType) {
        this.investmentPortfolioAnalysisType = investmentPortfolioAnalysisType;
    }

    public org.museframework.bian.enumerations.Investmentportfolioanalysistypevalues getInvestmentPortfolioAnalysisType() {
        return investmentPortfolioAnalysisType;
    }
}