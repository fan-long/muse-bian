package org.museframework.bian.leasing;

import org.museframework.bian.leasing.dto.ExchangeFeesRequest;
import org.museframework.bian.leasing.dto.ExchangeFeesResponse;
import org.museframework.bian.leasing.dto.InitiateFeesRequest;
import org.museframework.bian.leasing.dto.InitiateFeesResponse;
import org.museframework.bian.leasing.dto.RequestFeesRequest;
import org.museframework.bian.leasing.dto.RequestFeesResponse;
import org.museframework.bian.leasing.dto.RetrieveFeesRequest;
import org.museframework.bian.leasing.dto.RetrieveFeesResponse;
import org.museframework.bian.leasing.dto.UpdateFeesRequest;
import org.museframework.bian.leasing.dto.UpdateFeesResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility  within Leasing.  Example: Perform the scheduled (e.g. statements, standing orders) and ad-hoc/requested (e.g. balance inquiries, fund transfers) fulfillment tasks for a customer current account facility.")
@GenericDomain(name="Leasing", group="Fees")
public interface BqFees {
    @GenericDtxEndpoint
    @Description("EcBQ Accept, verify, etc. aspects of Fees processing")
    ExchangeFeesResponse exchangeFees(ExchangeFeesRequest req);

    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new Fees")
    InitiateFeesResponse initiateFees(InitiateFeesRequest req);

    @Description("ReBQ Retrieve details about any aspect of Fees")
    RetrieveFeesResponse retrieveFees(RetrieveFeesRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention or a decision with respect to Fees")
    RequestFeesResponse requestFees(RequestFeesRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Fees")
    UpdateFeesResponse updateFees(UpdateFeesRequest req);
}