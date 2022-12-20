/*Party who is the intended recipient of funds which have been the subject of a payment transaction. (adapted from PSD)*/
package org.museframework.bian.classes;

public class Payee {
    /*Identifier of the payee.*/
    private String payeeIdentifier;

    public void setPayeeIdentifier(String payeeIdentifier) {
        this.payeeIdentifier = payeeIdentifier;
    }

    public String getPayeeIdentifier() {
        return payeeIdentifier;
    }
}