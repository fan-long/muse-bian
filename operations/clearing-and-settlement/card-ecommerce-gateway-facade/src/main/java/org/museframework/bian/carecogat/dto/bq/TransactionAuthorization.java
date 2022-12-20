/*The collection of operational serivces/functions offered by the operational facility

Examples: messages, capture, routines*/
package org.museframework.bian.carecogat.dto.bq;

public class TransactionAuthorization extends org.museframework.bian.classes.TransactionAuthorization {
    /*Refers to the card transaction that is being authorized - note all fields may not be required*/
    private org.museframework.bian.classes.Object eCommerceTransactionInstanceReference;

    /*The result of the transaction authorization request*/
    private String eCommerceTransactionAuthorizationResponse;

    public void seteCommerceTransactionInstanceReference(org.museframework.bian.classes.Object eCommerceTransactionInstanceReference) {
        this.eCommerceTransactionInstanceReference = eCommerceTransactionInstanceReference;
    }

    public org.museframework.bian.classes.Object geteCommerceTransactionInstanceReference() {
        return eCommerceTransactionInstanceReference;
    }

    public void seteCommerceTransactionAuthorizationResponse(String eCommerceTransactionAuthorizationResponse) {
        this.eCommerceTransactionAuthorizationResponse = eCommerceTransactionAuthorizationResponse;
    }

    public String geteCommerceTransactionAuthorizationResponse() {
        return eCommerceTransactionAuthorizationResponse;
    }
}