/*Handles the booking of the asset or liability to the appropriate unit*/
package org.museframework.bian.customeroffer.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Compliance {
    /*The required check*/
    @MetaField
    private String regulatoryComplianceCheckType;

    /*Description of the compliance requirements*/
    @MetaField
    private String regulatoryComplianceCheckRequirement;

    /*The submitted offer related materials*/
    @MetaField
    private String regulatoryComplianceCheckSubmission;

    /*Any required changes to the offer needed to comply*/
    @MetaField
    private String regulatoryComplianceAdjustmentRequirement;

    /*The result of the compliance assessment*/
    @MetaField
    private String regulatoryComplianceCheckAssessment;

    public void setRegulatoryComplianceCheckType(String regulatoryComplianceCheckType) {
        this.regulatoryComplianceCheckType = regulatoryComplianceCheckType;
    }

    public String getRegulatoryComplianceCheckType() {
        return regulatoryComplianceCheckType;
    }

    public void setRegulatoryComplianceCheckRequirement(String regulatoryComplianceCheckRequirement) {
        this.regulatoryComplianceCheckRequirement = regulatoryComplianceCheckRequirement;
    }

    public String getRegulatoryComplianceCheckRequirement() {
        return regulatoryComplianceCheckRequirement;
    }

    public void setRegulatoryComplianceCheckSubmission(String regulatoryComplianceCheckSubmission) {
        this.regulatoryComplianceCheckSubmission = regulatoryComplianceCheckSubmission;
    }

    public String getRegulatoryComplianceCheckSubmission() {
        return regulatoryComplianceCheckSubmission;
    }

    public void setRegulatoryComplianceAdjustmentRequirement(String regulatoryComplianceAdjustmentRequirement) {
        this.regulatoryComplianceAdjustmentRequirement = regulatoryComplianceAdjustmentRequirement;
    }

    public String getRegulatoryComplianceAdjustmentRequirement() {
        return regulatoryComplianceAdjustmentRequirement;
    }

    public void setRegulatoryComplianceCheckAssessment(String regulatoryComplianceCheckAssessment) {
        this.regulatoryComplianceCheckAssessment = regulatoryComplianceCheckAssessment;
    }

    public String getRegulatoryComplianceCheckAssessment() {
        return regulatoryComplianceCheckAssessment;
    }
}