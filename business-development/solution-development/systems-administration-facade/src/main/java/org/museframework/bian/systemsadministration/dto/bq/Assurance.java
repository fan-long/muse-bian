/*Handle and assign the day to day activities, capture time, costs and income for an operational unit  within Systems Administration. 
Example: Administer the time reporting and billing for the specialist sales support team.*/
package org.museframework.bian.systemsadministration.dto.bq;

public class Assurance {
    /*The required status/situation before the routine can be undertaken*/
    private String assurancePreconditions;

    /*The operating unit/employee responsible for performing the routine*/
    private org.museframework.bian.classes.Object assuranceBusinessUnitEmployeeReference;

    /*The timing and key actions/milestones involved in completing the routine*/
    private String assuranceWorkSchedule;

    /*The ITSystem Administrative Plan specific Business Service*/
    private org.museframework.bian.classes.BusinessService collateralItemAssurance;

    /*The completion status once the routine has been completed (note the need to fulfill a routine may recur frequently)*/
    private String assurancePostconditions;

    /*Reference to the specific business service type*/
    private String assuranceCollateralItemAssuranceServiceType;

    /*Description of the performed business service*/
    private String assuranceCollateralItemAssuranceServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    private String assuranceCollateralItemAssuranceServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    private String assuranceCollateralItemAssuranceServiceWorkProduct;

    /**/
    private String assuranceCollateralItemAssuranceServiceName;

    public void setAssurancePreconditions(String assurancePreconditions) {
        this.assurancePreconditions = assurancePreconditions;
    }

    public String getAssurancePreconditions() {
        return assurancePreconditions;
    }

    public void setAssuranceBusinessUnitEmployeeReference(org.museframework.bian.classes.Object assuranceBusinessUnitEmployeeReference) {
        this.assuranceBusinessUnitEmployeeReference = assuranceBusinessUnitEmployeeReference;
    }

    public org.museframework.bian.classes.Object getAssuranceBusinessUnitEmployeeReference() {
        return assuranceBusinessUnitEmployeeReference;
    }

    public void setAssuranceWorkSchedule(String assuranceWorkSchedule) {
        this.assuranceWorkSchedule = assuranceWorkSchedule;
    }

    public String getAssuranceWorkSchedule() {
        return assuranceWorkSchedule;
    }

    public void setCollateralItemAssurance(org.museframework.bian.classes.BusinessService collateralItemAssurance) {
        this.collateralItemAssurance = collateralItemAssurance;
    }

    public org.museframework.bian.classes.BusinessService getCollateralItemAssurance() {
        return collateralItemAssurance;
    }

    public void setAssurancePostconditions(String assurancePostconditions) {
        this.assurancePostconditions = assurancePostconditions;
    }

    public String getAssurancePostconditions() {
        return assurancePostconditions;
    }

    public void setAssuranceCollateralItemAssuranceServiceType(String assuranceCollateralItemAssuranceServiceType) {
        this.assuranceCollateralItemAssuranceServiceType = assuranceCollateralItemAssuranceServiceType;
    }

    public String getAssuranceCollateralItemAssuranceServiceType() {
        return assuranceCollateralItemAssuranceServiceType;
    }

    public void setAssuranceCollateralItemAssuranceServiceDescription(String assuranceCollateralItemAssuranceServiceDescription) {
        this.assuranceCollateralItemAssuranceServiceDescription = assuranceCollateralItemAssuranceServiceDescription;
    }

    public String getAssuranceCollateralItemAssuranceServiceDescription() {
        return assuranceCollateralItemAssuranceServiceDescription;
    }

    public void setAssuranceCollateralItemAssuranceServiceInputsandOuputs(String assuranceCollateralItemAssuranceServiceInputsandOuputs) {
        this.assuranceCollateralItemAssuranceServiceInputsandOuputs = assuranceCollateralItemAssuranceServiceInputsandOuputs;
    }

    public String getAssuranceCollateralItemAssuranceServiceInputsandOuputs() {
        return assuranceCollateralItemAssuranceServiceInputsandOuputs;
    }

    public void setAssuranceCollateralItemAssuranceServiceWorkProduct(String assuranceCollateralItemAssuranceServiceWorkProduct) {
        this.assuranceCollateralItemAssuranceServiceWorkProduct = assuranceCollateralItemAssuranceServiceWorkProduct;
    }

    public String getAssuranceCollateralItemAssuranceServiceWorkProduct() {
        return assuranceCollateralItemAssuranceServiceWorkProduct;
    }

    public void setAssuranceCollateralItemAssuranceServiceName(String assuranceCollateralItemAssuranceServiceName) {
        this.assuranceCollateralItemAssuranceServiceName = assuranceCollateralItemAssuranceServiceName;
    }

    public String getAssuranceCollateralItemAssuranceServiceName() {
        return assuranceCollateralItemAssuranceServiceName;
    }
}