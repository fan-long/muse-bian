/*Handle and assign the day to day activities, capture time, costs and income for an operational unit  within Compliance Reporting. 
Example: Administer the time reporting and billing for the specialist sales support team.*/
package org.museframework.bian.compliancereporting.dto.bq;

public class Consolidation {
    /*The required status/situation before the routine can be undertaken*/
    private String consolidationPreconditions;

    /*The operating unit/employee responsible for performing the routine*/
    private org.museframework.bian.classes.Object consolidationBusinessUnitEmployeeReference;

    /*The timing and key actions/milestones involved in completing the routine*/
    private String consolidationWorkSchedule;

    /*The Compliance Reporting Administrative Plan specific Business Service*/
    private org.museframework.bian.classes.BusinessService businessService;

    /*The completion status once the routine has been completed (note the need to fulfill a routine may recur frequently)*/
    private String consolidationPostconditions;

    /*Reference to the specific business service type*/
    private String consolidationServiceType;

    /*Description of the performed business service*/
    private String consolidationServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    private String consolidationServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    private String consolidationServiceWorkProduct;

    /**/
    private String consolidationServiceName;

    public void setConsolidationPreconditions(String consolidationPreconditions) {
        this.consolidationPreconditions = consolidationPreconditions;
    }

    public String getConsolidationPreconditions() {
        return consolidationPreconditions;
    }

    public void setConsolidationBusinessUnitEmployeeReference(org.museframework.bian.classes.Object consolidationBusinessUnitEmployeeReference) {
        this.consolidationBusinessUnitEmployeeReference = consolidationBusinessUnitEmployeeReference;
    }

    public org.museframework.bian.classes.Object getConsolidationBusinessUnitEmployeeReference() {
        return consolidationBusinessUnitEmployeeReference;
    }

    public void setConsolidationWorkSchedule(String consolidationWorkSchedule) {
        this.consolidationWorkSchedule = consolidationWorkSchedule;
    }

    public String getConsolidationWorkSchedule() {
        return consolidationWorkSchedule;
    }

    public void setBusinessService(org.museframework.bian.classes.BusinessService businessService) {
        this.businessService = businessService;
    }

    public org.museframework.bian.classes.BusinessService getBusinessService() {
        return businessService;
    }

    public void setConsolidationPostconditions(String consolidationPostconditions) {
        this.consolidationPostconditions = consolidationPostconditions;
    }

    public String getConsolidationPostconditions() {
        return consolidationPostconditions;
    }

    public void setConsolidationServiceType(String consolidationServiceType) {
        this.consolidationServiceType = consolidationServiceType;
    }

    public String getConsolidationServiceType() {
        return consolidationServiceType;
    }

    public void setConsolidationServiceDescription(String consolidationServiceDescription) {
        this.consolidationServiceDescription = consolidationServiceDescription;
    }

    public String getConsolidationServiceDescription() {
        return consolidationServiceDescription;
    }

    public void setConsolidationServiceInputsandOuputs(String consolidationServiceInputsandOuputs) {
        this.consolidationServiceInputsandOuputs = consolidationServiceInputsandOuputs;
    }

    public String getConsolidationServiceInputsandOuputs() {
        return consolidationServiceInputsandOuputs;
    }

    public void setConsolidationServiceWorkProduct(String consolidationServiceWorkProduct) {
        this.consolidationServiceWorkProduct = consolidationServiceWorkProduct;
    }

    public String getConsolidationServiceWorkProduct() {
        return consolidationServiceWorkProduct;
    }

    public void setConsolidationServiceName(String consolidationServiceName) {
        this.consolidationServiceName = consolidationServiceName;
    }

    public String getConsolidationServiceName() {
        return consolidationServiceName;
    }
}