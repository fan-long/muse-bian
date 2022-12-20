package org.museframework.bian.syndicatedloan;

import org.museframework.bian.syndicatedloan.dto.ExchangeOriginationRequest;
import org.museframework.bian.syndicatedloan.dto.ExchangeOriginationResponse;
import org.museframework.bian.syndicatedloan.dto.RequestOriginationRequest;
import org.museframework.bian.syndicatedloan.dto.RequestOriginationResponse;
import org.museframework.bian.syndicatedloan.dto.RetrieveOriginationRequest;
import org.museframework.bian.syndicatedloan.dto.RetrieveOriginationResponse;
import org.museframework.bian.syndicatedloan.dto.UpdateOriginationRequest;
import org.museframework.bian.syndicatedloan.dto.UpdateOriginationResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility  within Syndicated Loan.  Example: Perform the scheduled (e.g. statements, standing orders) and ad-hoc/requested (e.g. balance inquiries, fund transfers) fulfillment tasks for a customer current account facility.")
@GenericDomain(name="SyndicatedLoan", group="Origination")
public interface BqOrigination {
    @GenericDtxEndpoint
    @Description("EcBQ Accept, verify, etc. aspects of Origination processing")
    ExchangeOriginationResponse exchangeOrigination(ExchangeOriginationRequest req);

    @Description("ReBQ Retrieve details about any aspect of Origination")
    RetrieveOriginationResponse retrieveOrigination(RetrieveOriginationRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention or a decision with respect to Origination")
    RequestOriginationResponse requestOrigination(RequestOriginationRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Origination")
    UpdateOriginationResponse updateOrigination(UpdateOriginationRequest req);
}