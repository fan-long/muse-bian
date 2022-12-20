package org.museframework.bian.fiduciaryagreement;

import org.museframework.bian.fiduciaryagreement.dto.ExchangeFeesRequest;
import org.museframework.bian.fiduciaryagreement.dto.ExchangeFeesResponse;
import org.museframework.bian.fiduciaryagreement.dto.RequestFeesRequest;
import org.museframework.bian.fiduciaryagreement.dto.RequestFeesResponse;
import org.museframework.bian.fiduciaryagreement.dto.RetrieveFeesRequest;
import org.museframework.bian.fiduciaryagreement.dto.RetrieveFeesResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility  within Fiduciary Agreement.  Example: Perform the scheduled (e.g. statements, standing orders) and ad-hoc/requested (e.g. balance inquiries, fund transfers) fulfillment tasks for a customer current account facility.")
@GenericDomain(name="FiduciaryAgreement", group="Fees")
public interface BqFees {
    @GenericDtxEndpoint
    @Description("EcBQ Accept, verify, etc. aspects of Fees processing")
    ExchangeFeesResponse exchangeFees(ExchangeFeesRequest req);

    @Description("ReBQ Retrieve details about any aspect of Fees")
    RetrieveFeesResponse retrieveFees(RetrieveFeesRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention or a decision with respect to Fees")
    RequestFeesResponse requestFees(RequestFeesRequest req);
}