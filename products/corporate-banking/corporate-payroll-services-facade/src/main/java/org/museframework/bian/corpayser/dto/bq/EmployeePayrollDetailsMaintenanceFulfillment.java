/*The configuration and execution of Employee Payroll Details Maintenance Fulfillment arrangement within the Employee Payroll Details Maintenance Fulfillment*/
package org.museframework.bian.corpayser.dto.bq;

public class EmployeePayrollDetailsMaintenanceFulfillment {
    /*The required status/situation prior to the implementation of the feature*/
    private org.museframework.bian.classes.Condition preconditions;

    /*The timing and key actions/milestones involved in completing the fulfillment feature instance*/
    private String schedule;

    /*The Employee Payroll Details Maintenance Fulfillment specific Business Service*/
    private org.museframework.bian.classes.BusinessService businessService;

    /*The completion status and any triggered/dependent actions once the feature instance has been fulfilled*/
    private org.museframework.bian.classes.Condition postconditions;

    /*Reference to Employee Payroll Details Maintenance Fulfillment*/
    private org.museframework.bian.classes.FinancialFacility employeePaymentServicesFacilityReference;

    /*Reference to Employee Payroll Details Maintenance Fulfillment*/
    private org.museframework.bian.classes.Object employeePayrollDetailsMaintenanceFulfillmentReference;

    /*The type of Employee Payroll Details Maintenance Fulfillment*/
    private String employeePayrollDetailsMaintenanceFulfillmentType;

    public void setPreconditions(org.museframework.bian.classes.Condition preconditions) {
        this.preconditions = preconditions;
    }

    public org.museframework.bian.classes.Condition getPreconditions() {
        return preconditions;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setBusinessService(org.museframework.bian.classes.BusinessService businessService) {
        this.businessService = businessService;
    }

    public org.museframework.bian.classes.BusinessService getBusinessService() {
        return businessService;
    }

    public void setPostconditions(org.museframework.bian.classes.Condition postconditions) {
        this.postconditions = postconditions;
    }

    public org.museframework.bian.classes.Condition getPostconditions() {
        return postconditions;
    }

    public void setEmployeePaymentServicesFacilityReference(org.museframework.bian.classes.FinancialFacility employeePaymentServicesFacilityReference) {
        this.employeePaymentServicesFacilityReference = employeePaymentServicesFacilityReference;
    }

    public org.museframework.bian.classes.FinancialFacility getEmployeePaymentServicesFacilityReference() {
        return employeePaymentServicesFacilityReference;
    }

    public void setEmployeePayrollDetailsMaintenanceFulfillmentReference(org.museframework.bian.classes.Object employeePayrollDetailsMaintenanceFulfillmentReference) {
        this.employeePayrollDetailsMaintenanceFulfillmentReference = employeePayrollDetailsMaintenanceFulfillmentReference;
    }

    public org.museframework.bian.classes.Object getEmployeePayrollDetailsMaintenanceFulfillmentReference() {
        return employeePayrollDetailsMaintenanceFulfillmentReference;
    }

    public void setEmployeePayrollDetailsMaintenanceFulfillmentType(String employeePayrollDetailsMaintenanceFulfillmentType) {
        this.employeePayrollDetailsMaintenanceFulfillmentType = employeePayrollDetailsMaintenanceFulfillmentType;
    }

    public String getEmployeePayrollDetailsMaintenanceFulfillmentType() {
        return employeePayrollDetailsMaintenanceFulfillmentType;
    }
}