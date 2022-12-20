/*Operate equipment and/or a largely automated facility within Financial Gateway. */
package org.museframework.bian.financialgateway.dto.cr;

public class FinancialGatewayOperatingSession {
    /*The type of gateway (e.g. ACH, SWIFT)*/
    private String financialGatewayServiceType;

    /*Service activity statistics that are maintained during the session*/
    private String financialGatewayServiceSessionStatistics;

    /*Session reports that can be accessed during the session (e.g. real-time status, session statistics)*/
    private String financialGatewayServiceSessionReportType;

    /*The session activity report*/
    private String financialGatewayServiceSessionReport;

    /*Key dates and times for the session*/
    private String financialGatewayServiceSessionDate;

    /*A record of any production issues arising during the gateway session*/
    private String financialGatewayServiceSessionIssueRecord;

    /*The source of the issue report if appropriate*/
    private org.museframework.bian.classes.Object employeeBusinessUnitReference;

    /*Reference to the financial message(s) involved in the issue*/
    private org.museframework.bian.classes.Object messageReference;

    /*The type of network event or error being recorded (e.g. device failure)*/
    private String productionIssueType;

    /*The description of the event error*/
    private String productionIssueDescription;

    /*Evaluation of the event cause and impact assessment*/
    private String productionIssueDiagnosis;

    /*Description of corrective action proposed and taken*/
    private String productionIssueResolutionTask;

    /*Details of the issue, response and interested parties logged for reference*/
    private String productionIssueRecord;

    /*Tracking the state of resolution of a reported issue during the session*/
    private String productionIssueStatus;

    public void setFinancialGatewayServiceType(String financialGatewayServiceType) {
        this.financialGatewayServiceType = financialGatewayServiceType;
    }

    public String getFinancialGatewayServiceType() {
        return financialGatewayServiceType;
    }

    public void setFinancialGatewayServiceSessionStatistics(String financialGatewayServiceSessionStatistics) {
        this.financialGatewayServiceSessionStatistics = financialGatewayServiceSessionStatistics;
    }

    public String getFinancialGatewayServiceSessionStatistics() {
        return financialGatewayServiceSessionStatistics;
    }

    public void setFinancialGatewayServiceSessionReportType(String financialGatewayServiceSessionReportType) {
        this.financialGatewayServiceSessionReportType = financialGatewayServiceSessionReportType;
    }

    public String getFinancialGatewayServiceSessionReportType() {
        return financialGatewayServiceSessionReportType;
    }

    public void setFinancialGatewayServiceSessionReport(String financialGatewayServiceSessionReport) {
        this.financialGatewayServiceSessionReport = financialGatewayServiceSessionReport;
    }

    public String getFinancialGatewayServiceSessionReport() {
        return financialGatewayServiceSessionReport;
    }

    public void setFinancialGatewayServiceSessionDate(String financialGatewayServiceSessionDate) {
        this.financialGatewayServiceSessionDate = financialGatewayServiceSessionDate;
    }

    public String getFinancialGatewayServiceSessionDate() {
        return financialGatewayServiceSessionDate;
    }

    public void setFinancialGatewayServiceSessionIssueRecord(String financialGatewayServiceSessionIssueRecord) {
        this.financialGatewayServiceSessionIssueRecord = financialGatewayServiceSessionIssueRecord;
    }

    public String getFinancialGatewayServiceSessionIssueRecord() {
        return financialGatewayServiceSessionIssueRecord;
    }

    public void setEmployeeBusinessUnitReference(org.museframework.bian.classes.Object employeeBusinessUnitReference) {
        this.employeeBusinessUnitReference = employeeBusinessUnitReference;
    }

    public org.museframework.bian.classes.Object getEmployeeBusinessUnitReference() {
        return employeeBusinessUnitReference;
    }

    public void setMessageReference(org.museframework.bian.classes.Object messageReference) {
        this.messageReference = messageReference;
    }

    public org.museframework.bian.classes.Object getMessageReference() {
        return messageReference;
    }

    public void setProductionIssueType(String productionIssueType) {
        this.productionIssueType = productionIssueType;
    }

    public String getProductionIssueType() {
        return productionIssueType;
    }

    public void setProductionIssueDescription(String productionIssueDescription) {
        this.productionIssueDescription = productionIssueDescription;
    }

    public String getProductionIssueDescription() {
        return productionIssueDescription;
    }

    public void setProductionIssueDiagnosis(String productionIssueDiagnosis) {
        this.productionIssueDiagnosis = productionIssueDiagnosis;
    }

    public String getProductionIssueDiagnosis() {
        return productionIssueDiagnosis;
    }

    public void setProductionIssueResolutionTask(String productionIssueResolutionTask) {
        this.productionIssueResolutionTask = productionIssueResolutionTask;
    }

    public String getProductionIssueResolutionTask() {
        return productionIssueResolutionTask;
    }

    public void setProductionIssueRecord(String productionIssueRecord) {
        this.productionIssueRecord = productionIssueRecord;
    }

    public String getProductionIssueRecord() {
        return productionIssueRecord;
    }

    public void setProductionIssueStatus(String productionIssueStatus) {
        this.productionIssueStatus = productionIssueStatus;
    }

    public String getProductionIssueStatus() {
        return productionIssueStatus;
    }
}