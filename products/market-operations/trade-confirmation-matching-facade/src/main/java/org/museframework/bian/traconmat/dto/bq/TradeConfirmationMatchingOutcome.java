/*An operational service or function supported within the Transaction Confirmation/Affirmation Function for doing Transaction Confirmation/Affirmation Function*/
package org.museframework.bian.traconmat.dto.bq;

public class TradeConfirmationMatchingOutcome {
    /**/
    private org.museframework.bian.classes.Event tradeConfirmationMatchingIncident;

    /**/
    private String tradeConfirmationMatchingProvision;

    public void setTradeConfirmationMatchingIncident(org.museframework.bian.classes.Event tradeConfirmationMatchingIncident) {
        this.tradeConfirmationMatchingIncident = tradeConfirmationMatchingIncident;
    }

    public org.museframework.bian.classes.Event getTradeConfirmationMatchingIncident() {
        return tradeConfirmationMatchingIncident;
    }

    public void setTradeConfirmationMatchingProvision(String tradeConfirmationMatchingProvision) {
        this.tradeConfirmationMatchingProvision = tradeConfirmationMatchingProvision;
    }

    public String getTradeConfirmationMatchingProvision() {
        return tradeConfirmationMatchingProvision;
    }
}