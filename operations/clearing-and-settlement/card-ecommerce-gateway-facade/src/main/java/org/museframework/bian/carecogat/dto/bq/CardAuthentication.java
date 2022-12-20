/*The collection of operational serivces/functions offered by the operational facility

Examples: messages, capture, routines*/
package org.museframework.bian.carecogat.dto.bq;

public class CardAuthentication {
    /*Refers to the card transaction that is being authenticated - note all fields may not be required*/
    private org.museframework.bian.classes.Object eCommerceTransactionInstanceReference;

    /*The result of the card authentication request*/
    private String eCommerceTransactionAuthenticationResponse;

    public void seteCommerceTransactionInstanceReference(org.museframework.bian.classes.Object eCommerceTransactionInstanceReference) {
        this.eCommerceTransactionInstanceReference = eCommerceTransactionInstanceReference;
    }

    public org.museframework.bian.classes.Object geteCommerceTransactionInstanceReference() {
        return eCommerceTransactionInstanceReference;
    }

    public void seteCommerceTransactionAuthenticationResponse(String eCommerceTransactionAuthenticationResponse) {
        this.eCommerceTransactionAuthenticationResponse = eCommerceTransactionAuthenticationResponse;
    }

    public String geteCommerceTransactionAuthenticationResponse() {
        return eCommerceTransactionAuthenticationResponse;
    }
}