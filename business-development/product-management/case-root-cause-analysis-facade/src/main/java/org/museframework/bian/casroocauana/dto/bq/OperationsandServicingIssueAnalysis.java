/*A collection of models/calculations/algoritms that can be applied to a subject or activity

Examples: Average balance calculation, Propensity to buy*/
package org.museframework.bian.casroocauana.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class OperationsandServicingIssueAnalysis {
    /*The required status/situation before the algorithm can be applied*/
    @MetaField
    private String operationsandServicingIssueAnalysisPreconditions;

    /*The schedule and timing of the analysis performed using the algorithm*/
    @MetaField
    private String operationsandServicingIssueAnalysisAnalysisSchedule;

    /*The algorithm version employed in the analysis*/
    @MetaField
    private String operationsandServicingIssueAnalysisVersionNumber;

    /*The Customer Case Root Cause Analysis specific  Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService operationsandServicingIssueAnalysis;

    /*Reference to the specific business service type*/
    @MetaField
    private String operationsandServicingIssueAnalysisServiceType;

    /*Description of the performed business service*/
    @MetaField
    private String operationsandServicingIssueAnalysisServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    @MetaField
    private String operationsandServicingIssueAnalysisServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    @MetaField
    private String operationsandServicingIssueAnalysisServiceWorkProduct;

    /**/
    @MetaField
    private String operationsandServicingIssueAnalysisServiceName;

    public void setOperationsandServicingIssueAnalysisPreconditions(String operationsandServicingIssueAnalysisPreconditions) {
        this.operationsandServicingIssueAnalysisPreconditions = operationsandServicingIssueAnalysisPreconditions;
    }

    public String getOperationsandServicingIssueAnalysisPreconditions() {
        return operationsandServicingIssueAnalysisPreconditions;
    }

    public void setOperationsandServicingIssueAnalysisAnalysisSchedule(String operationsandServicingIssueAnalysisAnalysisSchedule) {
        this.operationsandServicingIssueAnalysisAnalysisSchedule = operationsandServicingIssueAnalysisAnalysisSchedule;
    }

    public String getOperationsandServicingIssueAnalysisAnalysisSchedule() {
        return operationsandServicingIssueAnalysisAnalysisSchedule;
    }

    public void setOperationsandServicingIssueAnalysisVersionNumber(String operationsandServicingIssueAnalysisVersionNumber) {
        this.operationsandServicingIssueAnalysisVersionNumber = operationsandServicingIssueAnalysisVersionNumber;
    }

    public String getOperationsandServicingIssueAnalysisVersionNumber() {
        return operationsandServicingIssueAnalysisVersionNumber;
    }

    public void setOperationsandServicingIssueAnalysis(org.museframework.bian.classes.BusinessService operationsandServicingIssueAnalysis) {
        this.operationsandServicingIssueAnalysis = operationsandServicingIssueAnalysis;
    }

    public org.museframework.bian.classes.BusinessService getOperationsandServicingIssueAnalysis() {
        return operationsandServicingIssueAnalysis;
    }

    public void setOperationsandServicingIssueAnalysisServiceType(String operationsandServicingIssueAnalysisServiceType) {
        this.operationsandServicingIssueAnalysisServiceType = operationsandServicingIssueAnalysisServiceType;
    }

    public String getOperationsandServicingIssueAnalysisServiceType() {
        return operationsandServicingIssueAnalysisServiceType;
    }

    public void setOperationsandServicingIssueAnalysisServiceDescription(String operationsandServicingIssueAnalysisServiceDescription) {
        this.operationsandServicingIssueAnalysisServiceDescription = operationsandServicingIssueAnalysisServiceDescription;
    }

    public String getOperationsandServicingIssueAnalysisServiceDescription() {
        return operationsandServicingIssueAnalysisServiceDescription;
    }

    public void setOperationsandServicingIssueAnalysisServiceInputsandOuputs(String operationsandServicingIssueAnalysisServiceInputsandOuputs) {
        this.operationsandServicingIssueAnalysisServiceInputsandOuputs = operationsandServicingIssueAnalysisServiceInputsandOuputs;
    }

    public String getOperationsandServicingIssueAnalysisServiceInputsandOuputs() {
        return operationsandServicingIssueAnalysisServiceInputsandOuputs;
    }

    public void setOperationsandServicingIssueAnalysisServiceWorkProduct(String operationsandServicingIssueAnalysisServiceWorkProduct) {
        this.operationsandServicingIssueAnalysisServiceWorkProduct = operationsandServicingIssueAnalysisServiceWorkProduct;
    }

    public String getOperationsandServicingIssueAnalysisServiceWorkProduct() {
        return operationsandServicingIssueAnalysisServiceWorkProduct;
    }

    public void setOperationsandServicingIssueAnalysisServiceName(String operationsandServicingIssueAnalysisServiceName) {
        this.operationsandServicingIssueAnalysisServiceName = operationsandServicingIssueAnalysisServiceName;
    }

    public String getOperationsandServicingIssueAnalysisServiceName() {
        return operationsandServicingIssueAnalysisServiceName;
    }
}