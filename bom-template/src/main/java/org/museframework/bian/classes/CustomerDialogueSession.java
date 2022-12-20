/*A session for managing dialogues with a customer in an active contact. */
package org.museframework.bian.classes;

public class CustomerDialogueSession {
    /*Reference to the customer Contact the ContactDialogueSession is part of*/
    private String customerContactReference;

    /*Payload of the exchange.*/
    private String sessionDialogueContent;

    public void setCustomerContactReference(String customerContactReference) {
        this.customerContactReference = customerContactReference;
    }

    public String getCustomerContactReference() {
        return customerContactReference;
    }

    public void setSessionDialogueContent(String sessionDialogueContent) {
        this.sessionDialogueContent = sessionDialogueContent;
    }

    public String getSessionDialogueContent() {
        return sessionDialogueContent;
    }
}