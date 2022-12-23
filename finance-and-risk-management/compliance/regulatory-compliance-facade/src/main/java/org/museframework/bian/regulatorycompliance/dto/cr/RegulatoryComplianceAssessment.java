/*To test or assess an entity, possibly against some formal qualification or certification requirement within Regulatory Compliance. */
package org.museframework.bian.regulatorycompliance.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class RegulatoryComplianceAssessment {
    /*The type and make-up of regulatory tests referenced in the assessment*/
    @MetaField
    private String regulatoryAssessmentType;

    /*The business function or unit assessed for compliance if appropriate*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object businessUnitReference;

    /*The associated product/service being assessed if appropriate*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object productandServiceReference;

    /*Reference to the customer assessed if appropriate*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object customerReference;

    /*Indication of the authority pertaining to the applied regulation*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object regulatoryAuthorityReference;

    /*Reference to the specific regulation*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object regulationReference;

    /*A definition of the goals/required actions addressed by the regulation*/
    @MetaField
    private String regulationDefinition;

    /*Description of the measurements and reporting required to demonstrate compliance*/
    @MetaField
    private String regulationComplianceandReportingRequirements;

    /*Explanation of the business context, responsibility and accountability for compliance*/
    @MetaField
    private String regulationAccountability;

    /*Outline of the possible implications of non-compliance*/
    @MetaField
    private String regulationPenalties;

    /*Guidelines and requirements for compliance*/
    @MetaField
    private String regulationGuideline;

    /*Reference to any documentation classified/archived as appropriate*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object documentReference;

    /*Work documentation, forms and schedules produced and referenced during the assessment*/
    @MetaField
    private String regulatoryAssessmentWorkProducts;

    /*Outcome/result of the assessment, can include remedial actions*/
    @MetaField
    private String regulatoryAssessmentResult;

    public void setRegulatoryAssessmentType(String regulatoryAssessmentType) {
        this.regulatoryAssessmentType = regulatoryAssessmentType;
    }

    public String getRegulatoryAssessmentType() {
        return regulatoryAssessmentType;
    }

    public void setBusinessUnitReference(org.museframework.bian.classes.Object businessUnitReference) {
        this.businessUnitReference = businessUnitReference;
    }

    public org.museframework.bian.classes.Object getBusinessUnitReference() {
        return businessUnitReference;
    }

    public void setProductandServiceReference(org.museframework.bian.classes.Object productandServiceReference) {
        this.productandServiceReference = productandServiceReference;
    }

    public org.museframework.bian.classes.Object getProductandServiceReference() {
        return productandServiceReference;
    }

    public void setCustomerReference(org.museframework.bian.classes.Object customerReference) {
        this.customerReference = customerReference;
    }

    public org.museframework.bian.classes.Object getCustomerReference() {
        return customerReference;
    }

    public void setRegulatoryAuthorityReference(org.museframework.bian.classes.Object regulatoryAuthorityReference) {
        this.regulatoryAuthorityReference = regulatoryAuthorityReference;
    }

    public org.museframework.bian.classes.Object getRegulatoryAuthorityReference() {
        return regulatoryAuthorityReference;
    }

    public void setRegulationReference(org.museframework.bian.classes.Object regulationReference) {
        this.regulationReference = regulationReference;
    }

    public org.museframework.bian.classes.Object getRegulationReference() {
        return regulationReference;
    }

    public void setRegulationDefinition(String regulationDefinition) {
        this.regulationDefinition = regulationDefinition;
    }

    public String getRegulationDefinition() {
        return regulationDefinition;
    }

    public void setRegulationComplianceandReportingRequirements(String regulationComplianceandReportingRequirements) {
        this.regulationComplianceandReportingRequirements = regulationComplianceandReportingRequirements;
    }

    public String getRegulationComplianceandReportingRequirements() {
        return regulationComplianceandReportingRequirements;
    }

    public void setRegulationAccountability(String regulationAccountability) {
        this.regulationAccountability = regulationAccountability;
    }

    public String getRegulationAccountability() {
        return regulationAccountability;
    }

    public void setRegulationPenalties(String regulationPenalties) {
        this.regulationPenalties = regulationPenalties;
    }

    public String getRegulationPenalties() {
        return regulationPenalties;
    }

    public void setRegulationGuideline(String regulationGuideline) {
        this.regulationGuideline = regulationGuideline;
    }

    public String getRegulationGuideline() {
        return regulationGuideline;
    }

    public void setDocumentReference(org.museframework.bian.classes.Object documentReference) {
        this.documentReference = documentReference;
    }

    public org.museframework.bian.classes.Object getDocumentReference() {
        return documentReference;
    }

    public void setRegulatoryAssessmentWorkProducts(String regulatoryAssessmentWorkProducts) {
        this.regulatoryAssessmentWorkProducts = regulatoryAssessmentWorkProducts;
    }

    public String getRegulatoryAssessmentWorkProducts() {
        return regulatoryAssessmentWorkProducts;
    }

    public void setRegulatoryAssessmentResult(String regulatoryAssessmentResult) {
        this.regulatoryAssessmentResult = regulatoryAssessmentResult;
    }

    public String getRegulatoryAssessmentResult() {
        return regulatoryAssessmentResult;
    }
}