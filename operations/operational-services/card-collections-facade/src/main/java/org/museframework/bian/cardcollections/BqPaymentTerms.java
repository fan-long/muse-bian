package org.museframework.bian.cardcollections;

import org.museframework.bian.cardcollections.dto.RetrievePaymentTermsRequest;
import org.museframework.bian.cardcollections.dto.RetrievePaymentTermsResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The main worsteps to be followed in th eexecution of the procedure  Examples: Invoice generation")
@GenericDomain(name="CardCollections", group="PaymentTerms")
public interface BqPaymentTerms {
    @Description("ReBQ Retrieve details about the payment terms for a card collections procedure")
    RetrievePaymentTermsResponse retrievePaymentTerms(RetrievePaymentTermsRequest req);
}