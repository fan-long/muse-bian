/*Party who initiates the payment order. */
package org.museframework.bian.classes;

public class OrderInitiator {
    /*Identifier of party who is the initiator of the payment. */
    private String orderInitiatorIdentifier;

    public void setOrderInitiatorIdentifier(String orderInitiatorIdentifier) {
        this.orderInitiatorIdentifier = orderInitiatorIdentifier;
    }

    public String getOrderInitiatorIdentifier() {
        return orderInitiatorIdentifier;
    }
}