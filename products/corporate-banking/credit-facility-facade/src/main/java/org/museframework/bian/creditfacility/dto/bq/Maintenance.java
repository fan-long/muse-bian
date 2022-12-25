/*The product features/services available with a financical facility*/
package org.museframework.bian.creditfacility.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Maintenance {
    /*The type of maintenance action and report processed (e.g. tax, regulatory, accounting)*/
    @MetaField(0)
    private String maintenanceReportType;

    /*A report summarizing tax considerations*/
    @MetaField(0)
    private String creditFacilityTaxReport;

    /*The type of fee applied*/
    @MetaField(0)
    private String creditFacilityFeeType;

    /*A report detailing fees applied to the loan account (range of fees possible for different actions)*/
    @MetaField(0)
    private String creditFacilityFees;

    /*A report detailing penalties incurred as booked against loan account*/
    @MetaField(0)
    private String creditFacilityPenalties;

    /*A report detailing the current applied collateral valuation (value confirmed as of date)*/
    @MetaField(0)
    private String creditFacilityCollateralValuation;

    public void setMaintenanceReportType(String maintenanceReportType) {
        this.maintenanceReportType = maintenanceReportType;
    }

    public String getMaintenanceReportType() {
        return maintenanceReportType;
    }

    public void setCreditFacilityTaxReport(String creditFacilityTaxReport) {
        this.creditFacilityTaxReport = creditFacilityTaxReport;
    }

    public String getCreditFacilityTaxReport() {
        return creditFacilityTaxReport;
    }

    public void setCreditFacilityFeeType(String creditFacilityFeeType) {
        this.creditFacilityFeeType = creditFacilityFeeType;
    }

    public String getCreditFacilityFeeType() {
        return creditFacilityFeeType;
    }

    public void setCreditFacilityFees(String creditFacilityFees) {
        this.creditFacilityFees = creditFacilityFees;
    }

    public String getCreditFacilityFees() {
        return creditFacilityFees;
    }

    public void setCreditFacilityPenalties(String creditFacilityPenalties) {
        this.creditFacilityPenalties = creditFacilityPenalties;
    }

    public String getCreditFacilityPenalties() {
        return creditFacilityPenalties;
    }

    public void setCreditFacilityCollateralValuation(String creditFacilityCollateralValuation) {
        this.creditFacilityCollateralValuation = creditFacilityCollateralValuation;
    }

    public String getCreditFacilityCollateralValuation() {
        return creditFacilityCollateralValuation;
    }
}