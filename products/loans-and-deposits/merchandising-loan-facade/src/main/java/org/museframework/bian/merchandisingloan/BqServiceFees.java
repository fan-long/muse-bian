package org.museframework.bian.merchandisingloan;

import org.museframework.bian.merchandisingloan.dto.ExchangeServiceFeesRequest;
import org.museframework.bian.merchandisingloan.dto.ExchangeServiceFeesResponse;
import org.museframework.bian.merchandisingloan.dto.InitiateServiceFeesRequest;
import org.museframework.bian.merchandisingloan.dto.InitiateServiceFeesResponse;
import org.museframework.bian.merchandisingloan.dto.RequestServiceFeesRequest;
import org.museframework.bian.merchandisingloan.dto.RequestServiceFeesResponse;
import org.museframework.bian.merchandisingloan.dto.RetrieveServiceFeesRequest;
import org.museframework.bian.merchandisingloan.dto.RetrieveServiceFeesResponse;
import org.museframework.bian.merchandisingloan.dto.UpdateServiceFeesRequest;
import org.museframework.bian.merchandisingloan.dto.UpdateServiceFeesResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@GenericDomain(name="MerchandisingLoan", group="ServiceFees")
public interface BqServiceFees {
    @GenericDtxEndpoint
    @Description("EcBQ Accept, verify, etc. aspects of Fees processing")
    ExchangeServiceFeesResponse exchangeServiceFees(ExchangeServiceFeesRequest req);

    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new Fees")
    InitiateServiceFeesResponse initiateServiceFees(InitiateServiceFeesRequest req);

    @Description("ReBQ Retrieve details about any aspect of Fees")
    RetrieveServiceFeesResponse retrieveServiceFees(RetrieveServiceFeesRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention or a decision with respect to Fees")
    RequestServiceFeesResponse requestServiceFees(RequestServiceFeesRequest req);

    @GenericDtxEndpoint
    @Description("Update details relating to Fees")
    UpdateServiceFeesResponse updateServiceFees(UpdateServiceFeesRequest req);
}