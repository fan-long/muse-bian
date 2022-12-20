package org.museframework.bian.corporatelease;

import org.museframework.bian.corporatelease.dto.ExchangeFulfillRequest;
import org.museframework.bian.corporatelease.dto.ExchangeFulfillResponse;
import org.museframework.bian.corporatelease.dto.ExecuteFulfillRequest;
import org.museframework.bian.corporatelease.dto.ExecuteFulfillResponse;
import org.museframework.bian.corporatelease.dto.InitiateFulfillRequest;
import org.museframework.bian.corporatelease.dto.InitiateFulfillResponse;
import org.museframework.bian.corporatelease.dto.RequestFulfillRequest;
import org.museframework.bian.corporatelease.dto.RequestFulfillResponse;
import org.museframework.bian.corporatelease.dto.RetrieveFulfillRequest;
import org.museframework.bian.corporatelease.dto.RetrieveFulfillResponse;
import org.museframework.bian.corporatelease.dto.UpdateFulfillRequest;
import org.museframework.bian.corporatelease.dto.UpdateFulfillResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility  within Corporate Lease.  Example: Perform the scheduled (e.g. statements, standing orders) and ad-hoc/requested (e.g. balance inquiries, fund transfers) fulfillment tasks for a customer current account facility.")
@GenericDomain(name="CorporateLease", group="Fulfill")
public interface BqFulfill {
    @GenericDtxEndpoint
    @Description("EcBQ Accept, verify, etc. aspects of Fulfill processing")
    ExchangeFulfillResponse exchangeFulfill(ExchangeFulfillRequest req);

    @GenericDtxEndpoint
    @Description("ExBQ Execute an available automated action for Fulfill")
    ExecuteFulfillResponse executeFulfill(ExecuteFulfillRequest req);

    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new Fulfill")
    InitiateFulfillResponse initiateFulfill(InitiateFulfillRequest req);

    @Description("ReBQ Retrieve details about any aspect of Fulfill")
    RetrieveFulfillResponse retrieveFulfill(RetrieveFulfillRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention or a decision with respect to Fulfill")
    RequestFulfillResponse requestFulfill(RequestFulfillRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Fulfill")
    UpdateFulfillResponse updateFulfill(UpdateFulfillRequest req);
}