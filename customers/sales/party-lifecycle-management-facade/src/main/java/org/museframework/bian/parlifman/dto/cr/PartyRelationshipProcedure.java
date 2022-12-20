/**/
package org.museframework.bian.parlifman.dto.cr;

public class PartyRelationshipProcedure {
    /*Reference to the associated customer (can currently be a person or a company)*/
    private org.museframework.bian.classes.Object customerReference;

    /*Reference to the legal entity (typically the customer)*/
    private org.museframework.bian.classes.Object partyReference;

    /*Defines the nature of the bank association with the party (e.g. customer, supplier)*/
    private String partyRelationshipType;

    /*Defines scheduled update/review tasks covering all tracked properties*/
    private String partyLife_cycleMaintenanceSchedule;

    /*Tasks performed to maintain/verify the life-cycle status*/
    private String partyLife_cycleMaintenanceTask;

    /*The type of task performed (e.g. on-boarding check, periodic refresh)*/
    private String partyLife_cycleMaintenanceTaskType;

    /*Work documentation, forms and schedules produced and referenced during the analysis*/
    private String partyLife_cycleMaintenanceWorkProducts;

    /*The outcome of the task  (will be used to update the Status and Status Record)*/
    private String partyLife_cycleMaintenanceTaskResult;

    /**/
    private String customerPrecedentProfileUpdateLog;

    public void setCustomerReference(org.museframework.bian.classes.Object customerReference) {
        this.customerReference = customerReference;
    }

    public org.museframework.bian.classes.Object getCustomerReference() {
        return customerReference;
    }

    public void setPartyReference(org.museframework.bian.classes.Object partyReference) {
        this.partyReference = partyReference;
    }

    public org.museframework.bian.classes.Object getPartyReference() {
        return partyReference;
    }

    public void setPartyRelationshipType(String partyRelationshipType) {
        this.partyRelationshipType = partyRelationshipType;
    }

    public String getPartyRelationshipType() {
        return partyRelationshipType;
    }

    public void setPartyLife_cycleMaintenanceSchedule(String partyLife_cycleMaintenanceSchedule) {
        this.partyLife_cycleMaintenanceSchedule = partyLife_cycleMaintenanceSchedule;
    }

    public String getPartyLife_cycleMaintenanceSchedule() {
        return partyLife_cycleMaintenanceSchedule;
    }

    public void setPartyLife_cycleMaintenanceTask(String partyLife_cycleMaintenanceTask) {
        this.partyLife_cycleMaintenanceTask = partyLife_cycleMaintenanceTask;
    }

    public String getPartyLife_cycleMaintenanceTask() {
        return partyLife_cycleMaintenanceTask;
    }

    public void setPartyLife_cycleMaintenanceTaskType(String partyLife_cycleMaintenanceTaskType) {
        this.partyLife_cycleMaintenanceTaskType = partyLife_cycleMaintenanceTaskType;
    }

    public String getPartyLife_cycleMaintenanceTaskType() {
        return partyLife_cycleMaintenanceTaskType;
    }

    public void setPartyLife_cycleMaintenanceWorkProducts(String partyLife_cycleMaintenanceWorkProducts) {
        this.partyLife_cycleMaintenanceWorkProducts = partyLife_cycleMaintenanceWorkProducts;
    }

    public String getPartyLife_cycleMaintenanceWorkProducts() {
        return partyLife_cycleMaintenanceWorkProducts;
    }

    public void setPartyLife_cycleMaintenanceTaskResult(String partyLife_cycleMaintenanceTaskResult) {
        this.partyLife_cycleMaintenanceTaskResult = partyLife_cycleMaintenanceTaskResult;
    }

    public String getPartyLife_cycleMaintenanceTaskResult() {
        return partyLife_cycleMaintenanceTaskResult;
    }

    public void setCustomerPrecedentProfileUpdateLog(String customerPrecedentProfileUpdateLog) {
        this.customerPrecedentProfileUpdateLog = customerPrecedentProfileUpdateLog;
    }

    public String getCustomerPrecedentProfileUpdateLog() {
        return customerPrecedentProfileUpdateLog;
    }
}