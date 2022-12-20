/*Handle and assign the day to day activities, capture time, costs and income for an operational unit  within Product Inventory Distribution. 
Example: Administer the time reporting and billing for the specialist sales support team.*/
package org.museframework.bian.proinvdis.dto.bq;

public class Provisioning {
    /*The required status/situation before the routine can be undertaken*/
    private String provisioningPreconditions;

    /*The operating unit/employee responsible for performing the routine*/
    private org.museframework.bian.classes.Object provisioningBusinessUnitEmployeeReference;

    /*The timing and key actions/milestones involved in completing the routine*/
    private String provisioningWorkSchedule;

    /*The Product Inventory Distribution AdministrativePlan specific Business Service*/
    private org.museframework.bian.classes.BusinessService businessService;

    /*The completion status once the routine has been completed (note the need to fulfill a routine may recur frequently)*/
    private String provisioningPostconditions;

    /*Reference to the specific business service type*/
    private String provisioningServiceType;

    /*Description of the performed business service*/
    private String provisioningServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    private String provisioningServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    private String provisioningServiceWorkProduct;

    /**/
    private String provisioningServiceName;

    public void setProvisioningPreconditions(String provisioningPreconditions) {
        this.provisioningPreconditions = provisioningPreconditions;
    }

    public String getProvisioningPreconditions() {
        return provisioningPreconditions;
    }

    public void setProvisioningBusinessUnitEmployeeReference(org.museframework.bian.classes.Object provisioningBusinessUnitEmployeeReference) {
        this.provisioningBusinessUnitEmployeeReference = provisioningBusinessUnitEmployeeReference;
    }

    public org.museframework.bian.classes.Object getProvisioningBusinessUnitEmployeeReference() {
        return provisioningBusinessUnitEmployeeReference;
    }

    public void setProvisioningWorkSchedule(String provisioningWorkSchedule) {
        this.provisioningWorkSchedule = provisioningWorkSchedule;
    }

    public String getProvisioningWorkSchedule() {
        return provisioningWorkSchedule;
    }

    public void setBusinessService(org.museframework.bian.classes.BusinessService businessService) {
        this.businessService = businessService;
    }

    public org.museframework.bian.classes.BusinessService getBusinessService() {
        return businessService;
    }

    public void setProvisioningPostconditions(String provisioningPostconditions) {
        this.provisioningPostconditions = provisioningPostconditions;
    }

    public String getProvisioningPostconditions() {
        return provisioningPostconditions;
    }

    public void setProvisioningServiceType(String provisioningServiceType) {
        this.provisioningServiceType = provisioningServiceType;
    }

    public String getProvisioningServiceType() {
        return provisioningServiceType;
    }

    public void setProvisioningServiceDescription(String provisioningServiceDescription) {
        this.provisioningServiceDescription = provisioningServiceDescription;
    }

    public String getProvisioningServiceDescription() {
        return provisioningServiceDescription;
    }

    public void setProvisioningServiceInputsandOuputs(String provisioningServiceInputsandOuputs) {
        this.provisioningServiceInputsandOuputs = provisioningServiceInputsandOuputs;
    }

    public String getProvisioningServiceInputsandOuputs() {
        return provisioningServiceInputsandOuputs;
    }

    public void setProvisioningServiceWorkProduct(String provisioningServiceWorkProduct) {
        this.provisioningServiceWorkProduct = provisioningServiceWorkProduct;
    }

    public String getProvisioningServiceWorkProduct() {
        return provisioningServiceWorkProduct;
    }

    public void setProvisioningServiceName(String provisioningServiceName) {
        this.provisioningServiceName = provisioningServiceName;
    }

    public String getProvisioningServiceName() {
        return provisioningServiceName;
    }
}