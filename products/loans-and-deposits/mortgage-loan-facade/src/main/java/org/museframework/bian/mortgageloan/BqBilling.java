package org.museframework.bian.mortgageloan;

import org.museframework.bian.mortgageloan.dto.ExchangeBillingRequest;
import org.museframework.bian.mortgageloan.dto.ExchangeBillingResponse;
import org.museframework.bian.mortgageloan.dto.InitiateBillingRequest;
import org.museframework.bian.mortgageloan.dto.InitiateBillingResponse;
import org.museframework.bian.mortgageloan.dto.RetrieveBillingRequest;
import org.museframework.bian.mortgageloan.dto.RetrieveBillingResponse;
import org.museframework.bian.mortgageloan.dto.UpdateBillingRequest;
import org.museframework.bian.mortgageloan.dto.UpdateBillingResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@GenericDomain(name="MortgageLoan", group="Billing")
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