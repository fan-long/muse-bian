/*Handles the booking of the asset or liability to the appropriate unit*/
package org.museframework.bian.customeroffer.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

//refer to BOClass org.museframework.bian.classes.Audit
@MetaDto
public class Audit {
    /*The required compliance check*/
    @MetaField(0)
    private String guidelineComplianceCheckType;

    /*Description of the compliance requirements*/
    @MetaField(0)
    private String guidelineComplianceCheckRequirement;

    /*The submitted offer related materials*/
    @MetaField(0)
    private String guidelineComplianceCheckSubmission;

    /*Any required changes to the offer needed to comply*/
    @MetaField(0)
    private String guidelineComplianceAdjustmentRequirement;

    /*The result of the compliance assessment*/
    @MetaField(0)
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