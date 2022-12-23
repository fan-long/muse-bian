/*An operational service or function supported within the Transaction Confirmation/Affirmation Function for doing Transaction Confirmation/Affirmation Function*/
package org.museframework.bian.traconmat.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class TradeConfirmationMatchingOutcome {
    /**/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Event tradeConfirmationMatchingIncident;

    /**/
    @MetaField
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