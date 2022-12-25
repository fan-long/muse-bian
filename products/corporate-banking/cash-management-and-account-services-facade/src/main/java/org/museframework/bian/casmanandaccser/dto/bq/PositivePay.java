/*The product features/services available with a financical facility*/
package org.museframework.bian.casmanandaccser.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class PositivePay {
    /*The schedule that defines when the corporate provides the list of issued checks for the bank to use to filter fraudulent checks*/
    @MetaField(0)
    private String positivePayCheckRegisterReportingSchedule;

    /*The register of issued checks*/
    @MetaField(0)
    private String checkRegister;

    /*The date range covered by the list of checks*/
    @MetaField(0)
    private String dateRange;

    /*The payment details for an issued check (used to cross check all submitted checks and filter fraud)*/
    @MetaField(0)
    private String checkDetails;

    public void setPositivePayCheckRegisterReportingSchedule(String positivePayCheckRegisterReportingSchedule) {
        this.positivePayCheckRegisterReportingSchedule = positivePayCheckRegisterReportingSchedule;
    }

    public String getPositivePayCheckRegisterReportingSchedule() {
        return positivePayCheckRegisterReportingSchedule;
    }

    public void setCheckRegister(String checkRegister) {
        this.checkRegister = checkRegister;
    }

    public String getCheckRegister() {
        return checkRegister;
    }

    public void setDateRange(String dateRange) {
        this.dateRange = dateRange;
    }

    public String getDateRange() {
        return dateRange;
    }

    public void setCheckDetails(String checkDetails) {
        this.checkDetails = checkDetails;
    }

    public String getCheckDetails() {
        return checkDetails;
    }
}