/*Execute a well-bounded financial transaction/task, typically involving largely automated/structured fulfillment processing  within Card Capture. 
Example: Execute a payment transaction.*/
package org.museframework.bian.cardcapture.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class TransactionAuthorization extends org.museframework.bian.classes.TransactionAuthorization {
    /*The required status/situation prior to the execution of the task*/
    @MetaField
    private String transactionAuthorizationPreconditions;

    /*The timing and key actions/milestones involved in completing the transaction task*/
    @MetaField
    private String transactionAuthorizationTaskSchedule;

    /*The Credit/Charge Card Financial Capture Transaction specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService businessService;

    /*The completion status and any triggered/dependent actions once the task has been completed*/
    @MetaField
    private String transactionAuthorizationPostconditions;

    /*Reference to the specific business service type*/
    @MetaField
    private String transactionAuthorizationServiceType;

    /*Description of the performed business service*/
    @MetaField
    private String transactionAuthorizationServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    @MetaField
    private String transactionAuthorizationServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    @MetaField
    private String transactionAuthorizationServiceWorkProduct;

    /**/
    @MetaField
    private String transactionAuthorizationServiceName;

    public void setTransactionAuthorizationPreconditions(String transactionAuthorizationPreconditions) {
        this.transactionAuthorizationPreconditions = transactionAuthorizationPreconditions;
    }

    public String getTransactionAuthorizationPreconditions() {
        return transactionAuthorizationPreconditions;
    }

    public void setTransactionAuthorizationTaskSchedule(String transactionAuthorizationTaskSchedule) {
        this.transactionAuthorizationTaskSchedule = transactionAuthorizationTaskSchedule;
    }

    public String getTransactionAuthorizationTaskSchedule() {
        return transactionAuthorizationTaskSchedule;
    }

    public void setBusinessService(org.museframework.bian.classes.BusinessService businessService) {
        this.businessService = businessService;
    }

    public org.museframework.bian.classes.BusinessService getBusinessService() {
        return businessService;
    }

    public void setTransactionAuthorizationPostconditions(String transactionAuthorizationPostconditions) {
        this.transactionAuthorizationPostconditions = transactionAuthorizationPostconditions;
    }

    public String getTransactionAuthorizationPostconditions() {
        return transactionAuthorizationPostconditions;
    }

    public void setTransactionAuthorizationServiceType(String transactionAuthorizationServiceType) {
        this.transactionAuthorizationServiceType = transactionAuthorizationServiceType;
    }

    public String getTransactionAuthorizationServiceType() {
        return transactionAuthorizationServiceType;
    }

    public void setTransactionAuthorizationServiceDescription(String transactionAuthorizationServiceDescription) {
        this.transactionAuthorizationServiceDescription = transactionAuthorizationServiceDescription;
    }

    public String getTransactionAuthorizationServiceDescription() {
        return transactionAuthorizationServiceDescription;
    }

    public void setTransactionAuthorizationServiceInputsandOuputs(String transactionAuthorizationServiceInputsandOuputs) {
        this.transactionAuthorizationServiceInputsandOuputs = transactionAuthorizationServiceInputsandOuputs;
    }

    public String getTransactionAuthorizationServiceInputsandOuputs() {
        return transactionAuthorizationServiceInputsandOuputs;
    }

    public void setTransactionAuthorizationServiceWorkProduct(String transactionAuthorizationServiceWorkProduct) {
        this.transactionAuthorizationServiceWorkProduct = transactionAuthorizationServiceWorkProduct;
    }

    public String getTransactionAuthorizationServiceWorkProduct() {
        return transactionAuthorizationServiceWorkProduct;
    }

    public void setTransactionAuthorizationServiceName(String transactionAuthorizationServiceName) {
        this.transactionAuthorizationServiceName = transactionAuthorizationServiceName;
    }

    public String getTransactionAuthorizationServiceName() {
        return transactionAuthorizationServiceName;
    }
}