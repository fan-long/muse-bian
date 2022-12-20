/*Oversee the working of a business unit, assign work, manage against a plan and troubleshoot issues  within Regulatory & Legal Authority.
Example: Manage the day to day activities at a bank branch location.*/
package org.museframework.bian.regandlegaut.dto.bq;

public class EstablishRelations {
    /*The required status/situation before the duty/obligation can be met*/
    private String establishRelationsPreconditions;

    /*The operating unit/employee responsible for undertaking the duty*/
    private org.museframework.bian.classes.Object establishRelationsBusinessUnitEmployeeReference;

    /*The timing and key actions/milestones involved in fulfilling the duty*/
    private String establishRelationsWorkSchedule;

    /*The Regulatory&Legal Authority Relationship ManagementPlan specific Business Service*/
    private org.museframework.bian.classes.BusinessService establishRelations;

    /*The completion status once the duty has been complied with (note the need to fulfill a duty may recur frequently)*/
    private String establishRelationsPostconditions;

    /*Reference to the specific business service type*/
    private String establishRelationsEstablishRelationsServiceType;

    /*Description of the performed business service*/
    private String establishRelationsEstablishRelationsServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    private String establishRelationsEstablishRelationsServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    private String establishRelationsEstablishRelationsServiceWorkProduct;

    /**/
    private String establishRelationsEstablishRelationsServiceName;

    public void setEstablishRelationsPreconditions(String establishRelationsPreconditions) {
        this.establishRelationsPreconditions = establishRelationsPreconditions;
    }

    public String getEstablishRelationsPreconditions() {
        return establishRelationsPreconditions;
    }

    public void setEstablishRelationsBusinessUnitEmployeeReference(org.museframework.bian.classes.Object establishRelationsBusinessUnitEmployeeReference) {
        this.establishRelationsBusinessUnitEmployeeReference = establishRelationsBusinessUnitEmployeeReference;
    }

    public org.museframework.bian.classes.Object getEstablishRelationsBusinessUnitEmployeeReference() {
        return establishRelationsBusinessUnitEmployeeReference;
    }

    public void setEstablishRelationsWorkSchedule(String establishRelationsWorkSchedule) {
        this.establishRelationsWorkSchedule = establishRelationsWorkSchedule;
    }

    public String getEstablishRelationsWorkSchedule() {
        return establishRelationsWorkSchedule;
    }

    public void setEstablishRelations(org.museframework.bian.classes.BusinessService establishRelations) {
        this.establishRelations = establishRelations;
    }

    public org.museframework.bian.classes.BusinessService getEstablishRelations() {
        return establishRelations;
    }

    public void setEstablishRelationsPostconditions(String establishRelationsPostconditions) {
        this.establishRelationsPostconditions = establishRelationsPostconditions;
    }

    public String getEstablishRelationsPostconditions() {
        return establishRelationsPostconditions;
    }

    public void setEstablishRelationsEstablishRelationsServiceType(String establishRelationsEstablishRelationsServiceType) {
        this.establishRelationsEstablishRelationsServiceType = establishRelationsEstablishRelationsServiceType;
    }

    public String getEstablishRelationsEstablishRelationsServiceType() {
        return establishRelationsEstablishRelationsServiceType;
    }

    public void setEstablishRelationsEstablishRelationsServiceDescription(String establishRelationsEstablishRelationsServiceDescription) {
        this.establishRelationsEstablishRelationsServiceDescription = establishRelationsEstablishRelationsServiceDescription;
    }

    public String getEstablishRelationsEstablishRelationsServiceDescription() {
        return establishRelationsEstablishRelationsServiceDescription;
    }

    public void setEstablishRelationsEstablishRelationsServiceInputsandOuputs(String establishRelationsEstablishRelationsServiceInputsandOuputs) {
        this.establishRelationsEstablishRelationsServiceInputsandOuputs = establishRelationsEstablishRelationsServiceInputsandOuputs;
    }

    public String getEstablishRelationsEstablishRelationsServiceInputsandOuputs() {
        return establishRelationsEstablishRelationsServiceInputsandOuputs;
    }

    public void setEstablishRelationsEstablishRelationsServiceWorkProduct(String establishRelationsEstablishRelationsServiceWorkProduct) {
        this.establishRelationsEstablishRelationsServiceWorkProduct = establishRelationsEstablishRelationsServiceWorkProduct;
    }

    public String getEstablishRelationsEstablishRelationsServiceWorkProduct() {
        return establishRelationsEstablishRelationsServiceWorkProduct;
    }

    public void setEstablishRelationsEstablishRelationsServiceName(String establishRelationsEstablishRelationsServiceName) {
        this.establishRelationsEstablishRelationsServiceName = establishRelationsEstablishRelationsServiceName;
    }

    public String getEstablishRelationsEstablishRelationsServiceName() {
        return establishRelationsEstablishRelationsServiceName;
    }
}