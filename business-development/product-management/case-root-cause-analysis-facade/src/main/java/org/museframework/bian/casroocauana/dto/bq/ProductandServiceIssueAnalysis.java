/*A collection of models/calculations/algoritms that can be applied to a subject or activity

Examples: Average balance calculation, Propensity to buy*/
package org.museframework.bian.casroocauana.dto.bq;

public class ProductandServiceIssueAnalysis {
    /*The required status/situation before the algorithm can be applied*/
    private String productandServiceIssueAnalysisPreconditions;

    /*The schedule and timing of the analysis performed using the algorithm*/
    private String productandServiceIssueAnalysisAnalysisSchedule;

    /*The algorithm version employed in the analysis*/
    private String productandServiceIssueAnalysisVersionNumber;

    /*The Customer Case Root Cause Analysis specific  Business Service*/
    private org.museframework.bian.classes.BusinessService productandServiceIssueAnalysis;

    /*Reference to the specific business service type*/
    private String productandServiceIssueAnalysisServiceType;

    /*Description of the performed business service*/
    private String productandServiceIssueAnalysisServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    private String productandServiceIssueAnalysisServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    private String productandServiceIssueAnalysisServiceWorkProduct;

    /**/
    private String productandServiceIssueAnalysisServiceName;

    public void setProductandServiceIssueAnalysisPreconditions(String productandServiceIssueAnalysisPreconditions) {
        this.productandServiceIssueAnalysisPreconditions = productandServiceIssueAnalysisPreconditions;
    }

    public String getProductandServiceIssueAnalysisPreconditions() {
        return productandServiceIssueAnalysisPreconditions;
    }

    public void setProductandServiceIssueAnalysisAnalysisSchedule(String productandServiceIssueAnalysisAnalysisSchedule) {
        this.productandServiceIssueAnalysisAnalysisSchedule = productandServiceIssueAnalysisAnalysisSchedule;
    }

    public String getProductandServiceIssueAnalysisAnalysisSchedule() {
        return productandServiceIssueAnalysisAnalysisSchedule;
    }

    public void setProductandServiceIssueAnalysisVersionNumber(String productandServiceIssueAnalysisVersionNumber) {
        this.productandServiceIssueAnalysisVersionNumber = productandServiceIssueAnalysisVersionNumber;
    }

    public String getProductandServiceIssueAnalysisVersionNumber() {
        return productandServiceIssueAnalysisVersionNumber;
    }

    public void setProductandServiceIssueAnalysis(org.museframework.bian.classes.BusinessService productandServiceIssueAnalysis) {
        this.productandServiceIssueAnalysis = productandServiceIssueAnalysis;
    }

    public org.museframework.bian.classes.BusinessService getProductandServiceIssueAnalysis() {
        return productandServiceIssueAnalysis;
    }

    public void setProductandServiceIssueAnalysisServiceType(String productandServiceIssueAnalysisServiceType) {
        this.productandServiceIssueAnalysisServiceType = productandServiceIssueAnalysisServiceType;
    }

    public String getProductandServiceIssueAnalysisServiceType() {
        return productandServiceIssueAnalysisServiceType;
    }

    public void setProductandServiceIssueAnalysisServiceDescription(String productandServiceIssueAnalysisServiceDescription) {
        this.productandServiceIssueAnalysisServiceDescription = productandServiceIssueAnalysisServiceDescription;
    }

    public String getProductandServiceIssueAnalysisServiceDescription() {
        return productandServiceIssueAnalysisServiceDescription;
    }

    public void setProductandServiceIssueAnalysisServiceInputsandOuputs(String productandServiceIssueAnalysisServiceInputsandOuputs) {
        this.productandServiceIssueAnalysisServiceInputsandOuputs = productandServiceIssueAnalysisServiceInputsandOuputs;
    }

    public String getProductandServiceIssueAnalysisServiceInputsandOuputs() {
        return productandServiceIssueAnalysisServiceInputsandOuputs;
    }

    public void setProductandServiceIssueAnalysisServiceWorkProduct(String productandServiceIssueAnalysisServiceWorkProduct) {
        this.productandServiceIssueAnalysisServiceWorkProduct = productandServiceIssueAnalysisServiceWorkProduct;
    }

    public String getProductandServiceIssueAnalysisServiceWorkProduct() {
        return productandServiceIssueAnalysisServiceWorkProduct;
    }

    public void setProductandServiceIssueAnalysisServiceName(String productandServiceIssueAnalysisServiceName) {
        this.productandServiceIssueAnalysisServiceName = productandServiceIssueAnalysisServiceName;
    }

    public String getProductandServiceIssueAnalysisServiceName() {
        return productandServiceIssueAnalysisServiceName;
    }
}