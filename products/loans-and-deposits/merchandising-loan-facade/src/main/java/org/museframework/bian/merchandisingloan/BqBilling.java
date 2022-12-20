package org.museframework.bian.merchandisingloan;

import org.museframework.bian.merchandisingloan.dto.ExchangeBillingRequest;
import org.museframework.bian.merchandisingloan.dto.ExchangeBillingResponse;
import org.museframework.bian.merchandisingloan.dto.InitiateBillingRequest;
import org.museframework.bian.merchandisingloan.dto.InitiateBillingResponse;
import org.museframework.bian.merchandisingloan.dto.RetrieveBillingRequest;
import org.museframework.bian.merchandisingloan.dto.RetrieveBillingResponse;
import org.museframework.bian.merchandisingloan.dto.UpdateBillingRequest;
import org.museframework.bian.merchandisingloan.dto.UpdateBillingResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@GenericDomain(name="MerchandisingLoan", group="Billing")
public interface BqBilling {
    @GenericDtxEndpoint
    @Description("EcBQ Accept, verify, etc. aspects of Billing processing")
    ExchangeBillingResponse exchangeBilling(ExchangeBillingRequest req);

    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new Billing")
    InitiateBillingResponse initiateBilling(InitiateBillingRequest req);

    @Description("ReBQ Retrieve details about any aspect of Billing")
    RetrieveBillingResponse retrieveBilling(RetrieveBillingRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Billing")
    UpdateBillingResponse updateBilling(UpdateBillingRequest req);
}