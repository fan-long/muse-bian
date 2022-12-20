/*A collection of one or more responsibilities or tasks under management

Examples: Relationship development, Troubleshooting*/
package org.museframework.bian.corporatetreasury.dto.bq;

public class Liquidity {
    /*Consolidated cashflow/liquidity reports*/
    private String enterpriseLiquidityCashManagementAnalysis;

    /*Details of large transactions that impact the treasury position that need to be considered individually*/
    private String enterpriseLargePaymentTransactionRecords;

    /*These unit reports include cost/income actual and projected values as required*/
    private String businessUnitFinancialReports;

    /*Description of a response initiated by corporate treasury*/
    private String liquidityResolutionTask;

    public void setEnterpriseLiquidityCashManagementAnalysis(String enterpriseLiquidityCashManagementAnalysis) {
        this.enterpriseLiquidityCashManagementAnalysis = enterpriseLiquidityCashManagementAnalysis;
    }

    public String getEnterpriseLiquidityCashManagementAnalysis() {
        return enterpriseLiquidityCashManagementAnalysis;
    }

    public void setEnterpriseLargePaymentTransactionRecords(String enterpriseLargePaymentTransactionRecords) {
        this.enterpriseLargePaymentTransactionRecords = enterpriseLargePaymentTransactionRecords;
    }

    public String getEnterpriseLargePaymentTransactionRecords() {
        return enterpriseLargePaymentTransactionRecords;
    }

    public void setBusinessUnitFinancialReports(String businessUnitFinancialReports) {
        this.businessUnitFinancialReports = businessUnitFinancialReports;
    }

    public String getBusinessUnitFinancialReports() {
        return businessUnitFinancialReports;
    }

    public void setLiquidityResolutionTask(String liquidityResolutionTask) {
        this.liquidityResolutionTask = liquidityResolutionTask;
    }

    public String getLiquidityResolutionTask() {
        return liquidityResolutionTask;
    }
}