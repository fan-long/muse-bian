/*A collection of one or more responsibilities or tasks under management

Examples: Relationship development, Troubleshooting*/
package org.museframework.bian.corporatetreasury.dto.bq;

public class TacticalFunding {
    /*Details the required capital holdings against which the current position is tracked and hedging, re-balancing activity initiated for compliance*/
    private String capitalAdequacyRequirements;

    /*Breakdown of the treasury positions monitored and there current/projected ranges*/
    private String bankPositionsandHedgingRequirements;

    /*Selected balance sheet views used to evaluate short term funding needs*/
    private String enterpriseBalanceSheetPositions;

    /*Description of a response initiated by corporate treasury*/
    private String tacticalFundingResolutionTask;

    public void setCapitalAdequacyRequirements(String capitalAdequacyRequirements) {
        this.capitalAdequacyRequirements = capitalAdequacyRequirements;
    }

    public String getCapitalAdequacyRequirements() {
        return capitalAdequacyRequirements;
    }

    public void setBankPositionsandHedgingRequirements(String bankPositionsandHedgingRequirements) {
        this.bankPositionsandHedgingRequirements = bankPositionsandHedgingRequirements;
    }

    public String getBankPositionsandHedgingRequirements() {
        return bankPositionsandHedgingRequirements;
    }

    public void setEnterpriseBalanceSheetPositions(String enterpriseBalanceSheetPositions) {
        this.enterpriseBalanceSheetPositions = enterpriseBalanceSheetPositions;
    }

    public String getEnterpriseBalanceSheetPositions() {
        return enterpriseBalanceSheetPositions;
    }

    public void setTacticalFundingResolutionTask(String tacticalFundingResolutionTask) {
        this.tacticalFundingResolutionTask = tacticalFundingResolutionTask;
    }

    public String getTacticalFundingResolutionTask() {
        return tacticalFundingResolutionTask;
    }
}