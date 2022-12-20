/*A person to whom a payment card is issued and who is authorised to use that card. (a proposed definition for BIAN BOM adapted from ECB)*/
package org.museframework.bian.classes;

public class CardHolder {
    /*Identifier of the card holder. */
    private String cardHolderIdentifier;

    public void setCardHolderIdentifier(String cardHolderIdentifier) {
        this.cardHolderIdentifier = cardHolderIdentifier;
    }

    public String getCardHolderIdentifier() {
        return cardHolderIdentifier;
    }
}