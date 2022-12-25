/*Operate equipment and/or a largely automated facility within Advanced Voice Services Operations. */
package org.museframework.bian.advvoiserope.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class VoiceChannelOperatingSession {
    /*Service Domain attribute referenced during the session covering the menu options*/
    @MetaField(0)
    private String advancedVoiceServicesOperationsServiceMenu;

    /*Service activity statistics that are maintained during the session*/
    @MetaField(0)
    private String VChannelServiceSessionStatistics;

    /*Session reports that can be accessed during the session (e.g. real-time status, session statistics)*/
    @MetaField(0)
    private String VChannelServiceSessionReportType;

    /*The session activity report*/
    @MetaField(0)
    private String VChannelServiceSessionReport;

    /*A record of any production issues arising during the session*/
    @MetaField(0)
    private String VChannelProductionIssueRecord;

    /*The source of the issue report if appropriate*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object employeeBusinessUnitReference;

    /*Reference to the specific customer contact where the issue occurred if appropriate*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object customerContactRecordReference;

    /*The type of network event or error being recorded (e.g. device failure)*/
    @MetaField(0)
    private String productionIssueType;

    /*The description of the event error*/
    @MetaField(0)
    private String productionIssueDescription;

    /*Evaluation of the event cause and impact assessment*/
    @MetaField(0)
    private String productionIssueDiagnosis;

    /*Description of corrective action proposed and taken*/
    @MetaField(0)
    private String productionIssueResolutionTask;

    /*Tracking the state of resolution of a reported issue during the session*/
    @MetaField(0)
    private String productionIssueStatus;

    public void setAdvancedVoiceServicesOperationsServiceMenu(String advancedVoiceServicesOperationsServiceMenu) {
        this.advancedVoiceServicesOperationsServiceMenu = advancedVoiceServicesOperationsServiceMenu;
    }

    public String getAdvancedVoiceServicesOperationsServiceMenu() {
        return advancedVoiceServicesOperationsServiceMenu;
    }

    public void setVChannelServiceSessionStatistics(String VChannelServiceSessionStatistics) {
        this.VChannelServiceSessionStatistics = VChannelServiceSessionStatistics;
    }

    public String getVChannelServiceSessionStatistics() {
        return VChannelServiceSessionStatistics;
    }

    public void setVChannelServiceSessionReportType(String VChannelServiceSessionReportType) {
        this.VChannelServiceSessionReportType = VChannelServiceSessionReportType;
    }

    public String getVChannelServiceSessionReportType() {
        return VChannelServiceSessionReportType;
    }

    public void setVChannelServiceSessionReport(String VChannelServiceSessionReport) {
        this.VChannelServiceSessionReport = VChannelServiceSessionReport;
    }

    public String getVChannelServiceSessionReport() {
        return VChannelServiceSessionReport;
    }

    public void setVChannelProductionIssueRecord(String VChannelProductionIssueRecord) {
        this.VChannelProductionIssueRecord = VChannelProductionIssueRecord;
    }

    public String getVChannelProductionIssueRecord() {
        return VChannelProductionIssueRecord;
    }

    public void setEmployeeBusinessUnitReference(org.museframework.bian.classes.Object employeeBusinessUnitReference) {
        this.employeeBusinessUnitReference = employeeBusinessUnitReference;
    }

    public org.museframework.bian.classes.Object getEmployeeBusinessUnitReference() {
        return employeeBusinessUnitReference;
    }

    public void setCustomerContactRecordReference(org.museframework.bian.classes.Object customerContactRecordReference) {
        this.customerContactRecordReference = customerContactRecordReference;
    }

    public org.museframework.bian.classes.Object getCustomerContactRecordReference() {
        return customerContactRecordReference;
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

    public void setProductionIssueStatus(String productionIssueStatus) {
        this.productionIssueStatus = productionIssueStatus;
    }

    public String getProductionIssueStatus() {
        return productionIssueStatus;
    }
}