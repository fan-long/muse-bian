/*Capture and maintain reference information about some type of entitity within Financial Market Research.*/
package org.museframework.bian.finmarres.dto.cr;

public class FinancialMarketResearchDirectoryEntry extends org.museframework.bian.classes.FinancialMarketResearchDirectoryEntry {
    /*The type of financial market research view provided by the research (e.g. common stock comparison)*/
    private String financialMarketResearchViewpointType;

    /*A description of the available market research consolidated for this maintained viewpoint*/
    private String financialMarketResearchViewpointDescription;

    /*The externally sourced reports that are used to assemble the research viewpoint*/
    private String referencedFinancialMarketResearchRecord;

    /*Reference to a specific type of predefined market research report or database*/
    private String financialMarketResearchReportTypeReference;

    /*Describes the available market research report content (e.g. customer social network usage analysis)*/
    private String financialMarketResearchReportTypeDefinition;

    /*Defines the version and period covered by the research*/
    private String financialMarketResearchReportVersionPeriod;

    /*Is the content of the report or database in any suitable form*/
    private String financialMarketResearchReport;

    /*Usage record of the research viewpoint*/
    private String financialMarketResearchViewpointUsage;

    /*Details of the research request*/
    private String financialMarketResearchReportRequest;

    /*The employee/business unit requesting the research*/
    private org.museframework.bian.classes.Object employeeBusinessUnitReference;

    public void setFinancialMarketResearchViewpointType(String financialMarketResearchViewpointType) {
        this.financialMarketResearchViewpointType = financialMarketResearchViewpointType;
    }

    public String getFinancialMarketResearchViewpointType() {
        return financialMarketResearchViewpointType;
    }

    public void setFinancialMarketResearchViewpointDescription(String financialMarketResearchViewpointDescription) {
        this.financialMarketResearchViewpointDescription = financialMarketResearchViewpointDescription;
    }

    public String getFinancialMarketResearchViewpointDescription() {
        return financialMarketResearchViewpointDescription;
    }

    public void setReferencedFinancialMarketResearchRecord(String referencedFinancialMarketResearchRecord) {
        this.referencedFinancialMarketResearchRecord = referencedFinancialMarketResearchRecord;
    }

    public String getReferencedFinancialMarketResearchRecord() {
        return referencedFinancialMarketResearchRecord;
    }

    public void setFinancialMarketResearchReportTypeReference(String financialMarketResearchReportTypeReference) {
        this.financialMarketResearchReportTypeReference = financialMarketResearchReportTypeReference;
    }

    public String getFinancialMarketResearchReportTypeReference() {
        return financialMarketResearchReportTypeReference;
    }

    public void setFinancialMarketResearchReportTypeDefinition(String financialMarketResearchReportTypeDefinition) {
        this.financialMarketResearchReportTypeDefinition = financialMarketResearchReportTypeDefinition;
    }

    public String getFinancialMarketResearchReportTypeDefinition() {
        return financialMarketResearchReportTypeDefinition;
    }

    public void setFinancialMarketResearchReportVersionPeriod(String financialMarketResearchReportVersionPeriod) {
        this.financialMarketResearchReportVersionPeriod = financialMarketResearchReportVersionPeriod;
    }

    public String getFinancialMarketResearchReportVersionPeriod() {
        return financialMarketResearchReportVersionPeriod;
    }

    public void setFinancialMarketResearchReport(String financialMarketResearchReport) {
        this.financialMarketResearchReport = financialMarketResearchReport;
    }

    public String getFinancialMarketResearchReport() {
        return financialMarketResearchReport;
    }

    public void setFinancialMarketResearchViewpointUsage(String financialMarketResearchViewpointUsage) {
        this.financialMarketResearchViewpointUsage = financialMarketResearchViewpointUsage;
    }

    public String getFinancialMarketResearchViewpointUsage() {
        return financialMarketResearchViewpointUsage;
    }

    public void setFinancialMarketResearchReportRequest(String financialMarketResearchReportRequest) {
        this.financialMarketResearchReportRequest = financialMarketResearchReportRequest;
    }

    public String getFinancialMarketResearchReportRequest() {
        return financialMarketResearchReportRequest;
    }

    public void setEmployeeBusinessUnitReference(org.museframework.bian.classes.Object employeeBusinessUnitReference) {
        this.employeeBusinessUnitReference = employeeBusinessUnitReference;
    }

    public org.museframework.bian.classes.Object getEmployeeBusinessUnitReference() {
        return employeeBusinessUnitReference;
    }
}