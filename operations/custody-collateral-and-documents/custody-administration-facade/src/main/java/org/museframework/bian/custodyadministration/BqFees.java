package org.museframework.bian.custodyadministration;

import org.museframework.bian.custodyadministration.dto.ExchangeFeesRequest;
import org.museframework.bian.custodyadministration.dto.ExchangeFeesResponse;
import org.museframework.bian.custodyadministration.dto.InitiateFeesRequest;
import org.museframework.bian.custodyadministration.dto.InitiateFeesResponse;
import org.museframework.bian.custodyadministration.dto.RetrieveFeesRequest;
import org.museframework.bian.custodyadministration.dto.RetrieveFeesResponse;
import org.museframework.bian.custodyadministration.dto.UpdateFeesRequest;
import org.museframework.bian.custodyadministration.dto.UpdateFeesResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility  within Custody Administration.  Example: Perform the scheduled (e.g. statements, standing orders) and ad-hoc/requested (e.g. balance inquiries, fund transfers) fulfillment tasks for a customer current account facility.")
@GenericDomain(name="CustodyAdministration", group="Fees")
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
    @Description("UpBQ Update details relating to Fees")
    UpdateFeesResponse updateFees(UpdateFeesRequest req);
}