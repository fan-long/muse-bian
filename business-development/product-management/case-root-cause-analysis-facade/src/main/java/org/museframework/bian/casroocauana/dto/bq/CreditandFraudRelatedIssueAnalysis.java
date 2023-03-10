/*A collection of models/calculations/algoritms that can be applied to a subject or activity

Examples: Average balance calculation, Propensity to buy*/
package org.museframework.bian.casroocauana.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class CreditandFraudRelatedIssueAnalysis {
    /*The required status/situation before the algorithm can be applied*/
    @MetaField(0)
    private String creditandFraudRelatedIssueAnalysisPreconditions;

    /*The schedule and timing of the analysis performed using the algorithm*/
    @MetaField(0)
    private String creditandFraudRelatedIssueAnalysisAnalysisSchedule;

    /*The algorithm version employed in the analysis*/
    @MetaField(0)
    private String creditandFraudRelatedIssueAnalysisVersionNumber;

    /*The Customer Case Root Cause Analysis specific  Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService creditandFraudRelatedIssueAnalysis;

    /*Reference to the specific business service type*/
    @MetaField(0)
    private String creditandFraudRelatedIssueAnalysisServiceType;

    /*Description of the performed business service*/
    @MetaField(0)
    private String creditandFraudRelatedIssueAnalysisServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    @MetaField(0)
    private String creditandFraudRelatedIssueAnalysisServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    @MetaField(0)
    private String creditandFraudRelatedIssueAnalysisServiceWorkProduct;

    /**/
    @MetaField(0)
    private String creditandFraudRelatedIssueAnalysisServiceName;

    public void setCreditandFraudRelatedIssueAnalysisPreconditions(String creditandFraudRelatedIssueAnalysisPreconditions) {
        this.creditandFraudRelatedIssueAnalysisPreconditions = creditandFraudRelatedIssueAnalysisPreconditions;
    }

    public String getCreditandFraudRelatedIssueAnalysisPreconditions() {
        return creditandFraudRelatedIssueAnalysisPreconditions;
    }

    public void setCreditandFraudRelatedIssueAnalysisAnalysisSchedule(String creditandFraudRelatedIssueAnalysisAnalysisSchedule) {
        this.creditandFraudRelatedIssueAnalysisAnalysisSchedule = creditandFraudRelatedIssueAnalysisAnalysisSchedule;
    }

    public String getCreditandFraudRelatedIssueAnalysisAnalysisSchedule() {
        return creditandFraudRelatedIssueAnalysisAnalysisSchedule;
    }

    public void setCreditandFraudRelatedIssueAnalysisVersionNumber(String creditandFraudRelatedIssueAnalysisVersionNumber) {
        this.creditandFraudRelatedIssueAnalysisVersionNumber = creditandFraudRelatedIssueAnalysisVersionNumber;
    }

    public String getCreditandFraudRelatedIssueAnalysisVersionNumber() {
        return creditandFraudRelatedIssueAnalysisVersionNumber;
    }

    public void setCreditandFraudRelatedIssueAnalysis(org.museframework.bian.classes.BusinessService creditandFraudRelatedIssueAnalysis) {
        this.creditandFraudRelatedIssueAnalysis = creditandFraudRelatedIssueAnalysis;
    }

    public org.museframework.bian.classes.BusinessService getCreditandFraudRelatedIssueAnalysis() {
        return creditandFraudRelatedIssueAnalysis;
    }

    public void setCreditandFraudRelatedIssueAnalysisServiceType(String creditandFraudRelatedIssueAnalysisServiceType) {
        this.creditandFraudRelatedIssueAnalysisServiceType = creditandFraudRelatedIssueAnalysisServiceType;
    }

    public String getCreditandFraudRelatedIssueAnalysisServiceType() {
        return creditandFraudRelatedIssueAnalysisServiceType;
    }

    public void setCreditandFraudRelatedIssueAnalysisServiceDescription(String creditandFraudRelatedIssueAnalysisServiceDescription) {
        this.creditandFraudRelatedIssueAnalysisServiceDescription = creditandFraudRelatedIssueAnalysisServiceDescription;
    }

    public String getCreditandFraudRelatedIssueAnalysisServiceDescription() {
        return creditandFraudRelatedIssueAnalysisServiceDescription;
    }

    public void setCreditandFraudRelatedIssueAnalysisServiceInputsandOuputs(String creditandFraudRelatedIssueAnalysisServiceInputsandOuputs) {
        this.creditandFraudRelatedIssueAnalysisServiceInputsandOuputs = creditandFraudRelatedIssueAnalysisServiceInputsandOuputs;
    }

    public String getCreditandFraudRelatedIssueAnalysisServiceInputsandOuputs() {
        return creditandFraudRelatedIssueAnalysisServiceInputsandOuputs;
    }

    public void setCreditandFraudRelatedIssueAnalysisServiceWorkProduct(String creditandFraudRelatedIssueAnalysisServiceWorkProduct) {
        this.creditandFraudRelatedIssueAnalysisServiceWorkProduct = creditandFraudRelatedIssueAnalysisServiceWorkProduct;
    }

    public String getCreditandFraudRelatedIssueAnalysisServiceWorkProduct() {
        return creditandFraudRelatedIssueAnalysisServiceWorkProduct;
    }

    public void setCreditandFraudRelatedIssueAnalysisServiceName(String creditandFraudRelatedIssueAnalysisServiceName) {
        this.creditandFraudRelatedIssueAnalysisServiceName = creditandFraudRelatedIssueAnalysisServiceName;
    }

    public String getCreditandFraudRelatedIssueAnalysisServiceName() {
        return creditandFraudRelatedIssueAnalysisServiceName;
    }
}