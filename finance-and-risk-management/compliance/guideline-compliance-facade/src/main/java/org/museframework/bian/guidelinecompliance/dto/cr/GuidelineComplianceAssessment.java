/*To test or assess an entity, possibly against some formal qualification or certification requirement within Guideline Compliance. */
package org.museframework.bian.guidelinecompliance.dto.cr;

public class GuidelineComplianceAssessment {
    /*The type and make-up of guideline compliance tests referenced in the assessment*/
    private String guidelineComplianceAssessmentType;

    /*The business function or unit assessed for compliance if appropriate*/
    private org.museframework.bian.classes.Object businessUnitReference;

    /*The associated product/service being assessed if appropriate*/
    private org.museframework.bian.classes.Object productandServiceReference;

    /*Reference to the customer assessed if appropriate*/
    private org.museframework.bian.classes.Object customerReference;

    /*Reference to any documentation classified/archived as appropriate*/
    private org.museframework.bian.classes.Object documentReference;

    /*Work documentation, forms and schedules produced and referenced during the assessment*/
    private String guidelineComplianceAssessmentWorkProducts;

    /*Outcome/result of the assessment, can include remedial actions*/
    private String guidelineComplianceAssessmentResult;

    public void setGuidelineComplianceAssessmentType(String guidelineComplianceAssessmentType) {
        this.guidelineComplianceAssessmentType = guidelineComplianceAssessmentType;
    }

    public String getGuidelineComplianceAssessmentType() {
        return guidelineComplianceAssessmentType;
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

    public void setDocumentReference(org.museframework.bian.classes.Object documentReference) {
        this.documentReference = documentReference;
    }

    public org.museframework.bian.classes.Object getDocumentReference() {
        return documentReference;
    }

    public void setGuidelineComplianceAssessmentWorkProducts(String guidelineComplianceAssessmentWorkProducts) {
        this.guidelineComplianceAssessmentWorkProducts = guidelineComplianceAssessmentWorkProducts;
    }

    public String getGuidelineComplianceAssessmentWorkProducts() {
        return guidelineComplianceAssessmentWorkProducts;
    }

    public void setGuidelineComplianceAssessmentResult(String guidelineComplianceAssessmentResult) {
        this.guidelineComplianceAssessmentResult = guidelineComplianceAssessmentResult;
    }

    public String getGuidelineComplianceAssessmentResult() {
        return guidelineComplianceAssessmentResult;
    }
}