/*A collection of models/calculations/algoritms that can be applied to a subject or activity

Examples: Average balance calculation, Propensity to buy*/
package org.museframework.bian.invporana.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class PerformanceAnalysis {
    /*Defines the type of analysis/algorithm used to evaluate and compare the investment portfolio performance to prevailing market measures*/
    @MetaField(0)
    private String investmentPortfolioPerformanceAnalysisType;

    /*Record of a task to perform a selected type of performance analysis on an investment portfolio*/
    @MetaField(0)
    private String investmentPortfolioPerformanceAnalysisTask;

    /*The specific details of the performance analysis (can be a default/standard analysis or a specialist/ad-hoc request)*/
    @MetaField(0)
    private String investmentPerformanceRequestSpecification;

    /*Reference to the performance analysis model used*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object investmentPerformanceModelReference;

    /*The data file, report of investment transaction details used in the analysis*/
    @MetaField(0)
    private String investmentPerformanceProductandServiceActivityReport;

    /*The content of selected financial market research report or market transaction database in any suitable form used for comparisons*/
    @MetaField(0)
    private String investmentPerformanceFinancialMarketResearchReport;

    /*Work documentation, forms and schedules produced and referenced during the analysis*/
    @MetaField(0)
    private String investmentPerformanceWorkProducts;

    /*The output from executing the selected performance analysis*/
    @MetaField(0)
    private String investmentPerformanceRequestResult;

    public void setInvestmentPortfolioPerformanceAnalysisType(String investmentPortfolioPerformanceAnalysisType) {
        this.investmentPortfolioPerformanceAnalysisType = investmentPortfolioPerformanceAnalysisType;
    }

    public String getInvestmentPortfolioPerformanceAnalysisType() {
        return investmentPortfolioPerformanceAnalysisType;
    }

    public void setInvestmentPortfolioPerformanceAnalysisTask(String investmentPortfolioPerformanceAnalysisTask) {
        this.investmentPortfolioPerformanceAnalysisTask = investmentPortfolioPerformanceAnalysisTask;
    }

    public String getInvestmentPortfolioPerformanceAnalysisTask() {
        return investmentPortfolioPerformanceAnalysisTask;
    }

    public void setInvestmentPerformanceRequestSpecification(String investmentPerformanceRequestSpecification) {
        this.investmentPerformanceRequestSpecification = investmentPerformanceRequestSpecification;
    }

    public String getInvestmentPerformanceRequestSpecification() {
        return investmentPerformanceRequestSpecification;
    }

    public void setInvestmentPerformanceModelReference(org.museframework.bian.classes.Object investmentPerformanceModelReference) {
        this.investmentPerformanceModelReference = investmentPerformanceModelReference;
    }

    public org.museframework.bian.classes.Object getInvestmentPerformanceModelReference() {
        return investmentPerformanceModelReference;
    }

    public void setInvestmentPerformanceProductandServiceActivityReport(String investmentPerformanceProductandServiceActivityReport) {
        this.investmentPerformanceProductandServiceActivityReport = investmentPerformanceProductandServiceActivityReport;
    }

    public String getInvestmentPerformanceProductandServiceActivityReport() {
        return investmentPerformanceProductandServiceActivityReport;
    }

    public void setInvestmentPerformanceFinancialMarketResearchReport(String investmentPerformanceFinancialMarketResearchReport) {
        this.investmentPerformanceFinancialMarketResearchReport = investmentPerformanceFinancialMarketResearchReport;
    }

    public String getInvestmentPerformanceFinancialMarketResearchReport() {
        return investmentPerformanceFinancialMarketResearchReport;
    }

    public void setInvestmentPerformanceWorkProducts(String investmentPerformanceWorkProducts) {
        this.investmentPerformanceWorkProducts = investmentPerformanceWorkProducts;
    }

    public String getInvestmentPerformanceWorkProducts() {
        return investmentPerformanceWorkProducts;
    }

    public void setInvestmentPerformanceRequestResult(String investmentPerformanceRequestResult) {
        this.investmentPerformanceRequestResult = investmentPerformanceRequestResult;
    }

    public String getInvestmentPerformanceRequestResult() {
        return investmentPerformanceRequestResult;
    }
}