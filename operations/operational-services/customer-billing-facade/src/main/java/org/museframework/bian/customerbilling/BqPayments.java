package org.museframework.bian.customerbilling;

import org.museframework.bian.customerbilling.dto.InitiatePaymentsRequest;
import org.museframework.bian.customerbilling.dto.InitiatePaymentsResponse;
import org.museframework.bian.customerbilling.dto.RetrievePaymentsRequest;
import org.museframework.bian.customerbilling.dto.RetrievePaymentsResponse;
import org.museframework.bian.customerbilling.dto.UpdatePaymentsRequest;
import org.museframework.bian.customerbilling.dto.UpdatePaymentsResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The main worsteps to be followed in th eexecution of the procedure  Examples: Invoice generation")
@GenericDomain(name="CustomerBilling", group="Payments")
public interface BqPayments {
    @GenericDtxEndpoint
    @Description("InBQ Initiate payment processing against a billing transaction")
    InitiatePaymentsResponse initiatePayments(InitiatePaymentsRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update payment details for a billing transaction")
    UpdatePaymentsResponse updatePayments(UpdatePaymentsRequest req);

    @Description("ReBQ Retrieve payment processing details")
    RetrievePaymentsResponse retrievePayments(RetrievePaymentsRequest req);
}