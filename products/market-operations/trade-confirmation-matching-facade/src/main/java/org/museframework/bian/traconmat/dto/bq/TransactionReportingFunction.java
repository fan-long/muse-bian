/*An operational service or function supported within the Transaction Confirmation/Affirmation Function for doing Transaction Confirmation/Affirmation Function*/
package org.museframework.bian.traconmat.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class TransactionReportingFunction {
    /*The required status/situation and or tasks that need to be completed prior to the invocation of the feature*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition preconditions;

    /*The schedule and timing of the function*/
    @MetaField(0)
    private String schedule;

    /*The Transaction Reporting Function specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService businessService;

    /*Reference to Transaction Reporting Function*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Session tradeMatchingOperatingSessionReference;

    /*Reference to Transaction Reporting Function*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Function transactionReportingFunctionReference;

    /*The type of Transaction Reporting Function*/
    @MetaField(0)
    private String transactionReportingFunctionType;

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

    public void setTransactionReportingFunctionReference(org.museframework.bian.classes.Function transactionReportingFunctionReference) {
        this.transactionReportingFunctionReference = transactionReportingFunctionReference;
    }

    public org.museframework.bian.classes.Function getTransactionReportingFunctionReference() {
        return transactionReportingFunctionReference;
    }

    public void setTransactionReportingFunctionType(String transactionReportingFunctionType) {
        this.transactionReportingFunctionType = transactionReportingFunctionType;
    }

    public String getTransactionReportingFunctionType() {
        return transactionReportingFunctionType;
    }
}