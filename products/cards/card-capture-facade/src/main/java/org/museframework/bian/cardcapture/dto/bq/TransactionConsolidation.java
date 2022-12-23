/*Execute a well-bounded financial transaction/task, typically involving largely automated/structured fulfillment processing  within Card Capture. 
Example: Execute a payment transaction.*/
package org.museframework.bian.cardcapture.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class TransactionConsolidation {
    /*The required status/situation prior to the execution of the task*/
    @MetaField
    private String transactionConsolidationPreconditions;

    /*The timing and key actions/milestones involved in completing the transaction task*/
    @MetaField
    private String transactionConsolidationTaskSchedule;

    /*The Credit/Charge Card Financial Capture Transaction specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService cardTransactionConsolidation;

    /*The completion status and any triggered/dependent actions once the task has been completed*/
    @MetaField
    private String transactionConsolidationPostconditions;

    /*Reference to the specific business service type*/
    @MetaField
    private String transactionConsolidationCardTransactionConsolidationServiceType;

    /*Description of the performed business service*/
    @MetaField
    private String transactionConsolidationCardTransactionConsolidationServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    @MetaField
    private String transactionConsolidationCardTransactionConsolidationServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    @MetaField
    private String transactionConsolidationCardTransactionConsolidationServiceWorkProduct;

    /**/
    @MetaField
    private String transactionConsolidationCardTransactionConsolidationServiceName;

    public void setTransactionConsolidationPreconditions(String transactionConsolidationPreconditions) {
        this.transactionConsolidationPreconditions = transactionConsolidationPreconditions;
    }

    public String getTransactionConsolidationPreconditions() {
        return transactionConsolidationPreconditions;
    }

    public void setTransactionConsolidationTaskSchedule(String transactionConsolidationTaskSchedule) {
        this.transactionConsolidationTaskSchedule = transactionConsolidationTaskSchedule;
    }

    public String getTransactionConsolidationTaskSchedule() {
        return transactionConsolidationTaskSchedule;
    }

    public void setCardTransactionConsolidation(org.museframework.bian.classes.BusinessService cardTransactionConsolidation) {
        this.cardTransactionConsolidation = cardTransactionConsolidation;
    }

    public org.museframework.bian.classes.BusinessService getCardTransactionConsolidation() {
        return cardTransactionConsolidation;
    }

    public void setTransactionConsolidationPostconditions(String transactionConsolidationPostconditions) {
        this.transactionConsolidationPostconditions = transactionConsolidationPostconditions;
    }

    public String getTransactionConsolidationPostconditions() {
        return transactionConsolidationPostconditions;
    }

    public void setTransactionConsolidationCardTransactionConsolidationServiceType(String transactionConsolidationCardTransactionConsolidationServiceType) {
        this.transactionConsolidationCardTransactionConsolidationServiceType = transactionConsolidationCardTransactionConsolidationServiceType;
    }

    public String getTransactionConsolidationCardTransactionConsolidationServiceType() {
        return transactionConsolidationCardTransactionConsolidationServiceType;
    }

    public void setTransactionConsolidationCardTransactionConsolidationServiceDescription(String transactionConsolidationCardTransactionConsolidationServiceDescription) {
        this.transactionConsolidationCardTransactionConsolidationServiceDescription = transactionConsolidationCardTransactionConsolidationServiceDescription;
    }

    public String getTransactionConsolidationCardTransactionConsolidationServiceDescription() {
        return transactionConsolidationCardTransactionConsolidationServiceDescription;
    }

    public void setTransactionConsolidationCardTransactionConsolidationServiceInputsandOuputs(String transactionConsolidationCardTransactionConsolidationServiceInputsandOuputs) {
        this.transactionConsolidationCardTransactionConsolidationServiceInputsandOuputs = transactionConsolidationCardTransactionConsolidationServiceInputsandOuputs;
    }

    public String getTransactionConsolidationCardTransactionConsolidationServiceInputsandOuputs() {
        return transactionConsolidationCardTransactionConsolidationServiceInputsandOuputs;
    }

    public void setTransactionConsolidationCardTransactionConsolidationServiceWorkProduct(String transactionConsolidationCardTransactionConsolidationServiceWorkProduct) {
        this.transactionConsolidationCardTransactionConsolidationServiceWorkProduct = transactionConsolidationCardTransactionConsolidationServiceWorkProduct;
    }

    public String getTransactionConsolidationCardTransactionConsolidationServiceWorkProduct() {
        return transactionConsolidationCardTransactionConsolidationServiceWorkProduct;
    }

    public void setTransactionConsolidationCardTransactionConsolidationServiceName(String transactionConsolidationCardTransactionConsolidationServiceName) {
        this.transactionConsolidationCardTransactionConsolidationServiceName = transactionConsolidationCardTransactionConsolidationServiceName;
    }

    public String getTransactionConsolidationCardTransactionConsolidationServiceName() {
        return transactionConsolidationCardTransactionConsolidationServiceName;
    }
}