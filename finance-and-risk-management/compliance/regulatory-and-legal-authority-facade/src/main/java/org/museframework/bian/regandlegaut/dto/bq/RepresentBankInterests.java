/*Oversee the working of a business unit, assign work, manage against a plan and troubleshoot issues  within Regulatory & Legal Authority.
Example: Manage the day to day activities at a bank branch location.*/
package org.museframework.bian.regandlegaut.dto.bq;

public class RepresentBankInterests {
    /*The required status/situation before the duty/obligation can be met*/
    private String representBankInterestsPreconditions;

    /*The operating unit/employee responsible for undertaking the duty*/
    private org.museframework.bian.classes.Object representBankInterestsBusinessUnitEmployeeReference;

    /*The timing and key actions/milestones involved in fulfilling the duty*/
    private String representBankInterestsWorkSchedule;

    /*The Regulatory&Legal Authority Relationship ManagementPlan specific Business Service*/
    private org.museframework.bian.classes.BusinessService businessService;

    /*The completion status once the duty has been complied with (note the need to fulfill a duty may recur frequently)*/
    private String representBankInterestsPostconditions;

    /*Reference to the specific business service type*/
    private String representBankInterestsServiceType;

    /*Description of the performed business service*/
    private String representBankInterestsServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    private String representBankInterestsServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    private String representBankInterestsServiceWorkProduct;

    /**/
    private String representBankInterestsServiceName;

    public void setRepresentBankInterestsPreconditions(String representBankInterestsPreconditions) {
        this.representBankInterestsPreconditions = representBankInterestsPreconditions;
    }

    public String getRepresentBankInterestsPreconditions() {
        return representBankInterestsPreconditions;
    }

    public void setRepresentBankInterestsBusinessUnitEmployeeReference(org.museframework.bian.classes.Object representBankInterestsBusinessUnitEmployeeReference) {
        this.representBankInterestsBusinessUnitEmployeeReference = representBankInterestsBusinessUnitEmployeeReference;
    }

    public org.museframework.bian.classes.Object getRepresentBankInterestsBusinessUnitEmployeeReference() {
        return representBankInterestsBusinessUnitEmployeeReference;
    }

    public void setRepresentBankInterestsWorkSchedule(String representBankInterestsWorkSchedule) {
        this.representBankInterestsWorkSchedule = representBankInterestsWorkSchedule;
    }

    public String getRepresentBankInterestsWorkSchedule() {
        return representBankInterestsWorkSchedule;
    }

    public void setBusinessService(org.museframework.bian.classes.BusinessService businessService) {
        this.businessService = businessService;
    }

    public org.museframework.bian.classes.BusinessService getBusinessService() {
        return businessService;
    }

    public void setRepresentBankInterestsPostconditions(String representBankInterestsPostconditions) {
        this.representBankInterestsPostconditions = representBankInterestsPostconditions;
    }

    public String getRepresentBankInterestsPostconditions() {
        return representBankInterestsPostconditions;
    }

    public void setRepresentBankInterestsServiceType(String representBankInterestsServiceType) {
        this.representBankInterestsServiceType = representBankInterestsServiceType;
    }

    public String getRepresentBankInterestsServiceType() {
        return representBankInterestsServiceType;
    }

    public void setRepresentBankInterestsServiceDescription(String representBankInterestsServiceDescription) {
        this.representBankInterestsServiceDescription = representBankInterestsServiceDescription;
    }

    public String getRepresentBankInterestsServiceDescription() {
        return representBankInterestsServiceDescription;
    }

    public void setRepresentBankInterestsServiceInputsandOuputs(String representBankInterestsServiceInputsandOuputs) {
        this.representBankInterestsServiceInputsandOuputs = representBankInterestsServiceInputsandOuputs;
    }

    public String getRepresentBankInterestsServiceInputsandOuputs() {
        return representBankInterestsServiceInputsandOuputs;
    }

    public void setRepresentBankInterestsServiceWorkProduct(String representBankInterestsServiceWorkProduct) {
        this.representBankInterestsServiceWorkProduct = representBankInterestsServiceWorkProduct;
    }

    public String getRepresentBankInterestsServiceWorkProduct() {
        return representBankInterestsServiceWorkProduct;
    }

    public void setRepresentBankInterestsServiceName(String representBankInterestsServiceName) {
        this.representBankInterestsServiceName = representBankInterestsServiceName;
    }

    public String getRepresentBankInterestsServiceName() {
        return representBankInterestsServiceName;
    }
}