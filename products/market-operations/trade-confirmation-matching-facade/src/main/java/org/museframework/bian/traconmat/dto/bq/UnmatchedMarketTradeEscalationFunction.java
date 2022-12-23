/*An operational service or function supported within the Transaction Confirmation/Affirmation Function for doing Transaction Confirmation/Affirmation Function*/
package org.museframework.bian.traconmat.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class UnmatchedMarketTradeEscalationFunction {
    /*The required status/situation and or tasks that need to be completed prior to the invocation of the feature*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition preconditions;

    /*The schedule and timing of the function*/
    @MetaField
    private String schedule;

    /*The Unmatched Market Trade Escalation Function specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService businessService;

    /*Reference to Unmatched Market Trade Escalation Function*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Session tradeMatchingOperatingSessionReference;

    /*Reference to Unmatched Market Trade Escalation Function*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Function unmatchedMarketTradeEscalationFunctionReference;

    /*The type of Unmatched Market Trade Escalation Function*/
    @MetaField
    private String unmatchedMarketTradeEscalationFunctionType;

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

    public void setUnmatchedMarketTradeEscalationFunctionReference(org.museframework.bian.classes.Function unmatchedMarketTradeEscalationFunctionReference) {
        this.unmatchedMarketTradeEscalationFunctionReference = unmatchedMarketTradeEscalationFunctionReference;
    }

    public org.museframework.bian.classes.Function getUnmatchedMarketTradeEscalationFunctionReference() {
        return unmatchedMarketTradeEscalationFunctionReference;
    }

    public void setUnmatchedMarketTradeEscalationFunctionType(String unmatchedMarketTradeEscalationFunctionType) {
        this.unmatchedMarketTradeEscalationFunctionType = unmatchedMarketTradeEscalationFunctionType;
    }

    public String getUnmatchedMarketTradeEscalationFunctionType() {
        return unmatchedMarketTradeEscalationFunctionType;
    }
}