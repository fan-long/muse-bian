/*An operational service or function supported within the Transaction Confirmation/Affirmation Function for doing Transaction Confirmation/Affirmation Function*/
package org.museframework.bian.traconmat.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class TransactionConfirmationAffirmationFunction {
    /*The required status/situation and or tasks that need to be completed prior to the invocation of the feature*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition preconditions;

    /*The schedule and timing of the function*/
    @MetaField(0)
    private String schedule;

    /*The Transaction Confirmation/Affirmation Function specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService businessService;

    /*Reference to Transaction Confirmation/Affirmation Function*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Session tradeMatchingOperatingSessionReference;

    /*Reference to Transaction Confirmation/Affirmation Function*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Function transactionConfirmationorAffirmationFunctionReference;

    /*The type of Transaction Confirmation/Affirmation Function*/
    @MetaField(0)
    private String transactionConfirmationorAffirmationFunctionType;

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

    public void setTradeMatchingOperatingSessionReference(org.museframework.bian.classes.Session tradeMatchingOperatingSessionReference) {
        this.tradeMatchingOperatingSessionReference = tradeMatchingOperatingSessionReference;
    }

    public org.museframework.bian.classes.Session getTradeMatchingOperatingSessionReference() {
        return tradeMatchingOperatingSessionReference;
    }

    public void setTransactionConfirmationorAffirmationFunctionReference(org.museframework.bian.classes.Function transactionConfirmationorAffirmationFunctionReference) {
        this.transactionConfirmationorAffirmationFunctionReference = transactionConfirmationorAffirmationFunctionReference;
    }

    public org.museframework.bian.classes.Function getTransactionConfirmationorAffirmationFunctionReference() {
        return transactionConfirmationorAffirmationFunctionReference;
    }

    public void setTransactionConfirmationorAffirmationFunctionType(String transactionConfirmationorAffirmationFunctionType) {
        this.transactionConfirmationorAffirmationFunctionType = transactionConfirmationorAffirmationFunctionType;
    }

    public String getTransactionConfirmationorAffirmationFunctionType() {
        return transactionConfirmationorAffirmationFunctionType;
    }
}