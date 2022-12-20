/*A collection of one or more clerical routines that are to be followed to administer the operational unit/function

Examples: Time-sheet recording*/
package org.museframework.bian.marinfman.dto.bq;

public class Reporting {
    /*Is the report itself, including historical versions as appropriate*/
    private String financialMarketInformationReport;

    /*The report represents a specific managed information view of the scrubbed financial market information*/
    private String financialMarketInformationReportType;

    /*Is a detailed definition of the report contents, including properties that clarify the quality/integrity and timeliness of the content*/
    private String financialMarketInformationReportDescription;

    /*Is the schedule for maintaining the report content*/
    private String financialMarketInformationReportSchedule;

    /*Is a log/record of access made to the report by bank users*/
    private String financialMarketInformationReportAccessHistory;

    public void setFinancialMarketInformationReport(String financialMarketInformationReport) {
        this.financialMarketInformationReport = financialMarketInformationReport;
    }

    public String getFinancialMarketInformationReport() {
        return financialMarketInformationReport;
    }

    public void setFinancialMarketInformationReportType(String financialMarketInformationReportType) {
        this.financialMarketInformationReportType = financialMarketInformationReportType;
    }

    public String getFinancialMarketInformationReportType() {
        return financialMarketInformationReportType;
    }

    public void setFinancialMarketInformationReportDescription(String financialMarketInformationReportDescription) {
        this.financialMarketInformationReportDescription = financialMarketInformationReportDescription;
    }

    public String getFinancialMarketInformationReportDescription() {
        return financialMarketInformationReportDescription;
    }

    public void setFinancialMarketInformationReportSchedule(String financialMarketInformationReportSchedule) {
        this.financialMarketInformationReportSchedule = financialMarketInformationReportSchedule;
    }

    public String getFinancialMarketInformationReportSchedule() {
        return financialMarketInformationReportSchedule;
    }

    public void setFinancialMarketInformationReportAccessHistory(String financialMarketInformationReportAccessHistory) {
        this.financialMarketInformationReportAccessHistory = financialMarketInformationReportAccessHistory;
    }

    public String getFinancialMarketInformationReportAccessHistory() {
        return financialMarketInformationReportAccessHistory;
    }
}