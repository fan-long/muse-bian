/*Capture and maintain reference information about some type of entitity within Market Research.*/
package org.museframework.bian.marketresearch.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class GeneralMarketResearchDirectoryEntry {
    /*The type of research view provided by the research (e.g. competitor research)*/
    @MetaField(0)
    private String generalMarketResearchViewpointType;

    /*A description of the available market research consolidated for this maintained viewpoint*/
    @MetaField(0)
    private String generalMarketResearchViewpointDescription;

    /*The externally sourced reports that are used to assemble the research viewpoint*/
    @MetaField(0)
    private String referencedMarketResearchRecord;

    /*Reference to a specific type of predefined market research report or database*/
    @MetaField(0)
    private String marketResearchReportTypeReference;

    /*Describes the available market research report content (e.g. customer social network usage analysis)*/
    @MetaField(0)
    private String marketResearchReportTypeDefinition;

    /*Defines the version and period covered by the research*/
    @MetaField(0)
    private String marketResearchReportVersionPeriod;

    /*Is the content of the report or database in any suitable form*/
    @MetaField(0)
    private String marketResearchReport;

    /*Usage record of the research viewpoint*/
    @MetaField(0)
    private String generalMarketResearchViewpointUsage;

    /*Details of the research request*/
    @MetaField(0)
    private String marketResearchReportRequest;

    /*The employee/business unit requesting the research*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object employeeBusinessUnitReference;

    public void setGeneralMarketResearchViewpointType(String generalMarketResearchViewpointType) {
        this.generalMarketResearchViewpointType = generalMarketResearchViewpointType;
    }

    public String getGeneralMarketResearchViewpointType() {
        return generalMarketResearchViewpointType;
    }

    public void setGeneralMarketResearchViewpointDescription(String generalMarketResearchViewpointDescription) {
        this.generalMarketResearchViewpointDescription = generalMarketResearchViewpointDescription;
    }

    public String getGeneralMarketResearchViewpointDescription() {
        return generalMarketResearchViewpointDescription;
    }

    public void setReferencedMarketResearchRecord(String referencedMarketResearchRecord) {
        this.referencedMarketResearchRecord = referencedMarketResearchRecord;
    }

    public String getReferencedMarketResearchRecord() {
        return referencedMarketResearchRecord;
    }

    public void setMarketResearchReportTypeReference(String marketResearchReportTypeReference) {
        this.marketResearchReportTypeReference = marketResearchReportTypeReference;
    }

    public String getMarketResearchReportTypeReference() {
        return marketResearchReportTypeReference;
    }

    public void setMarketResearchReportTypeDefinition(String marketResearchReportTypeDefinition) {
        this.marketResearchReportTypeDefinition = marketResearchReportTypeDefinition;
    }

    public String getMarketResearchReportTypeDefinition() {
        return marketResearchReportTypeDefinition;
    }

    public void setMarketResearchReportVersionPeriod(String marketResearchReportVersionPeriod) {
        this.marketResearchReportVersionPeriod = marketResearchReportVersionPeriod;
    }

    public String getMarketResearchReportVersionPeriod() {
        return marketResearchReportVersionPeriod;
    }

    public void setMarketResearchReport(String marketResearchReport) {
        this.marketResearchReport = marketResearchReport;
    }

    public String getMarketResearchReport() {
        return marketResearchReport;
    }

    public void setGeneralMarketResearchViewpointUsage(String generalMarketResearchViewpointUsage) {
        this.generalMarketResearchViewpointUsage = generalMarketResearchViewpointUsage;
    }

    public String getGeneralMarketResearchViewpointUsage() {
        return generalMarketResearchViewpointUsage;
    }

    public void setMarketResearchReportRequest(String marketResearchReportRequest) {
        this.marketResearchReportRequest = marketResearchReportRequest;
    }

    public String getMarketResearchReportRequest() {
        return marketResearchReportRequest;
    }

    public void setEmployeeBusinessUnitReference(org.museframework.bian.classes.Object employeeBusinessUnitReference) {
        this.employeeBusinessUnitReference = employeeBusinessUnitReference;
    }

    public org.museframework.bian.classes.Object getEmployeeBusinessUnitReference() {
        return employeeBusinessUnitReference;
    }
}