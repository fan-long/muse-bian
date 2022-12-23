/*Oversee the working of a business unit, assign work, manage against a plan and troubleshoot issues within Corporate Treasury.*/
package org.museframework.bian.corporatetreasury.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class CorporateTreasuryManagementPlan {
    /*The bank's treasury policies and guidelines reflected in the plan*/
    @MetaField
    private String treasuryPlanningPoliciesAndGuidelines;

    /*The array of group treasury positions and limits to be met through the plan*/
    @MetaField
    private String treasuryPlanOperatingParameters;

    /*Target financial performance goals set out in the bank's corporate treasury plan*/
    @MetaField
    private String treasuryPlanGoals;

    /*The bank financial statements include the balance sheet, statement of cash flows, statement of retained earnings and the income statement*/
    @MetaField
    private String enterpriseFinancialStatements;

    /*The balance sheet breakdown include individual assets/liabilities as necessary*/
    @MetaField
    private String enterpriseBalanceSheetDetailedContent;

    /*Account records that cover booking, pooling and netting activities across all relevant bank activity*/
    @MetaField
    private String enterpriseBankAccountingAndCashManagementRecords;

    /*Includes large transactions and net positions for smaller trade activity as appropriate*/
    @MetaField
    private String capitalWholesaleMarketTransactions;

    /*Analytical views detailing exposure and sensitivity to currency and interest rate fluctuations*/
    @MetaField
    private String currencyandRateRiskAnalysis;

    public void setTreasuryPlanningPoliciesAndGuidelines(String treasuryPlanningPoliciesAndGuidelines) {
        this.treasuryPlanningPoliciesAndGuidelines = treasuryPlanningPoliciesAndGuidelines;
    }

    public String getTreasuryPlanningPoliciesAndGuidelines() {
        return treasuryPlanningPoliciesAndGuidelines;
    }

    public void setTreasuryPlanOperatingParameters(String treasuryPlanOperatingParameters) {
        this.treasuryPlanOperatingParameters = treasuryPlanOperatingParameters;
    }

    public String getTreasuryPlanOperatingParameters() {
        return treasuryPlanOperatingParameters;
    }

    public void setTreasuryPlanGoals(String treasuryPlanGoals) {
        this.treasuryPlanGoals = treasuryPlanGoals;
    }

    public String getTreasuryPlanGoals() {
        return treasuryPlanGoals;
    }

    public void setEnterpriseFinancialStatements(String enterpriseFinancialStatements) {
        this.enterpriseFinancialStatements = enterpriseFinancialStatements;
    }

    public String getEnterpriseFinancialStatements() {
        return enterpriseFinancialStatements;
    }

    public void setEnterpriseBalanceSheetDetailedContent(String enterpriseBalanceSheetDetailedContent) {
        this.enterpriseBalanceSheetDetailedContent = enterpriseBalanceSheetDetailedContent;
    }

    public String getEnterpriseBalanceSheetDetailedContent() {
        return enterpriseBalanceSheetDetailedContent;
    }

    public void setEnterpriseBankAccountingAndCashManagementRecords(String enterpriseBankAccountingAndCashManagementRecords) {
        this.enterpriseBankAccountingAndCashManagementRecords = enterpriseBankAccountingAndCashManagementRecords;
    }

    public String getEnterpriseBankAccountingAndCashManagementRecords() {
        return enterpriseBankAccountingAndCashManagementRecords;
    }

    public void setCapitalWholesaleMarketTransactions(String capitalWholesaleMarketTransactions) {
        this.capitalWholesaleMarketTransactions = capitalWholesaleMarketTransactions;
    }

    public String getCapitalWholesaleMarketTransactions() {
        return capitalWholesaleMarketTransactions;
    }

    public void setCurrencyandRateRiskAnalysis(String currencyandRateRiskAnalysis) {
        this.currencyandRateRiskAnalysis = currencyandRateRiskAnalysis;
    }

    public String getCurrencyandRateRiskAnalysis() {
        return currencyandRateRiskAnalysis;
    }
}