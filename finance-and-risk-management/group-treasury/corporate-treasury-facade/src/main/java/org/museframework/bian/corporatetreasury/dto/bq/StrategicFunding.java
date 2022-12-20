/*A collection of one or more responsibilities or tasks under management

Examples: Relationship development, Troubleshooting*/
package org.museframework.bian.corporatetreasury.dto.bq;

public class StrategicFunding {
    /*Financial reports from multiple business units*/
    private String financialPerformanceandBalanceSheetProjections;

    /*Details of equity and debt transactions*/
    private String ECMAndDCMMarketTransactions;

    /*Details of major investment/divestment transactions*/
    private String strategicInvestmentHoldingsTransactions;

    /*Summary details and analysis of the balance sheet relevant to longer term planning*/
    private String enterpriseBalanceSheetPositions;

    /*Description of a response initiated by corporate treasury*/
    private String strategicFundingResolutionTask;

    public void setFinancialPerformanceandBalanceSheetProjections(String financialPerformanceandBalanceSheetProjections) {
        this.financialPerformanceandBalanceSheetProjections = financialPerformanceandBalanceSheetProjections;
    }

    public String getFinancialPerformanceandBalanceSheetProjections() {
        return financialPerformanceandBalanceSheetProjections;
    }

    public void setECMAndDCMMarketTransactions(String ECMAndDCMMarketTransactions) {
        this.ECMAndDCMMarketTransactions = ECMAndDCMMarketTransactions;
    }

    public String getECMAndDCMMarketTransactions() {
        return ECMAndDCMMarketTransactions;
    }

    public void setStrategicInvestmentHoldingsTransactions(String strategicInvestmentHoldingsTransactions) {
        this.strategicInvestmentHoldingsTransactions = strategicInvestmentHoldingsTransactions;
    }

    public String getStrategicInvestmentHoldingsTransactions() {
        return strategicInvestmentHoldingsTransactions;
    }

    public void setEnterpriseBalanceSheetPositions(String enterpriseBalanceSheetPositions) {
        this.enterpriseBalanceSheetPositions = enterpriseBalanceSheetPositions;
    }

    public String getEnterpriseBalanceSheetPositions() {
        return enterpriseBalanceSheetPositions;
    }

    public void setStrategicFundingResolutionTask(String strategicFundingResolutionTask) {
        this.strategicFundingResolutionTask = strategicFundingResolutionTask;
    }

    public String getStrategicFundingResolutionTask() {
        return strategicFundingResolutionTask;
    }
}