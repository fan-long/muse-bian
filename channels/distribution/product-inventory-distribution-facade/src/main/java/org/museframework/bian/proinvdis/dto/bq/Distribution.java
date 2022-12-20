/*Handle and assign the day to day activities, capture time, costs and income for an operational unit  within Product Inventory Distribution. 
Example: Administer the time reporting and billing for the specialist sales support team.*/
package org.museframework.bian.proinvdis.dto.bq;

public class Distribution {
    /*The required status/situation before the routine can be undertaken*/
    private String distributionPreconditions;

    /*The operating unit/employee responsible for performing the routine*/
    private org.museframework.bian.classes.Object distributionBusinessUnitEmployeeReference;

    /*The timing and key actions/milestones involved in completing the routine*/
    private String distributionWorkSchedule;

    /*The Product Inventory Distribution AdministrativePlan specific Business Service*/
    private org.museframework.bian.classes.BusinessService businessService;

    /*The completion status once the routine has been completed (note the need to fulfill a routine may recur frequently)*/
    private String distributionPostconditions;

    /*Reference to the specific business service type*/
    private String distributionServiceType;

    /*Description of the performed business service*/
    private String distributionServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    private String distributionServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    private String distributionServiceWorkProduct;

    /**/
    private String distributionServiceName;

    public void setDistributionPreconditions(String distributionPreconditions) {
        this.distributionPreconditions = distributionPreconditions;
    }

    public String getDistributionPreconditions() {
        return distributionPreconditions;
    }

    public void setDistributionBusinessUnitEmployeeReference(org.museframework.bian.classes.Object distributionBusinessUnitEmployeeReference) {
        this.distributionBusinessUnitEmployeeReference = distributionBusinessUnitEmployeeReference;
    }

    public org.museframework.bian.classes.Object getDistributionBusinessUnitEmployeeReference() {
        return distributionBusinessUnitEmployeeReference;
    }

    public void setDistributionWorkSchedule(String distributionWorkSchedule) {
        this.distributionWorkSchedule = distributionWorkSchedule;
    }

    public String getDistributionWorkSchedule() {
        return distributionWorkSchedule;
    }

    public void setBusinessService(org.museframework.bian.classes.BusinessService businessService) {
        this.businessService = businessService;
    }

    public org.museframework.bian.classes.BusinessService getBusinessService() {
        return businessService;
    }

    public void setDistributionPostconditions(String distributionPostconditions) {
        this.distributionPostconditions = distributionPostconditions;
    }

    public String getDistributionPostconditions() {
        return distributionPostconditions;
    }

    public void setDistributionServiceType(String distributionServiceType) {
        this.distributionServiceType = distributionServiceType;
    }

    public String getDistributionServiceType() {
        return distributionServiceType;
    }

    public void setDistributionServiceDescription(String distributionServiceDescription) {
        this.distributionServiceDescription = distributionServiceDescription;
    }

    public String getDistributionServiceDescription() {
        return distributionServiceDescription;
    }

    public void setDistributionServiceInputsandOuputs(String distributionServiceInputsandOuputs) {
        this.distributionServiceInputsandOuputs = distributionServiceInputsandOuputs;
    }

    public String getDistributionServiceInputsandOuputs() {
        return distributionServiceInputsandOuputs;
    }

    public void setDistributionServiceWorkProduct(String distributionServiceWorkProduct) {
        this.distributionServiceWorkProduct = distributionServiceWorkProduct;
    }

    public String getDistributionServiceWorkProduct() {
        return distributionServiceWorkProduct;
    }

    public void setDistributionServiceName(String distributionServiceName) {
        this.distributionServiceName = distributionServiceName;
    }

    public String getDistributionServiceName() {
        return distributionServiceName;
    }
}