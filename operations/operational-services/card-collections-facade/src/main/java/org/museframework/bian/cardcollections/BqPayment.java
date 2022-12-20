package org.museframework.bian.cardcollections;

import org.museframework.bian.cardcollections.dto.InitiatePaymentRequest;
import org.museframework.bian.cardcollections.dto.InitiatePaymentResponse;
import org.museframework.bian.cardcollections.dto.RetrievePaymentRequest;
import org.museframework.bian.cardcollections.dto.RetrievePaymentResponse;
import org.museframework.bian.cardcollections.dto.UpdatePaymentRequest;
import org.museframework.bian.cardcollections.dto.UpdatePaymentResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The main worsteps to be followed in th eexecution of the procedure  Examples: Invoice generation")
@GenericDomain(name="CardCollections", group="Payment")
public interface BqPayment {
    @GenericDtxEndpoint
    @Description("InBQ Initiate payment processing against the card collections account")
    InitiatePaymentResponse initiatePayment(InitiatePaymentRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update a payment transaction")
    UpdatePaymentResponse updatePayment(UpdatePaymentRequest req);

    @Description("ReBQ Retrieve details about a payment made against the delinquent account")
    RetrievePaymentResponse retrievePayment(RetrievePaymentRequest req);
}