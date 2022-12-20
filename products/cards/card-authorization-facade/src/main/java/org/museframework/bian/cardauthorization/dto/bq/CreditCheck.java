/*All kind of verifications 

Examples: Password verification*/
package org.museframework.bian.cardauthorization.dto.bq;

public class CreditCheck {
    /*The returned available balance is used to perform credit check - uses product instance reference to identify account*/
    private String cardAccountavailablebalancecheckresult;

    public void setCardAccountavailablebalancecheckresult(String cardAccountavailablebalancecheckresult) {
        this.cardAccountavailablebalancecheckresult = cardAccountavailablebalancecheckresult;
    }

    public String getCardAccountavailablebalancecheckresult() {
        return cardAccountavailablebalancecheckresult;
    }
}