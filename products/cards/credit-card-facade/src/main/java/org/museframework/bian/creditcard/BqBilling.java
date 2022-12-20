package org.museframework.bian.creditcard;

import org.museframework.bian.creditcard.dto.ExecuteBillingRequest;
import org.museframework.bian.creditcard.dto.ExecuteBillingResponse;
import org.museframework.bian.creditcard.dto.RetrieveBillingRequest;
import org.museframework.bian.creditcard.dto.RetrieveBillingResponse;
import org.museframework.bian.creditcard.dto.UpdateBillingRequest;
import org.museframework.bian.creditcard.dto.UpdateBillingResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@GenericDomain(name="CreditCard", group="Billing")
public interface BqBilling {
    @GenericDtxEndpoint
    @Description("UpBQ Update details of a billing transaction (invoice)")
    UpdateBillingResponse updateBilling(UpdateBillingRequest req);

    @GenericDtxEndpoint
    @Description("ExBQ Execute the billing process for a card account")
    ExecuteBillingResponse executeBilling(ExecuteBillingRequest req);

    @Description("ReBQ Retrieve details about a billing process for a card account")
    RetrieveBillingResponse retrieveBilling(RetrieveBillingRequest req);
}