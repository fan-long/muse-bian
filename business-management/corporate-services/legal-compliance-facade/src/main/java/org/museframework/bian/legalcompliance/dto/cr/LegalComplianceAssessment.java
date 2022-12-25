/*To test or assess an entity, possibly against some formal qualification or certification requirement within Legal Compliance. */
package org.museframework.bian.legalcompliance.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class LegalComplianceAssessment {
    /*The type of law that is applied by the assessment action*/
    @MetaField(0)
    private String legalAssessmentType;

    /*The business function or unit assessed if appropriate*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object businessUnitReference;

    /*The associated product/service being assessed if appropriate*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object productandServiceReference;

    /*Reference to the customer assessed if appropriate*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object customerReference;

    /*Indication of the legal jurisdiction that applies*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object jurisdictionReference;

    /*Reference to the specific law*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object lawReference;

    /*A definition of the required behavior to remain within the law*/
    @MetaField(0)
    private String lawDefinition;

    /*Description of the measurements and reporting required to demonstrate legal compliance*/
    @MetaField(0)
    private String lawComplianceandReportingRequirements;

    /*Explanation of the business context, responsibility and accountability for legal compliance*/
    @MetaField(0)
    private String lawComplianceAccountability;

    /*Outline of the possible implications of breaking the law*/
    @MetaField(0)
    private String legalPenalties;

    /*Guidelines and requirements for following the law*/
    @MetaField(0)
    private String legalGuideline;

    /*Reference to any documentation classified/archived as appropriate*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object documentReference;

    /*Work documentation, forms and schedules produced and referenced during the legal assessment action*/
    @MetaField(0)
    private String legalAssessmentWorkProducts;

    /*Outcome/result of the legal assessment, this can include remedial actions*/
    @MetaField(0)
    private String legalAssessmentResult;

    public void setLegalAssessmentType(String legalAssessmentType) {
        this.legalAssessmentType = legalAssessmentType;
    }

    public String getLegalAssessmentType() {
        return legalAssessmentType;
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

    public void setJurisdictionReference(org.museframework.bian.classes.Object jurisdictionReference) {
        this.jurisdictionReference = jurisdictionReference;
    }

    public org.museframework.bian.classes.Object getJurisdictionReference() {
        return jurisdictionReference;
    }

    public void setLawReference(org.museframework.bian.classes.Object lawReference) {
        this.lawReference = lawReference;
    }

    public org.museframework.bian.classes.Object getLawReference() {
        return lawReference;
    }

    public void setLawDefinition(String lawDefinition) {
        this.lawDefinition = lawDefinition;
    }

    public String getLawDefinition() {
        return lawDefinition;
    }

    public void setLawComplianceandReportingRequirements(String lawComplianceandReportingRequirements) {
        this.lawComplianceandReportingRequirements = lawComplianceandReportingRequirements;
    }

    public String getLawComplianceandReportingRequirements() {
        return lawComplianceandReportingRequirements;
    }

    public void setLawComplianceAccountability(String lawComplianceAccountability) {
        this.lawComplianceAccountability = lawComplianceAccountability;
    }

    public String getLawComplianceAccountability() {
        return lawComplianceAccountability;
    }

    public void setLegalPenalties(String legalPenalties) {
        this.legalPenalties = legalPenalties;
    }

    public String getLegalPenalties() {
        return legalPenalties;
    }

    public void setLegalGuideline(String legalGuideline) {
        this.legalGuideline = legalGuideline;
    }

    public String getLegalGuideline() {
        return legalGuideline;
    }

    public void setDocumentReference(org.museframework.bian.classes.Object documentReference) {
        this.documentReference = documentReference;
    }

    public org.museframework.bian.classes.Object getDocumentReference() {
        return documentReference;
    }

    public void setLegalAssessmentWorkProducts(String legalAssessmentWorkProducts) {
        this.legalAssessmentWorkProducts = legalAssessmentWorkProducts;
    }

    public String getLegalAssessmentWorkProducts() {
        return legalAssessmentWorkProducts;
    }

    public void setLegalAssessmentResult(String legalAssessmentResult) {
        this.legalAssessmentResult = legalAssessmentResult;
    }

    public String getLegalAssessmentResult() {
        return legalAssessmentResult;
    }
}