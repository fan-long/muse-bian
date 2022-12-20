/*Create and maintain a design for a procedure, product/service model or other such entity  within Management Manual. 
Example: Create and maintain product designs and analytical models.*/
package org.museframework.bian.managementmanual.dto.bq;

public class EmploymentRelatedProceduresandGuidelines {
    /*The required status/situation before the specification aspect can be defined*/
    private String employmentRelatedProceduresandGuidelinesPreconditions;

    /*The schedule and timing of the definition and update/revisions of the specification aspect*/
    private String employmentRelatedProceduresandGuidelinesSpecificationSchedule;

    /*The current version, and version history as appropriate for the specification aspect*/
    private String employmentRelatedProceduresandGuidelinesVersionNumber;

    /*The Management Manual Specification specific  Business Service*/
    private org.museframework.bian.classes.BusinessService employmentRelatedProceduresandGuidelines;

    /*Reference to the specific business service type*/
    private String employmentRelatedProceduresandGuidelinesServiceType;

    /*Description of the performed business service*/
    private String employmentRelatedProceduresandGuidelinesServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    private String employmentRelatedProceduresandGuidelinesServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    private String employmentRelatedProceduresandGuidelinesServiceWorkProduct;

    /**/
    private String employmentRelatedProceduresandGuidelinesServiceName;

    public void setEmploymentRelatedProceduresandGuidelinesPreconditions(String employmentRelatedProceduresandGuidelinesPreconditions) {
        this.employmentRelatedProceduresandGuidelinesPreconditions = employmentRelatedProceduresandGuidelinesPreconditions;
    }

    public String getEmploymentRelatedProceduresandGuidelinesPreconditions() {
        return employmentRelatedProceduresandGuidelinesPreconditions;
    }

    public void setEmploymentRelatedProceduresandGuidelinesSpecificationSchedule(String employmentRelatedProceduresandGuidelinesSpecificationSchedule) {
        this.employmentRelatedProceduresandGuidelinesSpecificationSchedule = employmentRelatedProceduresandGuidelinesSpecificationSchedule;
    }

    public String getEmploymentRelatedProceduresandGuidelinesSpecificationSchedule() {
        return employmentRelatedProceduresandGuidelinesSpecificationSchedule;
    }

    public void setEmploymentRelatedProceduresandGuidelinesVersionNumber(String employmentRelatedProceduresandGuidelinesVersionNumber) {
        this.employmentRelatedProceduresandGuidelinesVersionNumber = employmentRelatedProceduresandGuidelinesVersionNumber;
    }

    public String getEmploymentRelatedProceduresandGuidelinesVersionNumber() {
        return employmentRelatedProceduresandGuidelinesVersionNumber;
    }

    public void setEmploymentRelatedProceduresandGuidelines(org.museframework.bian.classes.BusinessService employmentRelatedProceduresandGuidelines) {
        this.employmentRelatedProceduresandGuidelines = employmentRelatedProceduresandGuidelines;
    }

    public org.museframework.bian.classes.BusinessService getEmploymentRelatedProceduresandGuidelines() {
        return employmentRelatedProceduresandGuidelines;
    }

    public void setEmploymentRelatedProceduresandGuidelinesServiceType(String employmentRelatedProceduresandGuidelinesServiceType) {
        this.employmentRelatedProceduresandGuidelinesServiceType = employmentRelatedProceduresandGuidelinesServiceType;
    }

    public String getEmploymentRelatedProceduresandGuidelinesServiceType() {
        return employmentRelatedProceduresandGuidelinesServiceType;
    }

    public void setEmploymentRelatedProceduresandGuidelinesServiceDescription(String employmentRelatedProceduresandGuidelinesServiceDescription) {
        this.employmentRelatedProceduresandGuidelinesServiceDescription = employmentRelatedProceduresandGuidelinesServiceDescription;
    }

    public String getEmploymentRelatedProceduresandGuidelinesServiceDescription() {
        return employmentRelatedProceduresandGuidelinesServiceDescription;
    }

    public void setEmploymentRelatedProceduresandGuidelinesServiceInputsandOuputs(String employmentRelatedProceduresandGuidelinesServiceInputsandOuputs) {
        this.employmentRelatedProceduresandGuidelinesServiceInputsandOuputs = employmentRelatedProceduresandGuidelinesServiceInputsandOuputs;
    }

    public String getEmploymentRelatedProceduresandGuidelinesServiceInputsandOuputs() {
        return employmentRelatedProceduresandGuidelinesServiceInputsandOuputs;
    }

    public void setEmploymentRelatedProceduresandGuidelinesServiceWorkProduct(String employmentRelatedProceduresandGuidelinesServiceWorkProduct) {
        this.employmentRelatedProceduresandGuidelinesServiceWorkProduct = employmentRelatedProceduresandGuidelinesServiceWorkProduct;
    }

    public String getEmploymentRelatedProceduresandGuidelinesServiceWorkProduct() {
        return employmentRelatedProceduresandGuidelinesServiceWorkProduct;
    }

    public void setEmploymentRelatedProceduresandGuidelinesServiceName(String employmentRelatedProceduresandGuidelinesServiceName) {
        this.employmentRelatedProceduresandGuidelinesServiceName = employmentRelatedProceduresandGuidelinesServiceName;
    }

    public String getEmploymentRelatedProceduresandGuidelinesServiceName() {
        return employmentRelatedProceduresandGuidelinesServiceName;
    }
}