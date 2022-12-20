/*The Card Transaction Event is one of the specific types of events that is recorded in the Card Transaction Event*/
package org.museframework.bian.crecarposkee.dto.bq;

public class CardTransactionEvent {
    /*The required status/situation before the event is captured*/
    private org.museframework.bian.classes.Condition preconditions;

    /*The timing and key actions/milestones involved in capturing the event*/
    private String schedule;

    /*The Card Transaction Event specific Business Service*/
    private org.museframework.bian.classes.BusinessService businessService;

    /*The completion status once the event has been captured*/
    private org.museframework.bian.classes.Condition postconditions;

    /*Reference to Card Transaction Event*/
    private org.museframework.bian.classes.Log creditCardPositionLogReference;

    /*Reference to Card Transaction Event*/
    private org.museframework.bian.classes.Event cardTransactionEventReference;

    /*The type of Card Transaction Event*/
    private String cardTransactionEventType;

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

    public void setCreditCardPositionLogReference(org.museframework.bian.classes.Log creditCardPositionLogReference) {
        this.creditCardPositionLogReference = creditCardPositionLogReference;
    }

    public org.museframework.bian.classes.Log getCreditCardPositionLogReference() {
        return creditCardPositionLogReference;
    }

    public void setCardTransactionEventReference(org.museframework.bian.classes.Event cardTransactionEventReference) {
        this.cardTransactionEventReference = cardTransactionEventReference;
    }

    public org.museframework.bian.classes.Event getCardTransactionEventReference() {
        return cardTransactionEventReference;
    }

    public void setCardTransactionEventType(String cardTransactionEventType) {
        this.cardTransactionEventType = cardTransactionEventType;
    }

    public String getCardTransactionEventType() {
        return cardTransactionEventType;
    }
}