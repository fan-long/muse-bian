/*The customer offer procedure record, combines the result of all underlying work steps*/
package org.museframework.bian.customeroffer.dto.cr;

public class CustomerOfferProcedure extends org.museframework.bian.classes.CustomerOfferProcedure {
    /*Reference to the associated customer (can currently be a person or a company)*/
    private org.museframework.bian.classes.Object customerReference;

    /*Reference to the legal entity (typically the customer)*/
    private org.museframework.bian.classes.Object partyReference;

    /*The type of product or service that is being offered*/
    private String productandServiceType;

    /*Defines scheduled update/review tasks covering all tracked properties*/
    private String customerOfferProcessingSchedule;

    /*Tasks performed to maintain/verify the life-cycle status*/
    private String customerOfferProcessingTask;

    /*The type of task performed (each BQ constitutes an optional task instance)*/
    private String customerOfferProcessingTaskType;

    /*Employees involved in completing the offer task*/
    private org.museframework.bian.classes.Object employeeBusinessUnitReference;

    /*Work documentation, forms and schedules produced and referenced during the analysis*/
    private String customerOfferProcessingTaskWorkProducts;

    /*The outcome of the task  (will be used to update the Customer Offer Procedure Instance Record)*/
    private String customerOfferProcessingTaskResult;

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

    public void setProductandServiceType(String productandServiceType) {
        this.productandServiceType = productandServiceType;
    }

    public String getProductandServiceType() {
        return productandServiceType;
    }

    public void setCustomerOfferProcessingSchedule(String customerOfferProcessingSchedule) {
        this.customerOfferProcessingSchedule = customerOfferProcessingSchedule;
    }

    public String getCustomerOfferProcessingSchedule() {
        return customerOfferProcessingSchedule;
    }

    public void setCustomerOfferProcessingTask(String customerOfferProcessingTask) {
        this.customerOfferProcessingTask = customerOfferProcessingTask;
    }

    public String getCustomerOfferProcessingTask() {
        return customerOfferProcessingTask;
    }

    public void setCustomerOfferProcessingTaskType(String customerOfferProcessingTaskType) {
        this.customerOfferProcessingTaskType = customerOfferProcessingTaskType;
    }

    public String getCustomerOfferProcessingTaskType() {
        return customerOfferProcessingTaskType;
    }

    public void setEmployeeBusinessUnitReference(org.museframework.bian.classes.Object employeeBusinessUnitReference) {
        this.employeeBusinessUnitReference = employeeBusinessUnitReference;
    }

    public org.museframework.bian.classes.Object getEmployeeBusinessUnitReference() {
        return employeeBusinessUnitReference;
    }

    public void setCustomerOfferProcessingTaskWorkProducts(String customerOfferProcessingTaskWorkProducts) {
        this.customerOfferProcessingTaskWorkProducts = customerOfferProcessingTaskWorkProducts;
    }

    public String getCustomerOfferProcessingTaskWorkProducts() {
        return customerOfferProcessingTaskWorkProducts;
    }

    public void setCustomerOfferProcessingTaskResult(String customerOfferProcessingTaskResult) {
        this.customerOfferProcessingTaskResult = customerOfferProcessingTaskResult;
    }

    public String getCustomerOfferProcessingTaskResult() {
        return customerOfferProcessingTaskResult;
    }
}