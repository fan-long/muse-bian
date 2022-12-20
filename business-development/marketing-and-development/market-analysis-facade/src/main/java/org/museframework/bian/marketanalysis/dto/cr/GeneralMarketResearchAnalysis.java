/*Analyze the performance or behavior of some on-going activity or entity  within Market Analysis. 
Examples: Provide behavioral insights and analysis into customer behavior and analyze financial market activity in order to identify opportunities, define pricing and evaluate risks.

Analyze the performance or behavior of some on-going activity or entity. Examples: Provide behavioral insights and analysis into customer behavior and analyze financial market activity in order to identify opportunities, define pricing and evaluate risks.*/
package org.museframework.bian.marketanalysis.dto.cr;

public class GeneralMarketResearchAnalysis {
    /*The type of research view provided by the research (e.g. competitor analysis)*/
    private String generalMarketResearchAnalysisType;

    /*The definition of the analysis*/
    private String generalMarketResearchAnalysisSpecification;

    /*Guidance on usage and interpretation of the analysis*/
    private String generalMarketResearchAnalysisGuidance;

    /*Reference to the algorithm used to generate the analysis*/
    private org.museframework.bian.classes.Object generalMarketResearchAnalysisAlgorithmReference;

    /*Request record of the general market analysis*/
    private String generalMarketResearchAnalysisRequestRecord;

    /*The specific details of the request*/
    private String generalMarketResearchAnalysisRequest;

    /*The employee/business unit requesting the analysis*/
    private org.museframework.bian.classes.Object employeeBusinessUnitReference;

    /*Work documentation, forms and schedules produced and referenced during the analysis*/
    private String marketAnalysisRequestWorkProducts;

    /*The output from performing the analysis*/
    private String generalMarketResearchAnalysisRequestResult;

    /*Usage record of the general market analysis*/
    private String generalMarketResearchAnalysisUsageRecord;

    /*A record of the usage of the analysis*/
    private String generalMarketResearchAnalysisUsage;

    /*A record of reported impact/accuracy of the analysis*/
    private String generalMarketResearchAnalysisImpact;

    public void setGeneralMarketResearchAnalysisType(String generalMarketResearchAnalysisType) {
        this.generalMarketResearchAnalysisType = generalMarketResearchAnalysisType;
    }

    public String getGeneralMarketResearchAnalysisType() {
        return generalMarketResearchAnalysisType;
    }

    public void setGeneralMarketResearchAnalysisSpecification(String generalMarketResearchAnalysisSpecification) {
        this.generalMarketResearchAnalysisSpecification = generalMarketResearchAnalysisSpecification;
    }

    public String getGeneralMarketResearchAnalysisSpecification() {
        return generalMarketResearchAnalysisSpecification;
    }

    public void setGeneralMarketResearchAnalysisGuidance(String generalMarketResearchAnalysisGuidance) {
        this.generalMarketResearchAnalysisGuidance = generalMarketResearchAnalysisGuidance;
    }

    public String getGeneralMarketResearchAnalysisGuidance() {
        return generalMarketResearchAnalysisGuidance;
    }

    public void setGeneralMarketResearchAnalysisAlgorithmReference(org.museframework.bian.classes.Object generalMarketResearchAnalysisAlgorithmReference) {
        this.generalMarketResearchAnalysisAlgorithmReference = generalMarketResearchAnalysisAlgorithmReference;
    }

    public org.museframework.bian.classes.Object getGeneralMarketResearchAnalysisAlgorithmReference() {
        return generalMarketResearchAnalysisAlgorithmReference;
    }

    public void setGeneralMarketResearchAnalysisRequestRecord(String generalMarketResearchAnalysisRequestRecord) {
        this.generalMarketResearchAnalysisRequestRecord = generalMarketResearchAnalysisRequestRecord;
    }

    public String getGeneralMarketResearchAnalysisRequestRecord() {
        return generalMarketResearchAnalysisRequestRecord;
    }

    public void setGeneralMarketResearchAnalysisRequest(String generalMarketResearchAnalysisRequest) {
        this.generalMarketResearchAnalysisRequest = generalMarketResearchAnalysisRequest;
    }

    public String getGeneralMarketResearchAnalysisRequest() {
        return generalMarketResearchAnalysisRequest;
    }

    public void setEmployeeBusinessUnitReference(org.museframework.bian.classes.Object employeeBusinessUnitReference) {
        this.employeeBusinessUnitReference = employeeBusinessUnitReference;
    }

    public org.museframework.bian.classes.Object getEmployeeBusinessUnitReference() {
        return employeeBusinessUnitReference;
    }

    public void setMarketAnalysisRequestWorkProducts(String marketAnalysisRequestWorkProducts) {
        this.marketAnalysisRequestWorkProducts = marketAnalysisRequestWorkProducts;
    }

    public String getMarketAnalysisRequestWorkProducts() {
        return marketAnalysisRequestWorkProducts;
    }

    public void setGeneralMarketResearchAnalysisRequestResult(String generalMarketResearchAnalysisRequestResult) {
        this.generalMarketResearchAnalysisRequestResult = generalMarketResearchAnalysisRequestResult;
    }

    public String getGeneralMarketResearchAnalysisRequestResult() {
        return generalMarketResearchAnalysisRequestResult;
    }

    public void setGeneralMarketResearchAnalysisUsageRecord(String generalMarketResearchAnalysisUsageRecord) {
        this.generalMarketResearchAnalysisUsageRecord = generalMarketResearchAnalysisUsageRecord;
    }

    public String getGeneralMarketResearchAnalysisUsageRecord() {
        return generalMarketResearchAnalysisUsageRecord;
    }

    public void setGeneralMarketResearchAnalysisUsage(String generalMarketResearchAnalysisUsage) {
        this.generalMarketResearchAnalysisUsage = generalMarketResearchAnalysisUsage;
    }

    public String getGeneralMarketResearchAnalysisUsage() {
        return generalMarketResearchAnalysisUsage;
    }

    public void setGeneralMarketResearchAnalysisImpact(String generalMarketResearchAnalysisImpact) {
        this.generalMarketResearchAnalysisImpact = generalMarketResearchAnalysisImpact;
    }

    public String getGeneralMarketResearchAnalysisImpact() {
        return generalMarketResearchAnalysisImpact;
    }
}