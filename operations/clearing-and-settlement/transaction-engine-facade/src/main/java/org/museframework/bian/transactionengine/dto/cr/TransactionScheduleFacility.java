/*Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility within Transaction Engine. */
package org.museframework.bian.transactionengine.dto.cr;

public class TransactionScheduleFacility {
    /*Reference to the product instance for which the transaction processing is being handled*/
    private org.museframework.bian.classes.Object productInstanceReference;

    /*The type or category of product or service that is being supported (e.g. mortgage, term loan)*/
    private String productandServiceType;

    /*The processing schedule, covering reporting and financial transactions that are to be executed*/
    private String transactionScheduleFulfillmentSchedule;

    /*A record of an instance of the work tasks that can be performed by the service on behalf of the fulfillment product instance*/
    private String transactionScheduleWorkTaskRecord;

    /*The type of work task (e.g. generate report/notification)*/
    private String transactionScheduleWorkTaskType;

    /*Description of the task performed*/
    private String transactionScheduleWorkTaskDescription;

    /*File of consolidated notes, forms and documents for the work task*/
    private String transactionScheduleWorkTaskWorkProducts;

    /*Reference to associated documents*/
    private org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference;

    /*Details of the outcome or result of the work task*/
    private String transactionScheduleWorkTaskResult;

    /*A record of an applied fee if applicable (this is charged to the parent product instance)*/
    private String transactionScheduleTaskFeeTransaction;

    /*General description of the fee*/
    private String transactionScheduleWorkTaskFeeTransactionDescription;

    /*The fee type applied*/
    private String transactionScheduleWorkTaskFeeTransactionType;

    /*The derived fee amount to be charged*/
    private String transactionScheduleWorkTaskFeeTransactionCharge;

    /*Details of the financial transactions that are executed on behalf of the fulfillment product instance*/
    private String transactionScheduleFinancialTransaction;

    /*Identifies the payment source of the transaction - usually a reference to the parent product instance*/
    private org.museframework.bian.classes.Object transactionScheduleFinancialTransactionProductInstanceReference;

    /*The sub-type of financial transaction*/
    private String transactionScheduleFinancialTransactionType;

    /*Any necessary details describing the purpose or reference properties of the transaction*/
    private String transactionScheduleFinancialTransactionDescription;

    /*The volume or value of the transaction*/
    private String transactionScheduleFinancialTransactionAmount;

    /*Reference to the correspondence generated for the transaction (e.g. confirmation note)*/
    private org.museframework.bian.classes.Object correspondenceInstanceReference;

    /*Key dates and times associated with the transaction schedule financial transaction (e.g. initiation date, confirmation date)*/
    private String dateType;

    /*Value of the date type*/
    private String date;

    public void setProductInstanceReference(org.museframework.bian.classes.Object productInstanceReference) {
        this.productInstanceReference = productInstanceReference;
    }

    public org.museframework.bian.classes.Object getProductInstanceReference() {
        return productInstanceReference;
    }

    public void setProductandServiceType(String productandServiceType) {
        this.productandServiceType = productandServiceType;
    }

    public String getProductandServiceType() {
        return productandServiceType;
    }

    public void setTransactionScheduleFulfillmentSchedule(String transactionScheduleFulfillmentSchedule) {
        this.transactionScheduleFulfillmentSchedule = transactionScheduleFulfillmentSchedule;
    }

    public String getTransactionScheduleFulfillmentSchedule() {
        return transactionScheduleFulfillmentSchedule;
    }

    public void setTransactionScheduleWorkTaskRecord(String transactionScheduleWorkTaskRecord) {
        this.transactionScheduleWorkTaskRecord = transactionScheduleWorkTaskRecord;
    }

    public String getTransactionScheduleWorkTaskRecord() {
        return transactionScheduleWorkTaskRecord;
    }

    public void setTransactionScheduleWorkTaskType(String transactionScheduleWorkTaskType) {
        this.transactionScheduleWorkTaskType = transactionScheduleWorkTaskType;
    }

    public String getTransactionScheduleWorkTaskType() {
        return transactionScheduleWorkTaskType;
    }

    public void setTransactionScheduleWorkTaskDescription(String transactionScheduleWorkTaskDescription) {
        this.transactionScheduleWorkTaskDescription = transactionScheduleWorkTaskDescription;
    }

    public String getTransactionScheduleWorkTaskDescription() {
        return transactionScheduleWorkTaskDescription;
    }

    public void setTransactionScheduleWorkTaskWorkProducts(String transactionScheduleWorkTaskWorkProducts) {
        this.transactionScheduleWorkTaskWorkProducts = transactionScheduleWorkTaskWorkProducts;
    }

