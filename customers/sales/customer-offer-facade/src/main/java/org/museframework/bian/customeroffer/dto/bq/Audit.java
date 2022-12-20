/*Handles the booking of the asset or liability to the appropriate unit*/
package org.museframework.bian.customeroffer.dto.bq;

public class Audit extends org.museframework.bian.classes.Audit {
    /*The required compliance check*/
    private String guidelineComplianceCheckType;

    /*Description of the compliance requirements*/
    private String guidelineComplianceCheckRequirement;

    /*The submitted offer related materials*/
    private String guidelineComplianceCheckSubmission;

    /*Any required changes to the offer needed to comply*/
    private String guidelineComplianceAdjustmentRequirement;

    /*The result of the compliance assessment*/
    private String guidelineComplianceCheckAssessment;

    public void setGuidelineComplianceCheckType(String guidelineComplianceCheckType) {
        this.guidelineComplianceCheckType = guidelineComplianceCheckType;
    }

    public String getGuidelineComplianceCheckType() {
        return guidelineComplianceCheckType;
    }

    public void setGuidelineComplianceCheckRequirement(String guidelineComplianceCheckRequirement) {
        this.guidelineComplianceCheckRequirement = guidelineComplianceCheckRequirement;
    }

    public String getGuidelineComplianceCheckRequirement() {
        return guidelineComplianceCheckRequirement;
    }

    public void setGuidelineComplianceCheckSubmission(String guidelineComplianceCheckSubmission) {
        this.guidelineComplianceCheckSubmission = guidelineComplianceCheckSubmission;
    }

    public String getGuidelineComplianceCheckSubmission() {
        return guidelineComplianceCheckSubmission;
    }

    public void setGuidelineComplianceAdjustmentRequirement(String guidelineComplianceAdjustmentRequirement) {
        this.guidelineComplianceAdjustmentRequirement = guidelineComplianceAdjustmentRequirement;
    }

    public String getGuidelineComplianceAdjustmentRequirement() {
        return guidelineComplianceAdjustmentRequirement;
    }

    public void setGuidelineComplianceCheckAssessment(String guidelineComplianceCheckAssessment) {
        this.guidelineComplianceCheckAssessment = guidelineComplianceCheckAssessment;
    }

    public String getGuidelineComplianceCheckAssessment() {
        return guidelineComplianceCheckAssessment;
    }
}