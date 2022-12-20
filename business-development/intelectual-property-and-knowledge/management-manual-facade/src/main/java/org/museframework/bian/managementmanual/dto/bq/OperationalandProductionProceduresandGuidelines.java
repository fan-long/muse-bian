/*Create and maintain a design for a procedure, product/service model or other such entity  within Management Manual. 
Example: Create and maintain product designs and analytical models.*/
package org.museframework.bian.managementmanual.dto.bq;

public class OperationalandProductionProceduresandGuidelines {
    /*The required status/situation before the specification aspect can be defined*/
    private String operationalandProductionProceduresandGuidelinesPreconditions;

    /*The schedule and timing of the definition and update/revisions of the specification aspect*/
    private String operationalandProductionProceduresandGuidelinesSpecificationSchedule;

    /*The current version, and version history as appropriate for the specification aspect*/
    private String operationalandProductionProceduresandGuidelinesVersionNumber;

    /*The Management Manual Specification specific  Business Service*/
    private org.museframework.bian.classes.BusinessService operationalandProductionProceduresandGuidelines;

    /*Reference to the specific business service type*/
    private String operationalandProductionProceduresandGuidelinesServiceType;

    /*Description of the performed business service*/
    private String operationalandProductionProceduresandGuidelinesServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    private String operationalandProductionProceduresandGuidelinesServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    private String operationalandProductionProceduresandGuidelinesServiceWorkProduct;

    /**/
    private String operationalandProductionProceduresandGuidelinesServiceName;

    public void setOperationalandProductionProceduresandGuidelinesPreconditions(String operationalandProductionProceduresandGuidelinesPreconditions) {
        this.operationalandProductionProceduresandGuidelinesPreconditions = operationalandProductionProceduresandGuidelinesPreconditions;
    }

    public String getOperationalandProductionProceduresandGuidelinesPreconditions() {
        return operationalandProductionProceduresandGuidelinesPreconditions;
    }

    public void setOperationalandProductionProceduresandGuidelinesSpecificationSchedule(String operationalandProductionProceduresandGuidelinesSpecificationSchedule) {
        this.operationalandProductionProceduresandGuidelinesSpecificationSchedule = operationalandProductionProceduresandGuidelinesSpecificationSchedule;
    }

    public String getOperationalandProductionProceduresandGuidelinesSpecificationSchedule() {
        return operationalandProductionProceduresandGuidelinesSpecificationSchedule;
    }

    public void setOperationalandProductionProceduresandGuidelinesVersionNumber(String operationalandProductionProceduresandGuidelinesVersionNumber) {
        this.operationalandProductionProceduresandGuidelinesVersionNumber = operationalandProductionProceduresandGuidelinesVersionNumber;
    }

    public String getOperationalandProductionProceduresandGuidelinesVersionNumber() {
        return operationalandProductionProceduresandGuidelinesVersionNumber;
    }

    public void setOperationalandProductionProceduresandGuidelines(org.museframework.bian.classes.BusinessService operationalandProductionProceduresandGuidelines) {
        this.operationalandProductionProceduresandGuidelines = operationalandProductionProceduresandGuidelines;
    }

    public org.museframework.bian.classes.BusinessService getOperationalandProductionProceduresandGuidelines() {
        return operationalandProductionProceduresandGuidelines;
    }

    public void setOperationalandProductionProceduresandGuidelinesServiceType(String operationalandProductionProceduresandGuidelinesServiceType) {
        this.operationalandProductionProceduresandGuidelinesServiceType = operationalandProductionProceduresandGuidelinesServiceType;
    }

    public String getOperationalandProductionProceduresandGuidelinesServiceType() {
        return operationalandProductionProceduresandGuidelinesServiceType;
    }

    public void setOperationalandProductionProceduresandGuidelinesServiceDescription(String operationalandProductionProceduresandGuidelinesServiceDescription) {
        this.operationalandProductionProceduresandGuidelinesServiceDescription = operationalandProductionProceduresandGuidelinesServiceDescription;
    }

    public String getOperationalandProductionProceduresandGuidelinesServiceDescription() {
        return operationalandProductionProceduresandGuidelinesServiceDescription;
    }

    public void setOperationalandProductionProceduresandGuidelinesServiceInputsandOuputs(String operationalandProductionProceduresandGuidelinesServiceInputsandOuputs) {
        this.operationalandProductionProceduresandGuidelinesServiceInputsandOuputs = operationalandProductionProceduresandGuidelinesServiceInputsandOuputs;
    }

    public String getOperationalandProductionProceduresandGuidelinesServiceInputsandOuputs() {
        return operationalandProductionProceduresandGuidelinesServiceInputsandOuputs;
    }

    public void setOperationalandProductionProceduresandGuidelinesServiceWorkProduct(String operationalandProductionProceduresandGuidelinesServiceWorkProduct) {
        this.operationalandProductionProceduresandGuidelinesServiceWorkProduct = operationalandProductionProceduresandGuidelinesServiceWorkProduct;
    }

    public String getOperationalandProductionProceduresandGuidelinesServiceWorkProduct() {
        return operationalandProductionProceduresandGuidelinesServiceWorkProduct;
    }

    public void setOperationalandProductionProceduresandGuidelinesServiceName(String operationalandProductionProceduresandGuidelinesServiceName) {
        this.operationalandProductionProceduresandGuidelinesServiceName = operationalandProductionProceduresandGuidelinesServiceName;
    }

    public String getOperationalandProductionProceduresandGuidelinesServiceName() {
        return operationalandProductionProceduresandGuidelinesServiceName;
    }
}