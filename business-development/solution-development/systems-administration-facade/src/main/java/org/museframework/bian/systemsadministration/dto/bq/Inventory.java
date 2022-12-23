/*Handle and assign the day to day activities, capture time, costs and income for an operational unit  within Systems Administration. 
Example: Administer the time reporting and billing for the specialist sales support team.*/
package org.museframework.bian.systemsadministration.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Inventory {
    /*The required status/situation before the routine can be undertaken*/
    @MetaField
    private String inventoryPreconditions;

    /*The operating unit/employee responsible for performing the routine*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object inventoryBusinessUnitEmployeeReference;

    /*The timing and key actions/milestones involved in completing the routine*/
    @MetaField
    private String inventoryWorkSchedule;

    /*The ITSystem Administrative Plan specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService businessService;

    /*The completion status once the routine has been completed (note the need to fulfill a routine may recur frequently)*/
    @MetaField
    private String inventoryPostconditions;

    /*Reference to the specific business service type*/
    @MetaField
    private String inventoryServiceType;

    /*Description of the performed business service*/
    @MetaField
    private String inventoryServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    @MetaField
    private String inventoryServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    @MetaField
    private String inventoryServiceWorkProduct;

    /**/
    @MetaField
    private String inventoryServiceName;

    public void setInventoryPreconditions(String inventoryPreconditions) {
        this.inventoryPreconditions = inventoryPreconditions;
    }

    public String getInventoryPreconditions() {
        return inventoryPreconditions;
    }

    public void setInventoryBusinessUnitEmployeeReference(org.museframework.bian.classes.Object inventoryBusinessUnitEmployeeReference) {
        this.inventoryBusinessUnitEmployeeReference = inventoryBusinessUnitEmployeeReference;
    }

    public org.museframework.bian.classes.Object getInventoryBusinessUnitEmployeeReference() {
        return inventoryBusinessUnitEmployeeReference;
    }

    public void setInventoryWorkSchedule(String inventoryWorkSchedule) {
        this.inventoryWorkSchedule = inventoryWorkSchedule;
    }

    public String getInventoryWorkSchedule() {
        return inventoryWorkSchedule;
    }

    public void setBusinessService(org.museframework.bian.classes.BusinessService businessService) {
        this.businessService = businessService;
    }

    public org.museframework.bian.classes.BusinessService getBusinessService() {
        return businessService;
    }

    public void setInventoryPostconditions(String inventoryPostconditions) {
        this.inventoryPostconditions = inventoryPostconditions;
    }

    public String getInventoryPostconditions() {
        return inventoryPostconditions;
    }

    public void setInventoryServiceType(String inventoryServiceType) {
        this.inventoryServiceType = inventoryServiceType;
    }

    public String getInventoryServiceType() {
        return inventoryServiceType;
    }

    public void setInventoryServiceDescription(String inventoryServiceDescription) {
        this.inventoryServiceDescription = inventoryServiceDescription;
    }

    public String getInventoryServiceDescription() {
        return inventoryServiceDescription;
    }

    public void setInventoryServiceInputsandOuputs(String inventoryServiceInputsandOuputs) {
        this.inventoryServiceInputsandOuputs = inventoryServiceInputsandOuputs;
    }

    public String getInventoryServiceInputsandOuputs() {
        return inventoryServiceInputsandOuputs;
    }

    public void setInventoryServiceWorkProduct(String inventoryServiceWorkProduct) {
        this.inventoryServiceWorkProduct = inventoryServiceWorkProduct;
    }

    public String getInventoryServiceWorkProduct() {
        return inventoryServiceWorkProduct;
    }

    public void setInventoryServiceName(String inventoryServiceName) {
        this.inventoryServiceName = inventoryServiceName;
    }

    public String getInventoryServiceName() {
        return inventoryServiceName;
    }
}