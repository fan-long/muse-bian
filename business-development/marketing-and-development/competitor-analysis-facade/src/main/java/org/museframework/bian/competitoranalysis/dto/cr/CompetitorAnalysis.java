/*Analyze the performance or behavior of some on-going activity or entity  within Competitor Analysis. 
Examples: Provide behavioral insights and analysis into customer behavior and analyze financial market activity in order to identify opportunities, define pricing and evaluate risks.

Analyze the performance or behavior of some on-going activity or entity. Examples: Provide behavioral insights and analysis into customer behavior and analyze financial market activity in order to identify opportunities, define pricing and evaluate risks.*/
package org.museframework.bian.competitoranalysis.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

//refer to BOClass org.museframework.bian.classes.CompetitorAnalysis
@MetaDto
public class CompetitorAnalysis {
    /*The type of research view provided by the research (e.g. pricing comparison)*/
    @MetaField(0)
    private String competitorAnalysisType;

    /*The definition of the specific competitor analysis*/
    @MetaField(0)
    private String competitorAnalysisSpecification;

    /*Guidance on usage and interpretation of the competitor analysis (e.g. qualifying the accuracy/confidence of any findings)*/
    @MetaField(0)
    private String competitorAnalysisGuidance;

    /*Reference to the algorithm/approach used to generate the analysis*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object competitorAnalysisAlgorithmReference;

    /*Request record for the competitor analysis*/
    @MetaField(0)
    private String competitorAnalysisRequestRecord;

    /*The specific details of the request*/
    @MetaField(0)
    private String competitorAnalysisRequest;

    /*The employee/business unit requesting the analysis*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object employeeBusinessUnitReference;

    /*Work documentation, forms and schedules produced and referenced during the analysis*/
    @MetaField(0)
    private String competitorAnalysisRequestWorkProducts;

    /*The output from performing the analysis*/
    @MetaField(0)
    private String competitorAnalysisRequestResult;

    /*Usage record of the competitor analysis maintained/developed by the function*/
    @MetaField(0)
    private String competitorAnalysisUsageRecord;

    /*A record of the usage of the analysis*/
    @MetaField(0)
    private String competitorAnalysisUsage;

    /*A record of reported impact/accuracy of the competitor analysis*/
    @MetaField(0)
    private String competitorAnalysisImpact;

    public void setCompetitorAnalysisType(String competitorAnalysisType) {
        this.competitorAnalysisType = competitorAnalysisType;
    }

    public String getCompetitorAnalysisType() {
        return competitorAnalysisType;
    }

    public void setCompetitorAnalysisSpecification(String competitorAnalysisSpecification) {
        this.competitorAnalysisSpecification = competitorAnalysisSpecification;
    }

    public String getCompetitorAnalysisSpecification() {
        return competitorAnalysisSpecification;
    }

    public void setCompetitorAnalysisGuidance(String competitorAnalysisGuidance) {
        this.competitorAnalysisGuidance = competitorAnalysisGuidance;
    }

    public String getCompetitorAnalysisGuidance() {
        return competitorAnalysisGuidance;
    }

    public void setCompetitorAnalysisAlgorithmReference(org.museframework.bian.classes.Object competitorAnalysisAlgorithmReference) {
        this.competitorAnalysisAlgorithmReference = competitorAnalysisAlgorithmReference;
    }

    public org.museframework.bian.classes.Object getCompetitorAnalysisAlgorithmReference() {
        return competitorAnalysisAlgorithmReference;
    }

    public void setCompetitorAnalysisRequestRecord(String competitorAnalysisRequestRecord) {
        this.competitorAnalysisRequestRecord = competitorAnalysisRequestRecord;
    }

    public String getCompetitorAnalysisRequestRecord() {
        return competitorAnalysisRequestRecord;
    }

    public void setCompetitorAnalysisRequest(String competitorAnalysisRequest) {
        this.competitorAnalysisRequest = competitorAnalysisRequest;
    }

    public String getCompetitorAnalysisRequest() {
        return competitorAnalysisRequest;
    }

    public void setEmployeeBusinessUnitReference(org.museframework.bian.classes.Object employeeBusinessUnitReference) {
        this.employeeBusinessUnitReference = employeeBusinessUnitReference;
    }

    public org.museframework.bian.classes.Object getEmployeeBusinessUnitReference() {
        return employeeBusinessUnitReference;
    }

    public void setCompetitorAnalysisRequestWorkProducts(String competitorAnalysisRequestWorkProducts) {
        this.competitorAnalysisRequestWorkProducts = competitorAnalysisRequestWorkProducts;
    }

    public String getCompetitorAnalysisRequestWorkProducts() {
        return competitorAnalysisRequestWorkProducts;
    }

    public void setCompetitorAnalysisRequestResult(String competitorAnalysisRequestResult) {
        this.competitorAnalysisRequestResult = competitorAnalysisRequestResult;
    }

    public String getCompetitorAnalysisRequestResult() {
        return competitorAnalysisRequestResult;
    }

    public void setCompetitorAnalysisUsageRecord(String competitorAnalysisUsageRecord) {
        this.competitorAnalysisUsageRecord = competitorAnalysisUsageRecord;
    }

    public String getCompetitorAnalysisUsageRecord() {
        return competitorAnalysisUsageRecord;
    }

    public void setCompetitorAnalysisUsage(String competitorAnalysisUsage) {
        this.competitorAnalysisUsage = competitorAnalysisUsage;
    }

    public String getCompetitorAnalysisUsage() {
        return competitorAnalysisUsage;
    }

    public void setCompetitorAnalysisImpact(String competitorAnalysisImpact) {
        this.competitorAnalysisImpact = competitorAnalysisImpact;
    }

    public String getCompetitorAnalysisImpact() {
        return competitorAnalysisImpact;
    }
}