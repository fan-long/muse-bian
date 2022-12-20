/*A collection of one or more clerical routines that are to be followed to administer the operational unit/function

Examples: Time-sheet recording*/
package org.museframework.bian.leaiteadm.dto.bq;

public class Valuation {
    /*The required status/situation before the routine can be undertaken*/
    private String valuationPreconditions;

    /*The operating unit/employee responsible for performing the routine*/
    private org.museframework.bian.classes.Object valuationBusinessUnitEmployeeReference;

    /*The timing and key actions/milestones involved in completing the routine*/
    private String valuationWorkSchedule;

    /*The Leasing Item Administrative Plan specific Business Service*/
    private org.museframework.bian.classes.BusinessService businessService;

    /*The completion status once the routine has been completed (note the need to fulfill a routine may recur frequently)*/
    private String valuationPostconditions;

    /*Reference to the specific business service type*/
    private String valuationServiceType;

    /*Description of the performed business service*/
    private String valuationServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    private String valuationServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    private String valuationServiceWorkProduct;

    /**/
    private String valuationServiceName;

    public void setValuationPreconditions(String valuationPreconditions) {
        this.valuationPreconditions = valuationPreconditions;
    }

    public String getValuationPreconditions() {
        return valuationPreconditions;
    }

    public void setValuationBusinessUnitEmployeeReference(org.museframework.bian.classes.Object valuationBusinessUnitEmployeeReference) {
        this.valuationBusinessUnitEmployeeReference = valuationBusinessUnitEmployeeReference;
    }

    public org.museframework.bian.classes.Object getValuationBusinessUnitEmployeeReference() {
        return valuationBusinessUnitEmployeeReference;
    }

    public void setValuationWorkSchedule(String valuationWorkSchedule) {
        this.valuationWorkSchedule = valuationWorkSchedule;
    }

    public String getValuationWorkSchedule() {
        return valuationWorkSchedule;
    }

    public void setBusinessService(org.museframework.bian.classes.BusinessService businessService) {
        this.businessService = businessService;
    }

    public org.museframework.bian.classes.BusinessService getBusinessService() {
        return businessService;
    }

    public void setValuationPostconditions(String valuationPostconditions) {
        this.valuationPostconditions = valuationPostconditions;
    }

    public String getValuationPostconditions() {
        return valuationPostconditions;
    }

    public void setValuationServiceType(String valuationServiceType) {
        this.valuationServiceType = valuationServiceType;
    }

    public String getValuationServiceType() {
        return valuationServiceType;
    }

    public void setValuationServiceDescription(String valuationServiceDescription) {
        this.valuationServiceDescription = valuationServiceDescription;
    }

    public String getValuationServiceDescription() {
        return valuationServiceDescription;
    }

    public void setValuationServiceInputsandOuputs(String valuationServiceInputsandOuputs) {
        this.valuationServiceInputsandOuputs = valuationServiceInputsandOuputs;
    }

    public String getValuationServiceInputsandOuputs() {
        return valuationServiceInputsandOuputs;
    }

    public void setValuationServiceWorkProduct(String valuationServiceWorkProduct) {
        this.valuationServiceWorkProduct = valuationServiceWorkProduct;
    }

    public String getValuationServiceWorkProduct() {
        return valuationServiceWorkProduct;
    }

    public void setValuationServiceName(String valuationServiceName) {
        this.valuationServiceName = valuationServiceName;
    }

    public String getValuationServiceName() {
        return valuationServiceName;
    }
}