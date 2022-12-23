/*Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility  within Fiduciary Agreement. 
Example: Perform the scheduled (e.g. statements, standing orders) and ad-hoc/requested (e.g. balance inquiries, fund transfers) fulfillment tasks for a customer current account facility.*/
package org.museframework.bian.fiduciaryagreement.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class AssessmentandReporting {
    /*The required status/situation prior to the implementation of the feature*/
    @MetaField
    private String assessmentandReportingPreconditions;

    /*The timing and key actions/milestones involved in completing the fulfillment feature instance*/
    @MetaField
    private String assessmentandReportingFeatureSchedule;

    /*The Fiduciary Relationship Arrangement specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService analysisandReporting;

    /*The completion status and any triggered/dependent actions once the feature instance has been fulfilled*/
    @MetaField
    private String assessmentandReportingPostconditions;

    /*Reference to the specific business service type*/
    @MetaField
    private String assessmentandReportingAnalysisandReportingServiceType;

    /*Description of the performed business service*/
    @MetaField
    private String assessmentandReportingAnalysisandReportingServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    @MetaField
    private String assessmentandReportingAnalysisandReportingServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    @MetaField
    private String assessmentandReportingAnalysisandReportingServiceWorkProduct;

    /**/
    @MetaField
    private String assessmentandReportingAnalysisandReportingServiceName;

    public void setAssessmentandReportingPreconditions(String assessmentandReportingPreconditions) {
        this.assessmentandReportingPreconditions = assessmentandReportingPreconditions;
    }

    public String getAssessmentandReportingPreconditions() {
        return assessmentandReportingPreconditions;
    }

    public void setAssessmentandReportingFeatureSchedule(String assessmentandReportingFeatureSchedule) {
        this.assessmentandReportingFeatureSchedule = assessmentandReportingFeatureSchedule;
    }

    public String getAssessmentandReportingFeatureSchedule() {
        return assessmentandReportingFeatureSchedule;
    }

    public void setAnalysisandReporting(org.museframework.bian.classes.BusinessService analysisandReporting) {
        this.analysisandReporting = analysisandReporting;
    }

    public org.museframework.bian.classes.BusinessService getAnalysisandReporting() {
        return analysisandReporting;
    }

    public void setAssessmentandReportingPostconditions(String assessmentandReportingPostconditions) {
        this.assessmentandReportingPostconditions = assessmentandReportingPostconditions;
    }

    public String getAssessmentandReportingPostconditions() {
        return assessmentandReportingPostconditions;
    }

    public void setAssessmentandReportingAnalysisandReportingServiceType(String assessmentandReportingAnalysisandReportingServiceType) {
        this.assessmentandReportingAnalysisandReportingServiceType = assessmentandReportingAnalysisandReportingServiceType;
    }

    public String getAssessmentandReportingAnalysisandReportingServiceType() {
        return assessmentandReportingAnalysisandReportingServiceType;
    }

    public void setAssessmentandReportingAnalysisandReportingServiceDescription(String assessmentandReportingAnalysisandReportingServiceDescription) {
        this.assessmentandReportingAnalysisandReportingServiceDescription = assessmentandReportingAnalysisandReportingServiceDescription;
    }

    public String getAssessmentandReportingAnalysisandReportingServiceDescription() {
        return assessmentandReportingAnalysisandReportingServiceDescription;
    }

    public void setAssessmentandReportingAnalysisandReportingServiceInputsandOuputs(String assessmentandReportingAnalysisandReportingServiceInputsandOuputs) {
        this.assessmentandReportingAnalysisandReportingServiceInputsandOuputs = assessmentandReportingAnalysisandReportingServiceInputsandOuputs;
    }

    public String getAssessmentandReportingAnalysisandReportingServiceInputsandOuputs() {
        return assessmentandReportingAnalysisandReportingServiceInputsandOuputs;
    }

    public void setAssessmentandReportingAnalysisandReportingServiceWorkProduct(String assessmentandReportingAnalysisandReportingServiceWorkProduct) {
        this.assessmentandReportingAnalysisandReportingServiceWorkProduct = assessmentandReportingAnalysisandReportingServiceWorkProduct;
    }

    public String getAssessmentandReportingAnalysisandReportingServiceWorkProduct() {
        return assessmentandReportingAnalysisandReportingServiceWorkProduct;
    }

    public void setAssessmentandReportingAnalysisandReportingServiceName(String assessmentandReportingAnalysisandReportingServiceName) {
        this.assessmentandReportingAnalysisandReportingServiceName = assessmentandReportingAnalysisandReportingServiceName;
    }

    public String getAssessmentandReportingAnalysisandReportingServiceName() {
        return assessmentandReportingAnalysisandReportingServiceName;
    }
}