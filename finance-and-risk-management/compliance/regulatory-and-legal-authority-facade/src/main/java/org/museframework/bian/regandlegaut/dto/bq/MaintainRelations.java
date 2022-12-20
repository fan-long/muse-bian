/*Oversee the working of a business unit, assign work, manage against a plan and troubleshoot issues  within Regulatory & Legal Authority.
Example: Manage the day to day activities at a bank branch location.*/
package org.museframework.bian.regandlegaut.dto.bq;

public class MaintainRelations {
    /*The required status/situation before the duty/obligation can be met*/
    private String maintainRelationsPreconditions;

    /*The operating unit/employee responsible for undertaking the duty*/
    private org.museframework.bian.classes.Object maintainRelationsBusinessUnitEmployeeReference;

    /*The timing and key actions/milestones involved in fulfilling the duty*/
    private String maintainRelationsWorkSchedule;

    /*The Regulatory&Legal Authority Relationship ManagementPlan specific Business Service*/
    private org.museframework.bian.classes.BusinessService maintainRelations;

    /*The completion status once the duty has been complied with (note the need to fulfill a duty may recur frequently)*/
    private String maintainRelationsPostconditions;

    /*Reference to the specific business service type*/
    private String maintainRelationsMaintainRelationsServiceType;

    /*Description of the performed business service*/
    private String maintainRelationsMaintainRelationsServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    private String maintainRelationsMaintainRelationsServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    private String maintainRelationsMaintainRelationsServiceWorkProduct;

    /**/
    private String maintainRelationsMaintainRelationsServiceName;

    public void setMaintainRelationsPreconditions(String maintainRelationsPreconditions) {
        this.maintainRelationsPreconditions = maintainRelationsPreconditions;
    }

    public String getMaintainRelationsPreconditions() {
        return maintainRelationsPreconditions;
    }

    public void setMaintainRelationsBusinessUnitEmployeeReference(org.museframework.bian.classes.Object maintainRelationsBusinessUnitEmployeeReference) {
        this.maintainRelationsBusinessUnitEmployeeReference = maintainRelationsBusinessUnitEmployeeReference;
    }

    public org.museframework.bian.classes.Object getMaintainRelationsBusinessUnitEmployeeReference() {
        return maintainRelationsBusinessUnitEmployeeReference;
    }

    public void setMaintainRelationsWorkSchedule(String maintainRelationsWorkSchedule) {
        this.maintainRelationsWorkSchedule = maintainRelationsWorkSchedule;
    }

    public String getMaintainRelationsWorkSchedule() {
        return maintainRelationsWorkSchedule;
    }

    public void setMaintainRelations(org.museframework.bian.classes.BusinessService maintainRelations) {
        this.maintainRelations = maintainRelations;
    }

    public org.museframework.bian.classes.BusinessService getMaintainRelations() {
        return maintainRelations;
    }

    public void setMaintainRelationsPostconditions(String maintainRelationsPostconditions) {
        this.maintainRelationsPostconditions = maintainRelationsPostconditions;
    }

    public String getMaintainRelationsPostconditions() {
        return maintainRelationsPostconditions;
    }

    public void setMaintainRelationsMaintainRelationsServiceType(String maintainRelationsMaintainRelationsServiceType) {
        this.maintainRelationsMaintainRelationsServiceType = maintainRelationsMaintainRelationsServiceType;
    }

    public String getMaintainRelationsMaintainRelationsServiceType() {
        return maintainRelationsMaintainRelationsServiceType;
    }

    public void setMaintainRelationsMaintainRelationsServiceDescription(String maintainRelationsMaintainRelationsServiceDescription) {
        this.maintainRelationsMaintainRelationsServiceDescription = maintainRelationsMaintainRelationsServiceDescription;
    }

    public String getMaintainRelationsMaintainRelationsServiceDescription() {
        return maintainRelationsMaintainRelationsServiceDescription;
    }

    public void setMaintainRelationsMaintainRelationsServiceInputsandOuputs(String maintainRelationsMaintainRelationsServiceInputsandOuputs) {
        this.maintainRelationsMaintainRelationsServiceInputsandOuputs = maintainRelationsMaintainRelationsServiceInputsandOuputs;
    }

    public String getMaintainRelationsMaintainRelationsServiceInputsandOuputs() {
        return maintainRelationsMaintainRelationsServiceInputsandOuputs;
    }

    public void setMaintainRelationsMaintainRelationsServiceWorkProduct(String maintainRelationsMaintainRelationsServiceWorkProduct) {
        this.maintainRelationsMaintainRelationsServiceWorkProduct = maintainRelationsMaintainRelationsServiceWorkProduct;
    }

    public String getMaintainRelationsMaintainRelationsServiceWorkProduct() {
        return maintainRelationsMaintainRelationsServiceWorkProduct;
    }

    public void setMaintainRelationsMaintainRelationsServiceName(String maintainRelationsMaintainRelationsServiceName) {
        this.maintainRelationsMaintainRelationsServiceName = maintainRelationsMaintainRelationsServiceName;
    }

    public String getMaintainRelationsMaintainRelationsServiceName() {
        return maintainRelationsMaintainRelationsServiceName;
    }
}