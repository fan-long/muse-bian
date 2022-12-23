/**/
package org.museframework.bian.corporateloan.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Maintenance {
    /*The type of maintenance action and report processed (e.g. tax, regulatory, accounting)*/
    @MetaField
    private String maintenanceReportType;

    /*A report summarizing tax considerations*/
    @MetaField
    private String loanTaxReport;

    /*The type of fee applied*/
    @MetaField
    private String loanFeeType;

    /*A report detailing fees applied to the loan account (range of fees possible for different actions)*/
    @MetaField
    private String loanFees;

    /*A report detailing penalties incurred as booked against loan account*/
    @MetaField
    private String penalties;

    /*A report detailing the current applied collateral valuation (value confirmed as of date)*/
    @MetaField
    private String collateralValuation;

    public void setMaintenanceReportType(String maintenanceReportType) {
        this.maintenanceReportType = maintenanceReportType;
    }

    public String getMaintenanceReportType() {
        return maintenanceReportType;
    }

    public void setLoanTaxReport(String loanTaxReport) {
        this.loanTaxReport = loanTaxReport;
    }

    public String getLoanTaxReport() {
        return loanTaxReport;
    }

    public void setLoanFeeType(String loanFeeType) {
        this.loanFeeType = loanFeeType;
    }

    public String getLoanFeeType() {
        return loanFeeType;
    }

    public void setLoanFees(String loanFees) {
        this.loanFees = loanFees;
    }

    public String getLoanFees() {
        return loanFees;
    }

    public void setPenalties(String penalties) {
        this.penalties = penalties;
    }

    public String getPenalties() {
        return penalties;
    }

    public void setCollateralValuation(String collateralValuation) {
        this.collateralValuation = collateralValuation;
    }

    public String getCollateralValuation() {
        return collateralValuation;
    }
}