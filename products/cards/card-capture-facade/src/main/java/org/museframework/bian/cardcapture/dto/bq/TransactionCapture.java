/*Execute a well-bounded financial transaction/task, typically involving largely automated/structured fulfillment processing  within Card Capture. 
Example: Execute a payment transaction.*/
package org.museframework.bian.cardcapture.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class TransactionCapture {
    /*The required status/situation prior to the execution of the task*/
    @MetaField
    private String transactionCapturePreconditions;

    /*The timing and key actions/milestones involved in completing the transaction task*/
    @MetaField
    private String transactionCaptureTaskSchedule;

    /*The Credit/Charge Card Financial Capture Transaction specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService businessService;

    /*The completion status and any triggered/dependent actions once the task has been completed*/
    @MetaField
    private String transactionCapturePostconditions;

    /*Reference to the specific business service type*/
    @MetaField
    private String transactionCaptureServiceType;

    /*Description of the performed business service*/
    @MetaField
    private String transactionCaptureServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    @MetaField
    private String transactionCaptureServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    @MetaField
    private String transactionCaptureServiceWorkProduct;

    /**/
    @MetaField
    private String transactionCaptureServiceName;

    public void setTransactionCapturePreconditions(String transactionCapturePreconditions) {
        this.transactionCapturePreconditions = transactionCapturePreconditions;
    }

    public String getTransactionCapturePreconditions() {
        return transactionCapturePreconditions;
    }

    public void setTransactionCaptureTaskSchedule(String transactionCaptureTaskSchedule) {
        this.transactionCaptureTaskSchedule = transactionCaptureTaskSchedule;
    }

    public String getTransactionCaptureTaskSchedule() {
        return transactionCaptureTaskSchedule;
    }

    public void setBusinessService(org.museframework.bian.classes.BusinessService businessService) {
        this.businessService = businessService;
    }

    public org.museframework.bian.classes.BusinessService getBusinessService() {
        return businessService;
    }

    public void setTransactionCapturePostconditions(String transactionCapturePostconditions) {
        this.transactionCapturePostconditions = transactionCapturePostconditions;
    }

    public String getTransactionCapturePostconditions() {
        return transactionCapturePostconditions;
    }

    public void setTransactionCaptureServiceType(String transactionCaptureServiceType) {
        this.transactionCaptureServiceType = transactionCaptureServiceType;
    }

    public String getTransactionCaptureServiceType() {
        return transactionCaptureServiceType;
    }

    public void setTransactionCaptureServiceDescription(String transactionCaptureServiceDescription) {
        this.transactionCaptureServiceDescription = transactionCaptureServiceDescription;
    }

    public String getTransactionCaptureServiceDescription() {
        return transactionCaptureServiceDescription;
    }

    public void setTransactionCaptureServiceInputsandOuputs(String transactionCaptureServiceInputsandOuputs) {
        this.transactionCaptureServiceInputsandOuputs = transactionCaptureServiceInputsandOuputs;
    }

    public String getTransactionCaptureServiceInputsandOuputs() {
        return transactionCaptureServiceInputsandOuputs;
    }

    public void setTransactionCaptureServiceWorkProduct(String transactionCaptureServiceWorkProduct) {
        this.transactionCaptureServiceWorkProduct = transactionCaptureServiceWorkProduct;
    }

    public String getTransactionCaptureServiceWorkProduct() {
        return transactionCaptureServiceWorkProduct;
    }

    public void setTransactionCaptureServiceName(String transactionCaptureServiceName) {
        this.transactionCaptureServiceName = transactionCaptureServiceName;
    }

    public String getTransactionCaptureServiceName() {
        return transactionCaptureServiceName;
    }
}