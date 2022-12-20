/*The product features/services available with a financical facility*/
package org.museframework.bian.casmanandaccser.dto.bq;

public class PositivePay {
    /*The schedule that defines when the corporate provides the list of issued checks for the bank to use to filter fraudulent checks*/
    private String positivePayCheckRegisterReportingSchedule;

    /*The register of issued checks*/
    private String checkRegister;

    /*The date range covered by the list of checks*/
    private String dateRange;

    /*The payment details for an issued check (used to cross check all submitted checks and filter fraud)*/
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