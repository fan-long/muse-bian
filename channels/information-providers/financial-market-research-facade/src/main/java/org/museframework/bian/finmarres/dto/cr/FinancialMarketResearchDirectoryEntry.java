/*Capture and maintain reference information about some type of entitity within Financial Market Research.*/
package org.museframework.bian.finmarres.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

//refer to BOClass org.museframework.bian.classes.FinancialMarketResearchDirectoryEntry
@MetaDto
public class FinancialMarketResearchDirectoryEntry {
    /*The type of financial market research view provided by the research (e.g. common stock comparison)*/
    @MetaField
    private String financialMarketResearchViewpointType;

    /*A description of the available market research consolidated for this maintained viewpoint*/
    @MetaField
    private String financialMarketResearchViewpointDescription;

    /*The externally sourced reports that are used to assemble the research viewpoint*/
    @MetaField
    private String referencedFinancialMarketResearchRecord;

    /*Reference to a specific type of predefined market research report or database*/
    @MetaField
    private String financialMarketResearchReportTypeReference;

    /*Describes the available market research report content (e.g. customer social network usage analysis)*/
    @MetaField
    private String financialMarketResearchReportTypeDefinition;

    /*Defines the version and period covered by the research*/
    @MetaField
    private String financialMarketResearchReportVersionPeriod;

    /*Is the content of the report or database in any suitable form*/
    @MetaField
    private String financialMarketResearchReport;

    /*Usage record of the research viewpoint*/
    @MetaField
    private String financialMarketResearchViewpointUsage;

    /*Details of the research request*/
    @MetaField
    private String financialMarketResearchReportRequest;

    /*The employee/business unit requesting the research*/
    @MetaField(ref=true)
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