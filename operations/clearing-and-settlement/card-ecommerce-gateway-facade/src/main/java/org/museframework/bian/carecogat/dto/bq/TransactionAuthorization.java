/*The collection of operational serivces/functions offered by the operational facility

Examples: messages, capture, routines*/
package org.museframework.bian.carecogat.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

//refer to BOClass org.museframework.bian.classes.TransactionAuthorization
@MetaDto
public class TransactionAuthorization {
    /*Refers to the card transaction that is being authorized - note all fields may not be required*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object eCommerceTransactionInstanceReference;

    /*The result of the transaction authorization request*/
    @MetaField(0)
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