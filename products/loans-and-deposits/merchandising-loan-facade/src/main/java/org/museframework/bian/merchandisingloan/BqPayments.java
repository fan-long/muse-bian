package org.museframework.bian.merchandisingloan;

import org.museframework.bian.merchandisingloan.dto.ExchangePaymentsRequest;
import org.museframework.bian.merchandisingloan.dto.ExchangePaymentsResponse;
import org.museframework.bian.merchandisingloan.dto.InitiatePaymentsRequest;
import org.museframework.bian.merchandisingloan.dto.InitiatePaymentsResponse;
import org.museframework.bian.merchandisingloan.dto.RetrievePaymentsRequest;
import org.museframework.bian.merchandisingloan.dto.RetrievePaymentsResponse;
import org.museframework.bian.merchandisingloan.dto.UpdatePaymentsRequest;
import org.museframework.bian.merchandisingloan.dto.UpdatePaymentsResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@GenericDomain(name="MerchandisingLoan", group="Payments")
public interface BqPayments {
    @GenericDtxEndpoint
    @Description("EcBQ Accept, verify, etc. aspects of Payments processing")
    ExchangePaymentsResponse exchangePayments(ExchangePaymentsRequest req);

    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new Payments")
    InitiatePaymentsResponse initiatePayments(InitiatePaymentsRequest req);

    @Description("ReBQ Retrieve details about any aspect of Payments")
    RetrievePaymentsResponse retrievePayments(RetrievePaymentsRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Payments")
    UpdatePaymentsResponse updatePayments(UpdatePaymentsRequest req);
}