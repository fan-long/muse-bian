/*A collection of models/calculations/algoritms that can be applied to a subject or activity

Examples: Average balance calculation, Propensity to buy*/
package org.museframework.bian.marketanalysis.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class AnalysisAlgorithm {
    /*Defines the type of algorithm (e.g. regression)*/
    @MetaField(0)
    private String analysisAlgorithmType;

    /*The definition of the algorithm, in particular required inputs, the internal data, calculations and outputs*/
    @MetaField(0)
    private String analysisAlgorithmSpecification;

    /*Guidance on usage of the algorithm*/
    @MetaField(0)
    private String analysisAlgorithmGuidance;

    /*The externally sourced general market research and bank maintained research viewpoints used in the analysis*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object analysisAlgorithmReferencedMarketResearchRecord;

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

    /*Reference to an internally maintained market research viewpoint*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object generalMarketResearchDirectoryEntryInstanceReference;

    /*Request record of the analysis algorithm execution*/
    @MetaField(0)
    private String analysisAlgorithmRequestRecord;

    /*The specific details of the request*/
    @MetaField(0)
    private String analysisAlgorithmRequest;

    /*Work documentation, forms and schedules produced and referenced during the analysis*/
    @MetaField(0)
    private String analysisAlgorithmWorkProducts;

    /*The output from executing the algorithm*/
    @MetaField(0)
    private String analysisAlgorithmRequestResult;

    /*The record of the use of general market research analysis algorithm*/
    @MetaField(0)
    private String analysisAlgorithmUsageRecord;

    /*A record of the usage of the algorithm*/
    @MetaField(0)
    private String analysisAlgorithmUsage;

    /*A record of reported impact/accuracy of the algorithm*/
    @MetaField(0)
    private String analysisAlgorithmImpact;

    public void setAnalysisAlgorithmType(String analysisAlgorithmType) {
        this.analysisAlgorithmType = analysisAlgorithmType;
    }

    public String getAnalysisAlgorithmType() {
        return analysisAlgorithmType;
    }

    public void setAnalysisAlgorithmSpecification(String analysisAlgorithmSpecification) {
        this.analysisAlgorithmSpecification = analysisAlgorithmSpecification;
    }

    public String getAnalysisAlgorithmSpecification() {
        return analysisAlgorithmSpecification;
    }

    public void setAnalysisAlgorithmGuidance(String analysisAlgorithmGuidance) {
        this.analysisAlgorithmGuidance = analysisAlgorithmGuidance;
    }

    public String getAnalysisAlgorithmGuidance() {
        return analysisAlgorithmGuidance;
    }

    public void setAnalysisAlgorithmReferencedMarketResearchRecord(org.museframework.bian.classes.Object analysisAlgorithmReferencedMarketResearchRecord) {
        this.analysisAlgorithmReferencedMarketResearchRecord = analysisAlgorithmReferencedMarketResearchRecord;
    }

    public org.museframework.bian.classes.Object getAnalysisAlgorithmReferencedMarketResearchRecord() {
        return analysisAlgorithmReferencedMarketResearchRecord;
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

    public void setGeneralMarketResearchDirectoryEntryInstanceReference(org.museframework.bian.classes.Object generalMarketResearchDirectoryEntryInstanceReference) {
        this.generalMarketResearchDirectoryEntryInstanceReference = generalMarketResearchDirectoryEntryInstanceReference;
    }

    public org.museframework.bian.classes.Object getGeneralMarketResearchDirectoryEntryInstanceReference() {
        return generalMarketResearchDirectoryEntryInstanceReference;
    }

    public void setAnalysisAlgorithmRequestRecord(String analysisAlgorithmRequestRecord) {
        this.analysisAlgorithmRequestRecord = analysisAlgorithmRequestRecord;
    }

    public String getAnalysisAlgorithmRequestRecord() {
        return analysisAlgorithmRequestRecord;
    }

    public void setAnalysisAlgorithmRequest(String analysisAlgorithmRequest) {
        this.analysisAlgorithmRequest = analysisAlgorithmRequest;
    }

    public String getAnalysisAlgorithmRequest() {
        return analysisAlgorithmRequest;
    }

    public void setAnalysisAlgorithmWorkProducts(String analysisAlgorithmWorkProducts) {
        this.analysisAlgorithmWorkProducts = analysisAlgorithmWorkProducts;
    }

    public String getAnalysisAlgorithmWorkProducts() {
        return analysisAlgorithmWorkProducts;
    }

    public void setAnalysisAlgorithmRequestResult(String analysisAlgorithmRequestResult) {
        this.analysisAlgorithmRequestResult = analysisAlgorithmRequestResult;
    }

    public String getAnalysisAlgorithmRequestResult() {
        return analysisAlgorithmRequestResult;
    }

    public void setAnalysisAlgorithmUsageRecord(String analysisAlgorithmUsageRecord) {
        this.analysisAlgorithmUsageRecord = analysisAlgorithmUsageRecord;
    }

    public String getAnalysisAlgorithmUsageRecord() {
        return analysisAlgorithmUsageRecord;
    }

    public void setAnalysisAlgorithmUsage(String analysisAlgorithmUsage) {
        this.analysisAlgorithmUsage = analysisAlgorithmUsage;
    }

    public String getAnalysisAlgorithmUsage() {
        return analysisAlgorithmUsage;
    }

    public void setAnalysisAlgorithmImpact(String analysisAlgorithmImpact) {
        this.analysisAlgorithmImpact = analysisAlgorithmImpact;
    }

    public String getAnalysisAlgorithmImpact() {
        return analysisAlgorithmImpact;
    }
}