/*The main worsteps to be followed in th eexecution of the procedure

Examples: Invoice generation*/
package org.museframework.bian.bracurdis.dto.bq;

public class InventoryProvisioning {
    /*The required status/situation and or tasks that need to be completed prior to the initiation of the workstep*/
    private String inventoryProvisioningPreconditions;

    /*The operating unit/employee responsible for the workstep*/
    private org.museframework.bian.classes.Object inventoryProvisioningBusinessUnitEmployeeReference;

    /*The timing and key actions/milestones making up the workstep*/
    private String inventoryProvisioningWorkSchedule;

    /*The Cash Distribution Procedure specific Business Service*/
    private org.museframework.bian.classes.BusinessService inventoryProvisioning;

    /*The completion status and reference to subsequent actions that may be triggered on completion of the workstep*/
    private String inventoryProvisioningPostconditions;

    /*Reference to the specific business service type*/
    private String inventoryProvisioningInventoryProvisioningServiceType;

    /*Description of the performed business service*/
    private String inventoryProvisioningInventoryProvisioningServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    private String inventoryProvisioningInventoryProvisioningServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    private String inventoryProvisioningInventoryProvisioningServiceWorkProduct;

    /**/
    private String inventoryProvisioningInventoryProvisioningServiceName;

    public void setInventoryProvisioningPreconditions(String inventoryProvisioningPreconditions) {
        this.inventoryProvisioningPreconditions = inventoryProvisioningPreconditions;
    }

    public String getInventoryProvisioningPreconditions() {
        return inventoryProvisioningPreconditions;
    }

    public void setInventoryProvisioningBusinessUnitEmployeeReference(org.museframework.bian.classes.Object inventoryProvisioningBusinessUnitEmployeeReference) {
        this.inventoryProvisioningBusinessUnitEmployeeReference = inventoryProvisioningBusinessUnitEmployeeReference;
    }

    public org.museframework.bian.classes.Object getInventoryProvisioningBusinessUnitEmployeeReference() {
        return inventoryProvisioningBusinessUnitEmployeeReference;
    }

    public void setInventoryProvisioningWorkSchedule(String inventoryProvisioningWorkSchedule) {
        this.inventoryProvisioningWorkSchedule = inventoryProvisioningWorkSchedule;
    }

    public String getInventoryProvisioningWorkSchedule() {
        return inventoryProvisioningWorkSchedule;
    }

    public void setInventoryProvisioning(org.museframework.bian.classes.BusinessService inventoryProvisioning) {
        this.inventoryProvisioning = inventoryProvisioning;
    }

    public org.museframework.bian.classes.BusinessService getInventoryProvisioning() {
        return inventoryProvisioning;
    }

    public void setInventoryProvisioningPostconditions(String inventoryProvisioningPostconditions) {
        this.inventoryProvisioningPostconditions = inventoryProvisioningPostconditions;
    }

    public String getInventoryProvisioningPostconditions() {
        return inventoryProvisioningPostconditions;
    }

    public void setInventoryProvisioningInventoryProvisioningServiceType(String inventoryProvisioningInventoryProvisioningServiceType) {
        this.inventoryProvisioningInventoryProvisioningServiceType = inventoryProvisioningInventoryProvisioningServiceType;
    }

    public String getInventoryProvisioningInventoryProvisioningServiceType() {
        return inventoryProvisioningInventoryProvisioningServiceType;
    }

    public void setInventoryProvisioningInventoryProvisioningServiceDescription(String inventoryProvisioningInventoryProvisioningServiceDescription) {
        this.inventoryProvisioningInventoryProvisioningServiceDescription = inventoryProvisioningInventoryProvisioningServiceDescription;
    }

    public String getInventoryProvisioningInventoryProvisioningServiceDescription() {
        return inventoryProvisioningInventoryProvisioningServiceDescription;
    }

    public void setInventoryProvisioningInventoryProvisioningServiceInputsandOuputs(String inventoryProvisioningInventoryProvisioningServiceInputsandOuputs) {
        this.inventoryProvisioningInventoryProvisioningServiceInputsandOuputs = inventoryProvisioningInventoryProvisioningServiceInputsandOuputs;
    }

    public String getInventoryProvisioningInventoryProvisioningServiceInputsandOuputs() {
        return inventoryProvisioningInventoryProvisioningServiceInputsandOuputs;
    }

    public void setInventoryProvisioningInventoryProvisioningServiceWorkProduct(String inventoryProvisioningInventoryProvisioningServiceWorkProduct) {
        this.inventoryProvisioningInventoryProvisioningServiceWorkProduct = inventoryProvisioningInventoryProvisioningServiceWorkProduct;
    }

    public String getInventoryProvisioningInventoryProvisioningServiceWorkProduct() {
        return inventoryProvisioningInventoryProvisioningServiceWorkProduct;
    }

    public void setInventoryProvisioningInventoryProvisioningServiceName(String inventoryProvisioningInventoryProvisioningServiceName) {
        this.inventoryProvisioningInventoryProvisioningServiceName = inventoryProvisioningInventoryProvisioningServiceName;
    }

    public String getInventoryProvisioningInventoryProvisioningServiceName() {
        return inventoryProvisioningInventoryProvisioningServiceName;
    }
}