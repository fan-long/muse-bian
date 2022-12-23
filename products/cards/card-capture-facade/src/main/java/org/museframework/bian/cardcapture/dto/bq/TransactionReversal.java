/*Execute a well-bounded financial transaction/task, typically involving largely automated/structured fulfillment processing  within Card Capture. 
Example: Execute a payment transaction.*/
package org.museframework.bian.cardcapture.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class TransactionReversal {
    /*The required status/situation prior to the execution of the task*/
    @MetaField
    private String transactionReversalPreconditions;

    /*The timing and key actions/milestones involved in completing the transaction task*/
    @MetaField
    private String transactionReversalTaskSchedule;

    /*The Credit/Charge Card Financial Capture Transaction specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService cardTransactionReversal;

    /*The completion status and any triggered/dependent actions once the task has been completed*/
    @MetaField
    private String transactionReversalPostconditions;

    /*Reference to the specific business service type*/
    @MetaField
    private String transactionReversalCardTransactionReversalServiceType;

    /*Description of the performed business service*/
    @MetaField
    private String transactionReversalCardTransactionReversalServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    @MetaField
    private String transactionReversalCardTransactionReversalServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    @MetaField
    private String transactionReversalCardTransactionReversalServiceWorkProduct;

    /**/
    @MetaField
    private String transactionReversalCardTransactionReversalServiceName;

    public void setTransactionReversalPreconditions(String transactionReversalPreconditions) {
        this.transactionReversalPreconditions = transactionReversalPreconditions;
    }

    public String getTransactionReversalPreconditions() {
        return transactionReversalPreconditions;
    }

    public void setTransactionReversalTaskSchedule(String transactionReversalTaskSchedule) {
        this.transactionReversalTaskSchedule = transactionReversalTaskSchedule;
    }

    public String getTransactionReversalTaskSchedule() {
        return transactionReversalTaskSchedule;
    }

    public void setCardTransactionReversal(org.museframework.bian.classes.BusinessService cardTransactionReversal) {
        this.cardTransactionReversal = cardTransactionReversal;
    }

    public org.museframework.bian.classes.BusinessService getCardTransactionReversal() {
        return cardTransactionReversal;
    }

    public void setTransactionReversalPostconditions(String transactionReversalPostconditions) {
        this.transactionReversalPostconditions = transactionReversalPostconditions;
    }

    public String getTransactionReversalPostconditions() {
        return transactionReversalPostconditions;
    }

    public void setTransactionReversalCardTransactionReversalServiceType(String transactionReversalCardTransactionReversalServiceType) {
        this.transactionReversalCardTransactionReversalServiceType = transactionReversalCardTransactionReversalServiceType;
    }

    public String getTransactionReversalCardTransactionReversalServiceType() {
        return transactionReversalCardTransactionReversalServiceType;
    }

    public void setTransactionReversalCardTransactionReversalServiceDescription(String transactionReversalCardTransactionReversalServiceDescription) {
        this.transactionReversalCardTransactionReversalServiceDescription = transactionReversalCardTransactionReversalServiceDescription;
    }

    public String getTransactionReversalCardTransactionReversalServiceDescription() {
        return transactionReversalCardTransactionReversalServiceDescription;
    }

    public void setTransactionReversalCardTransactionReversalServiceInputsandOuputs(String transactionReversalCardTransactionReversalServiceInputsandOuputs) {
        this.transactionReversalCardTransactionReversalServiceInputsandOuputs = transactionReversalCardTransactionReversalServiceInputsandOuputs;
    }

    public String getTransactionReversalCardTransactionReversalServiceInputsandOuputs() {
        return transactionReversalCardTransactionReversalServiceInputsandOuputs;
    }

    public void setTransactionReversalCardTransactionReversalServiceWorkProduct(String transactionReversalCardTransactionReversalServiceWorkProduct) {
        this.transactionReversalCardTransactionReversalServiceWorkProduct = transactionReversalCardTransactionReversalServiceWorkProduct;
    }

    public String getTransactionReversalCardTransactionReversalServiceWorkProduct() {
        return transactionReversalCardTransactionReversalServiceWorkProduct;
    }

    public void setTransactionReversalCardTransactionReversalServiceName(String transactionReversalCardTransactionReversalServiceName) {
        this.transactionReversalCardTransactionReversalServiceName = transactionReversalCardTransactionReversalServiceName;
    }

    public String getTransactionReversalCardTransactionReversalServiceName() {
        return transactionReversalCardTransactionReversalServiceName;
    }
}