    public String getTransactionScheduleWorkTaskWorkProducts() {
        return transactionScheduleWorkTaskWorkProducts;
    }

    public void setDocumentDirectoryEntryInstanceReference(org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference) {
        this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
    }

    public org.museframework.bian.classes.Object getDocumentDirectoryEntryInstanceReference() {
        return documentDirectoryEntryInstanceReference;
    }

    public void setTransactionScheduleWorkTaskResult(String transactionScheduleWorkTaskResult) {
        this.transactionScheduleWorkTaskResult = transactionScheduleWorkTaskResult;
    }

    public String getTransactionScheduleWorkTaskResult() {
        return transactionScheduleWorkTaskResult;
    }

    public void setTransactionScheduleTaskFeeTransaction(String transactionScheduleTaskFeeTransaction) {
        this.transactionScheduleTaskFeeTransaction = transactionScheduleTaskFeeTransaction;
    }

    public String getTransactionScheduleTaskFeeTransaction() {
        return transactionScheduleTaskFeeTransaction;
    }

    public void setTransactionScheduleWorkTaskFeeTransactionDescription(String transactionScheduleWorkTaskFeeTransactionDescription) {
        this.transactionScheduleWorkTaskFeeTransactionDescription = transactionScheduleWorkTaskFeeTransactionDescription;
    }

    public String getTransactionScheduleWorkTaskFeeTransactionDescription() {
        return transactionScheduleWorkTaskFeeTransactionDescription;
    }

    public void setTransactionScheduleWorkTaskFeeTransactionType(String transactionScheduleWorkTaskFeeTransactionType) {
        this.transactionScheduleWorkTaskFeeTransactionType = transactionScheduleWorkTaskFeeTransactionType;
    }

    public String getTransactionScheduleWorkTaskFeeTransactionType() {
        return transactionScheduleWorkTaskFeeTransactionType;
    }

    public void setTransactionScheduleWorkTaskFeeTransactionCharge(String transactionScheduleWorkTaskFeeTransactionCharge) {
        this.transactionScheduleWorkTaskFeeTransactionCharge = transactionScheduleWorkTaskFeeTransactionCharge;
    }

    public String getTransactionScheduleWorkTaskFeeTransactionCharge() {
        return transactionScheduleWorkTaskFeeTransactionCharge;
    }

    public void setTransactionScheduleFinancialTransaction(String transactionScheduleFinancialTransaction) {
        this.transactionScheduleFinancialTransaction = transactionScheduleFinancialTransaction;
    }

    public String getTransactionScheduleFinancialTransaction() {
        return transactionScheduleFinancialTransaction;
    }

    public void setTransactionScheduleFinancialTransactionProductInstanceReference(org.museframework.bian.classes.Object transactionScheduleFinancialTransactionProductInstanceReference) {
        this.transactionScheduleFinancialTransactionProductInstanceReference = transactionScheduleFinancialTransactionProductInstanceReference;
    }

    public org.museframework.bian.classes.Object getTransactionScheduleFinancialTransactionProductInstanceReference() {
        return transactionScheduleFinancialTransactionProductInstanceReference;
    }

    public void setTransactionScheduleFinancialTransactionType(String transactionScheduleFinancialTransactionType) {
        this.transactionScheduleFinancialTransactionType = transactionScheduleFinancialTransactionType;
    }

    public String getTransactionScheduleFinancialTransactionType() {
        return transactionScheduleFinancialTransactionType;
    }

    public void setTransactionScheduleFinancialTransactionDescription(String transactionScheduleFinancialTransactionDescription) {
        this.transactionScheduleFinancialTransactionDescription = transactionScheduleFinancialTransactionDescription;
    }

    public String getTransactionScheduleFinancialTransactionDescription() {
        return transactionScheduleFinancialTransactionDescription;
    }

    public void setTransactionScheduleFinancialTransactionAmount(String transactionScheduleFinancialTransactionAmount) {
        this.transactionScheduleFinancialTransactionAmount = transactionScheduleFinancialTransactionAmount;
    }

    public String getTransactionScheduleFinancialTransactionAmount() {
        return transactionScheduleFinancialTransactionAmount;
    }

    public void setCorrespondenceInstanceReference(org.museframework.bian.classes.Object correspondenceInstanceReference) {
        this.correspondenceInstanceReference = correspondenceInstanceReference;
    }

    public org.museframework.bian.classes.Object getCorrespondenceInstanceReference() {
        return correspondenceInstanceReference;
    }

    public void setDateType(String dateType) {
        this.dateType = dateType;
    }

    public String getDateType() {
        return dateType;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }
}